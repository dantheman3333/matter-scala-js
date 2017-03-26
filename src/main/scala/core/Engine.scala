package core

import body.World
import collision.Grid
import org.scalajs.dom.raw.HTMLElement
import render.Render
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

/**
  * Created by Dan on 3/24/2017.
  */


@js.native
trait EngineOptions extends js.Object
object EngineOptions extends EngineOptionsBuilder(noOpts)
class EngineOptionsBuilder(val dict:OptMap) extends JSOptionBuilder[EngineOptions, EngineOptionsBuilder](new EngineOptionsBuilder(_)) {
  def positionIterations(v:Double) = jsOpt("positionIterations", v)
  def velocityIterations(v:Double) = jsOpt("velocityIterations", v)
  def constraintIterations(v:Double) = jsOpt("constraintIterations", v)
  def enableSleeping(v:Boolean) = jsOpt("enableSleeping", v)
  def timing(v:EngineTimingOptions) = jsOpt("timing", v)
  def grid(v:Grid) = jsOpt("grid", v)
  def world(v:World) = jsOpt("world", v)
}

@js.native
trait EngineTimingOptions extends js.Object {
  var timeScale: Double = js.native
  var timestamp: Double = js.native
}
object EngineTimingOptions extends EngineTimingOptionsBuilder(noOpts)
class EngineTimingOptionsBuilder(val dict:OptMap) extends JSOptionBuilder[EngineTimingOptions, EngineTimingOptionsBuilder](new EngineTimingOptionsBuilder(_)) {
  def timeScale(v:Double) = jsOpt("timeScale", v)
  def timestamp(v:Double) = jsOpt("timestamp", v)
}

@js.native
@JSGlobal("Matter.Engine")
class Engine extends js.Object {
  var broadphase: Grid = js.native
  var constraintIterations: Double = js.native
  var enabled: Boolean = js.native
  var enableSleeping: Boolean = js.native
  var positionIterations: Double = js.native
  var render: Render = js.native
  var timing: EngineTimingOptions = js.native
  var velocityIterations: Double = js.native
  var world: World = js.native
}

@js.native
@JSGlobal("Matter.Engine")
object Engine extends js.Object {
  def clear(engine: Engine): Unit = js.native
  def create(options: EngineOptions = ???): Engine = js.native
  def merge(engineA: Engine, engineB: Engine): Unit = js.native
  def update(engine: Engine, delta: Double = ???, correction: Double = ???): Engine = js.native
  def run(engine: Engine): Unit = js.native
}
