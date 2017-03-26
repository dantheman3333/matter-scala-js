package geometry

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by Dan on 3/24/2017.
  */

@js.native
@JSGlobal("Matter.Bounds")
class Bounds extends js.Object

@js.native
@JSGlobal("Matter.Bounds")
object Bounds extends js.Object {
  def create(vertices: Vertices): Bounds = js.native
  def update(bounds: Bounds, vertices: Vertices, velocity: Vector): Unit = js.native
  def contains(bounds: Bounds, point: Vector): Boolean = js.native
  def overlaps(boundsA: Bounds, boundsB: Bounds): Boolean = js.native
  def translate(bounds: Bounds, vector: Vector): Unit = js.native
  def shift(bounds: Bounds, position: Vector): Unit = js.native
}