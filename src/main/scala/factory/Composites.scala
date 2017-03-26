package factory

import body.Composite
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Created by Dan on 3/26/2017.
  */


@js.native
@JSName("Matter.Composites")
class Composites extends js.Object {
  def newtonsCradle(xx: Double, yy: Double, number: Double, size: Double, length: Double): Composite = js.native
}

@js.native
@JSName("Matter.Composites")
object Composites extends js.Object {
  def car(xx: Double, yy: Double, width: Double, height: Double, wheelSize: Double): Composite = js.native
  def chain(composite: Composite, xOffsetA: Double, yOffsetA: Double, xOffsetB: Double, yOffsetB: Double, options: js.Any): Composite = js.native
  def mesh(composite: Composite, columns: Double, rows: Double, crossBrace: Boolean, options: js.Any): Composite = js.native
  def pyramid(xx: Double, yy: Double, columns: Double, rows: Double, columnGap: Double, rowGap: Double, callback: js.Function): Composite = js.native
  def softBody(xx: Double, yy: Double, columns: Double, rows: Double, columnGap: Double, rowGap: Double, crossBrace: Boolean, particleRadius: Double, particleOptions: js.Any, constraintOptions: js.Any): Composite = js.native
  def stack(xx: Double, yy: Double, columns: Double, rows: Double, columnGap: Double, rowGap: Double, callback: js.Function): Composite = js.native
}