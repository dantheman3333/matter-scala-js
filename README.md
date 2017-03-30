# matter-scala-js
A scala-js facade for the matter-js physics engine

This project was created with the help of [adbrain's TypeScript definitions for matter-js](https://github.com/slavomirvojacek/adbrain-typescript-definitions/blob/master/matter-js/matter-js.d.ts) and [sjrd's TypeScript conversion tool](https://github.com/sjrd/scala-js-ts-importer).

I am unsure if I will continue working on this - seems unnecessary/unwise when you have the power to use Java and Scala physics engines - as it should not tie into the view part of MVC. Though, matter-js's debug renderer is mostly implemented.   

Please feel free to fork if you would like to play around with or improve it. 

Example ([edited version of this](https://github.com/liabru/matter-js/blob/master/examples/mixed.js)): 

    val world = World.create
    val engine = Engine.create(EngineOptions.world(world))
    val renderer = Render.create{
      RenderOptions.element(document.body)
                   .engine(engine)
                   .options(RendererOptions.background("white")
                                           .enabled(true)
                                           .wireframes(false)
                                           .width(Math.min(document.documentElement.clientWidth, 800))
                                           .height(Math.min(document.documentElement.clientWidth, 600))
                                           .showAngleIndicator(true))

    }

    val stack = Composites.stack(20, 20, 10, 5, 0, 0, (x: Int, y: Int) => {
      if(Random.nextDouble() < 0.8){
       Bodies.rectangle(x, y, 25 + Random.nextInt((50 - 25) + 1), 25 + Random.nextInt((50 - 25) + 1))
      }else{
        Bodies.rectangle(x, y, 80 + Random.nextInt((120 - 90) + 1), 25 + Random.nextInt((30 - 25) + 1))
      }
    })
    World.add(world, stack)

    for(i <- 1 to 10){
      val num = Random.nextInt(8) + 1
      val sides = if(num == 3) 4 else num
      val poly = Bodies.polygon(100, 100, sides, 25 + Random.nextInt((50 - 25) + 1))
      World.addBody(world, poly)
    }

    val walls = Array(
      Bodies.rectangle(400, 0, 800, 50, ChamferableBodyOptions.isStatic(true)),
      Bodies.rectangle(400, 600, 800, 50, ChamferableBodyOptions.isStatic(true)),
      Bodies.rectangle(800, 300, 50, 600, ChamferableBodyOptions.isStatic(true)),
      Bodies.rectangle(0, 300, 50, 600, ChamferableBodyOptions.isStatic(true))
    )

    walls.foreach(World.addBody(world, _))

    val mouse = Mouse.create(renderer.canvas)
    val mouseConstraint = MouseConstraint.create(engine, MouseConstraintOptions.mouse(mouse))
    World.add(world, mouseConstraint)

    renderer.mouse = mouse

    Engine.run(engine)
    Render.run(renderer)
    
