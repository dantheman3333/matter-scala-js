package core

import constraint.{Constraint, MouseConstraintOptions}
import geometry.Vector
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by Dan on 3/26/2017.
  */

@js.native
@JSGlobal("Matter.MouseConstraint")
class MouseConstraint extends Constraint {
}

@js.native
@JSGlobal("Matter.MouseConstraint")
object MouseConstraint extends Constraint {
  def create(engine: Engine, options: MouseConstraintOptions): MouseConstraint = js.native
}

@js.native
trait MousePoint extends js.Object
object MousePoint extends MousePointBuilder(noOpts)
class MousePointBuilder(val dict:OptMap) extends JSOptionBuilder[MousePoint, MousePointBuilder](new MousePointBuilder(_)) {
  def x(v:Double) = jsOpt("x", v)
  def y(v:Double) = jsOpt("y", v)
}

@js.native
@JSGlobal("Matter.Mouse")
class Mouse extends js.Object {
  var element: HTMLElement = js.native
  var absolute: MousePoint = js.native
  var position: MousePoint = js.native
  var mousedownPosition: MousePoint = js.native
  var mouseupPosition: MousePoint = js.native
  var offset: MousePoint = js.native
  var scale: MousePoint = js.native
  var wheelDelta: Double = js.native
  var button: Double = js.native
  var pixelRatio: Double = js.native
}

@js.native
@JSGlobal("Matter.Mouse")
object Mouse extends js.Object {
  def create(element: HTMLElement): Mouse = js.native
  def setElement(mouse: Mouse, element: HTMLElement): Unit = js.native
  def clearSourceEvents(mouse: Mouse): Unit = js.native
  def setOffset(mouse: Mouse, offset: Vector): Unit = js.native
  def setScale(mouse: Mouse, scale: Vector): Unit = js.native
}
