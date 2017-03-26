package factory

import body.{Body, BodyOptionSetters, BodyOptions, BodyOptions$}
import geometry.Vector

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|
import org.querki.jsext.{JSOptionBuilder, JSOptionSetter, OptMap, noOpts}

/**
  * Created by Dan on 3/24/2017.
  */

@js.native
trait Chamfer extends js.Object
object Chamfer extends ChamferBuilder(noOpts)
class ChamferBuilder(val dict:OptMap) extends JSOptionBuilder[Chamfer, ChamferBuilder](new ChamferBuilder(_)) {
  def radius(v:Double | js.Array[Double]) = jsOpt("radius", v)
  def quality(v:Double) = jsOpt("quality", v)
  def qualityMin(v:Double) = jsOpt("qualityMin", v)
  def qualityMax(v:Double) = jsOpt("qualityMax", v)
}

@js.native
trait ChamferableBodyOptions extends BodyOptions
object ChamferableBodyOptions extends ChamferableBodyDefinitionsBuilder(noOpts)
class ChamferableBodyDefinitionsBuilder(val dict: OptMap) extends JSOptionBuilder[ChamferableBodyOptions, ChamferableBodyDefinitionsBuilder](new ChamferableBodyDefinitionsBuilder(_)) with ChamferableBodySetters[ChamferableBodyOptions, ChamferableBodyDefinitionsBuilder]
trait ChamferableBodySetters[T <: js.Object, B <: JSOptionBuilder[T,_]] extends BodyOptionSetters[T, B] {
  def chamfer(v: Chamfer) = jsOpt("chamfer", v)
}

@js.native
@JSGlobal("Matter.Bodies")
class Bodies extends js.Object {
}

@js.native
@JSGlobal("Matter.Bodies")
object Bodies extends js.Object {
  def circle(x: Double, y: Double, radius: Double, options: BodyOptions = ???, maxSides: Double = ???): Body = js.native
  def polygon(x: Double, y: Double, sides: Double, radius: Double, options: ChamferableBodyOptions = ???): Body = js.native
  def rectangle(x: Double, y: Double, width: Double, height: Double, options: ChamferableBodyOptions = ???): Body = js.native
  def trapezoid(x: Double, y: Double, width: Double, height: Double, slope: Double, options: ChamferableBodyOptions = ???): Body = js.native
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[js.Array[Vector]], options: BodyOptions = ???, flagInternal: Boolean = ???, removeCollinear: Double = ???, minimumArea: Double = ???): Body = js.native
}