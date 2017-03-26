package geometry

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by Dan on 3/24/2017.
  */

@js.native
@JSGlobal("Matter.Vector")
class Vector extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
}

@js.native
@JSGlobal("Matter.Vector")
object Vector extends js.Object {
  def create(x: Double = ???, y: Double = ???): Vector = js.native
  def clone(vector: Vector): Vector = js.native
  def cross3(vectorA: Vector, vectorB: Vector, vectorC: Vector): Double = js.native
  def add(vectorA: Vector, vectorB: Vector, output: Vector = ???): Vector = js.native
  def angle(vectorA: Vector, vectorB: Vector): Double = js.native
  def cross(vectorA: Vector, vectorB: Vector): Double = js.native
  def div(vector: Vector, scalar: Double): Vector = js.native
  def dot(vectorA: Vector, vectorB: Vector): Number = js.native
  def magnitude(vector: Vector): Double = js.native
  def magnitudeSquared(vector: Vector): Double = js.native
  def mult(vector: Vector, scalar: Double): Vector = js.native
  def neg(vector: Vector): Vector = js.native
  def normalise(vector: Vector): Vector = js.native
  def perp(vector: Vector, negate: Boolean = ???): Vector = js.native
  def rotate(vector: Vector, angle: Double): Vector = js.native
  def rotateAbout(vector: Vector, angle: Double, point: Vector, output: Vector = ???): Vector = js.native
  def sub(vectorA: Vector, vectorB: Vector, optional: Vector = ???): Vector = js.native
}