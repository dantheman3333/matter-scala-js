package body

import constraint.Constraint
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|
import geometry.{Bounds, Vector}
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

/**
  * Created by Dan on 3/24/2017.
  */

@js.native
trait WorldDefinition extends CompositeDefinition {
  var gravity: Vector = js.native
  var bounds: Bounds = js.native
}
object WorldDefinition extends WorldDefinitionBuilder(noOpts)
class WorldDefinitionBuilder(val dict:OptMap) extends JSOptionBuilder[WorldDefinition, WorldDefinitionBuilder](new WorldDefinitionBuilder(_)) {
  def gravity(v:Vector) = jsOpt("gravity", v)
  def bounds(v:Bounds) = jsOpt("bounds", v)
}

@js.native
@JSGlobal("Matter.World")
class World extends Composite {
  var gravity: Vector = js.native
  var bounds: Bounds = js.native
}

@js.native
@JSGlobal("Matter.World")
object World extends js.Object {
  def add(world: World, body: Body | js.Array[Body] | Composite | js.Array[Composite] | Constraint | js.Array[Constraint]): World = js.native
  def addBody(world: World, body: Body): World = js.native
  def addComposite(world: World, composite: Composite): World = js.native
  def addConstraint(world: World, constraint: Constraint): World = js.native
  def clear(world: World, keepStatic: Boolean): Unit = js.native
  def create(options: WorldDefinition): World = js.native
  def create(): World = js.native
}
