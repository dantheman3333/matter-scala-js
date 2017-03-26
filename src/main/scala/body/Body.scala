package body

import geometry.{Bounds, Vector}

import scala.scalajs.js
import js.annotation._
import org.querki.jsext.{JSOptionBuilder, JSOptionSetter, OptMap, noOpts}

/**
  * Created by Dan on 3/24/2017.
  */

@js.native
trait BodyOptions extends js.Object
object BodyOptions extends BodyOptionBuilder(noOpts)
class BodyOptionBuilder(val dict:OptMap) extends JSOptionBuilder[BodyOptions, BodyOptionBuilder](new BodyOptionBuilder(_)) with BodyOptionSetters[BodyOptions, BodyOptionBuilder]
trait BodyOptionSetters[T <: js.Object, B <: JSOptionBuilder[T,_]] extends JSOptionSetter[T, B] {
  def angle(v:Double) = jsOpt("angle", v)
  def angularSpeed(v:Double) = jsOpt("angularSpeed", v)
  def area(v:Double) = jsOpt("area", v)
  def axes(v:js.Array[Vector]) = jsOpt("axes", v)
  def bounds(v:Bounds) = jsOpt("bounds", v)
  def density(v:Double) = jsOpt("density", v)
  def force(v:Vector) = jsOpt("force", v)
  def friction(v:Double) = jsOpt("friction", v)
  def id(v:Double) = jsOpt("id", v)
  def inertia(v:Double) = jsOpt("inertia", v)
  def inverseInertia(v:Double) = jsOpt("inverseInertia", v)
  def isSensor(v:Boolean) = jsOpt("isSensor", v)
  def isStatic(v:Boolean) = jsOpt("isStatic", v)
  def label(v:String) = jsOpt("label", v)
  def mass(v:Double) = jsOpt("mass", v)
  def motion(v:Double) = jsOpt("motion", v)
  def position(v:Vector) = jsOpt("position", v)
  def render(v:BodyRenderOptions) = jsOpt("render", v)
  def restitution(v:Double) = jsOpt("restitution", v)
  def sleepThreshold(v:Double) = jsOpt("sleepThreshold", v)
  def slop(v:Double) = jsOpt("slop", v)
  def speed(v:Double) = jsOpt("speed", v)
  def timeScale(v:Double) = jsOpt("timeScale", v)
  def torque(v:Double) = jsOpt("torque", v)
  def `type`(v:String) = jsOpt("`type`", v)
  def velocity(v:Vector) = jsOpt("velocity", v)
  def vertices(v:js.Array[Vector]) = jsOpt("vertices", v)
  def parts(v:js.Array[Body]) = jsOpt("parts", v)
  def parent(v:Body) = jsOpt("parent", v)
  def frictionStatic(v:Double) = jsOpt("frictionStatic", v)
  def collisionFilter(v:BodyCollisionFilter) = jsOpt("collisionFilter", v)
}

@js.native
trait BodyCollisionFilter extends js.Object
object BodyCollisionFilter extends BodyCollisionFilterBuilder(noOpts)
class BodyCollisionFilterBuilder(val dict:OptMap) extends JSOptionBuilder[BodyCollisionFilter, BodyCollisionFilterBuilder](new BodyCollisionFilterBuilder(_)) {
  def category(v:Double) = jsOpt("category", v)
  def mask(v:Double) = jsOpt("mask", v)
  def group(v:Double) = jsOpt("group", v)
}

@js.native
trait BodyRenderOptions extends js.Object
object BodyRenderOptions extends BodyRenderOptionsBuilder(noOpts)
class BodyRenderOptionsBuilder(val dict: OptMap) extends JSOptionBuilder[BodyRenderOptions, BodyRenderOptionsBuilder](new BodyRenderOptionsBuilder(_)){
  def visible(v: Boolean) = jsOpt("visible", v)
  def sprite(v: BodyRenderOptionsSprite) = jsOpt("sprite", v)
  def fillStyle(v: String) = jsOpt("fillStyle", v)
  def lineWidth(v: Double) = jsOpt("lineWidth", v)
  def strokeStyle(v: String) = jsOpt("strokeStyle", v)
  def opacity(v: String) = jsOpt("opacity", v)
}

@js.native
trait BodyRenderOptionsSprite extends js.Object
object BodyRenderOptionsSprite extends BodyRenderOptionsSpriteBuilder(noOpts)
class BodyRenderOptionsSpriteBuilder(val dict: OptMap) extends JSOptionBuilder[BodyRenderOptionsSprite, BodyRenderOptionsSpriteBuilder](new BodyRenderOptionsSpriteBuilder(_)){
  def texture(v: String) = jsOpt("texture", v)
  def xScale(v: Double) = jsOpt("xScale", v)
  def yScale(v: Double) = jsOpt("yScale", v)
}


@js.native
@JSGlobal("Matter.Body")
class Body extends js.Object {
  var angle: Double = js.native
  var angularSpeed: Double = js.native
  var angularVelocity: Double = js.native
  var area: Double = js.native
  var axes: js.Array[Vector] = js.native
  var bounds: Bounds = js.native
  var density: Double = js.native
  var force: Vector = js.native
  var friction: Double = js.native
  var frictionAir: Double = js.native
  var id: Double = js.native
  var inertia: Double = js.native
  var inverseInertia: Double = js.native
  var inverseMass: Double = js.native
  var isSleeping: Boolean = js.native
  var isStatic: Boolean = js.native
  var label: String = js.native
  var mass: Double = js.native
  var motion: Double = js.native
  var position: Vector = js.native
  var render: BodyRenderOptions = js.native
  var restitution: Double = js.native
  var sleepThreshold: Double = js.native
  var slop: Double = js.native
  var speed: Double = js.native
  var timeScale: Double = js.native
  var torque: Double = js.native
  var `type`: String = js.native
  var velocity: Vector = js.native
  var vertices: js.Array[Vector] = js.native
  var parts: js.Array[Body] = js.native
  var parent: Body = js.native
  var frictionStatic: Double = js.native
  var collisionFilter: BodyCollisionFilter = js.native
}

@js.native
@JSGlobal("Matter.Body")
object Body extends js.Object {
  def applyForce(body: Body, position: Vector, force: Vector): Unit = js.native
  def create(options: BodyOptions): Body = js.native
  def rotate(body: Body, rotation: Double): Unit = js.native
  def nextGroup(isNonColliding: Boolean): Double = js.native
  def nextCategory(): Double = js.native
  def set(body: Body, settings: js.Any, value: js.Any = ???): Unit = js.native
  def setMass(body: Body, mass: Double): Unit = js.native
  def setDensity(body: Body, density: Double): Unit = js.native
  def setInertia(body: Body, interna: Double): Unit = js.native
  def setVertices(body: Body, vertices: js.Array[Vector]): Unit = js.native
  def setParts(body: Body, parts: js.Array[Body], autoHull: Boolean = ???): Unit = js.native
  def setPosition(body: Body, position: Vector): Unit = js.native
  def setAngle(body: Body, angle: Double): Unit = js.native
  def setVelocity(body: Body, velocity: Vector): Unit = js.native
  def setAngularVelocity(body: Body, velocity: Double): Unit = js.native
  def setStatic(body: Body, isStatic: Boolean): Unit = js.native
  def scale(body: Body, scaleX: Double, scaleY: Double, point: Vector = ???): Unit = js.native
  def translate(body: Body, translation: Vector): Unit = js.native
  def update(body: Body, deltaTime: Double, timeScale: Double, correction: Double): Unit = js.native
}
