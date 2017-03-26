package geometry

import body.Body

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.|

/**
  * Created by Dan on 3/24/2017.
  */


@js.native
@JSGlobal("Matter.Vertices")
class Vertices extends js.Object {
}

@js.native
@JSGlobal("Matter.Vertices")
object Vertices extends js.Object {
  def mean(vertices: js.Array[Vector]): js.Array[Vector] = js.native
  def clockwiseSort(vertices: js.Array[Vector]): js.Array[Vector] = js.native
  def isConvex(vertices: js.Array[Vector]): Boolean = js.native
  def hull(vertices: js.Array[Vector]): js.Array[Vector] = js.native
  def area(vertices: js.Array[Vector], signed: Boolean): Double = js.native
  def centre(vertices: js.Array[Vector]): Vector = js.native
  def chamfer(vertices: js.Array[Vector], radius: Double | js.Array[Double], quality: Double, qualityMin: Double, qualityMax: Double): Unit = js.native
  def contains(vertices: js.Array[Vector], point: Vector): Boolean = js.native
  def create(points: js.Array[Vector], body: Body): Unit = js.native
  def fromPath(path: String, body: Body): js.Array[Vector] = js.native
  def inertia(vertices: js.Array[Vector], mass: Double): Double = js.native
  def rotate(vertices: js.Array[Vector], angle: Double, point: Vector): Unit = js.native
  def scale(vertices: js.Array[Vector], scaleX: Double, scaleY: Double, point: Vector): Unit = js.native
  def translate(vertices: js.Array[Vector], vector: Vector, scalar: Double): Unit = js.native
}