package constraint

import body.Body
import geometry.Vector
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

/**
  * Created by Dan on 3/24/2017.
  */

@js.native
trait ConstraintDefinition extends js.Object
object ConstraintDefinition extends ConstraintDefinitionBuilder(noOpts)
class ConstraintDefinitionBuilder(val dict:OptMap) extends JSOptionBuilder[ConstraintDefinition, ConstraintDefinitionBuilder](new ConstraintDefinitionBuilder(_)) {
  def bodyA(v:Body) = jsOpt("bodyA", v)
  def bodyB(v:Body) = jsOpt("bodyB", v)
  def id(v:Double) = jsOpt("id", v)
  def label(v:String) = jsOpt("label", v)
  def length(v:Double) = jsOpt("length", v)
  def pointA(v:Vector) = jsOpt("pointA", v)
  def pointB(v:Vector) = jsOpt("pointB", v)
  def render(v:ConstraintRenderDefinition) = jsOpt("render", v)
  def stiffness(v:Double) = jsOpt("stiffness", v)
  def `type`(v:String) = jsOpt("`type`", v)
}

@js.native
trait ConstraintRenderDefinition extends js.Object {
  var lineWidth: Double = js.native
  var strokeStyle: String = js.native
  var visible: Boolean = js.native
}
object ConstraintRenderDefinition extends ConstraintRenderDefinitionBuilder(noOpts)
class ConstraintRenderDefinitionBuilder(val dict:OptMap) extends JSOptionBuilder[ConstraintRenderDefinition, ConstraintRenderDefinitionBuilder](new ConstraintRenderDefinitionBuilder(_)) {
  def lineWidth(v:Double) = jsOpt("lineWidth", v)
  def strokeStyle(v:String) = jsOpt("strokeStyle", v)
  def visible(v:Boolean) = jsOpt("visible", v)
}

@js.native
@JSGlobal("Matter.Constraint")
class Constraint extends js.Object {
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var id: Double = js.native
  var label: String = js.native
  var length: Double = js.native
  var pointA: Vector = js.native
  var pointB: Vector = js.native
  var render: ConstraintRenderDefinition = js.native
  var stiffness: Double = js.native
  var `type`: String = js.native
}

@js.native
@JSGlobal("Matter.Constraint")
object Constraint extends js.Object {
  def create(options: ConstraintDefinition): Constraint = js.native
}