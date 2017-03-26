package body

/**
  * Created by Dan on 3/24/2017.
  */

import constraint.Constraint
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}
import geometry.Vector

@js.native
trait CompositeDefinition extends js.Object
object CompositeDefinition extends CompositeDefinitionBuilder(noOpts)
class CompositeDefinitionBuilder(val dict:OptMap) extends JSOptionBuilder[CompositeDefinition, CompositeDefinitionBuilder](new CompositeDefinitionBuilder(_)) {
  def bodies(v:js.Array[Body]) = jsOpt("bodies", v)
  def composites(v:js.Array[Composite]) = jsOpt("composites", v)
  def constraints(v:js.Array[Constraint]) = jsOpt("constraints", v)
  def id(v:Double) = jsOpt("id", v)
  def isModified(v:Boolean) = jsOpt("isModified", v)
  def label(v:String) = jsOpt("label", v)
  def parent(v:Composite) = jsOpt("parent", v)
  def `type`(v:String) = jsOpt("`type`", v)
}

@js.native
@JSGlobal("Matter.Composite")
class Composite extends js.Object {
  var bodies: js.Array[Body] = js.native
  var composites: js.Array[Composite] = js.native
  var constraints: js.Array[Constraint] = js.native
  var id: Double = js.native
  var isModified: Boolean = js.native
  var label: String = js.native
  var parent: Composite = js.native
  var `type`: String = js.native
}

@js.native
@JSGlobal("Matter.Composite")
object Composite extends js.Object {
  def add(composite: Composite, `object`: Body | Composite | Constraint): Composite = js.native
  def allBodies(composite: Composite): js.Array[Body] = js.native
  def allComposites(composite: Composite): js.Array[Composite] = js.native
  def allConstraints(composite: Composite): js.Array[Composite] = js.native
  def clear(composite: Composite, keepStatic: Boolean, deep: Boolean = ???): Unit = js.native
  def create(options: CompositeDefinition = ???): Composite = js.native
  def get(composite: Composite, id: Double, `type`: String): Body | Composite | Constraint = js.native
  def move(compositeA: Composite, objects: js.Array[Body | Composite | Constraint], compositeB: Composite): Composite = js.native
  def rebase(composite: Composite): Composite = js.native
  def remove(composite: Composite, `object`: Body | Composite | Constraint, deep: Boolean = ???): Composite = js.native
  def setModified(composite: Composite, isModified: Boolean, updateParents: Boolean = ???, updateChildren: Boolean = ???): Unit = js.native
  def translate(composite: Composite, translation: Vector, recursive: Boolean = ???): Unit = js.native
  def rotate(composite: Composite, rotation: Double, point: Vector, recursive: Boolean = ???): Unit = js.native
  def scale(composite: Composite, scaleX: Double, scaleY: Double, point: Vector, recursive: Boolean = ???): Unit = js.native
}