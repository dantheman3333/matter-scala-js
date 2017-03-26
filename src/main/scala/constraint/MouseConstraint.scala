package constraint

import body.Body
import core.Mouse
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by Dan on 3/26/2017.
  */


@js.native
trait CollisionFilter extends js.Object
object CollisionFilter extends CollisionFilterBuilder(noOpts)
class CollisionFilterBuilder(val dict:OptMap) extends JSOptionBuilder[CollisionFilter, CollisionFilterBuilder](new CollisionFilterBuilder(_)) {
  def category(v:Double) = jsOpt("category", v)
  def mask(v:Double) = jsOpt("mask", v)
  def group(v:Double) = jsOpt("group", v)
}

@js.native
trait MouseConstraintOptions extends js.Object
object MouseConstraintOptions extends MouseConstraintDefinitionBuilder(noOpts)
class MouseConstraintDefinitionBuilder(val dict:OptMap) extends JSOptionBuilder[MouseConstraintOptions, MouseConstraintDefinitionBuilder](new MouseConstraintDefinitionBuilder(_)) {
  def constraint(v:Constraint) = jsOpt("constraint", v)
  def collisionFilter(v:CollisionFilter) = jsOpt("collisionFilter", v)
  def body(v:Body) = jsOpt("body", v)
  def mouse(v:Mouse) = jsOpt("mouse", v)
  def `type`(v:String) = jsOpt("`type`", v)
}

@js.native
@JSGlobal("Matter.MouseConstraint")
class MouseConstraint extends js.Object {
  var constraint: Constraint = js.native
  var collisionFilter: CollisionFilter = js.native
  var body: Body = js.native
  var mouse: Mouse = js.native
  var `type`: String = js.native
}

