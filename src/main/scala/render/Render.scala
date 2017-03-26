package render

import core.{Engine, Mouse}
import geometry.Bounds
import org.scalajs.dom.raw.{CanvasRenderingContext2D, HTMLCanvasElement, HTMLElement}
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by Dan on 3/24/2017.
  */

@js.native
trait RenderOptions extends js.Object
object RenderOptions extends RenderDefinitionBuilder(noOpts)
class RenderDefinitionBuilder(val dict:OptMap) extends JSOptionBuilder[RenderOptions, RenderDefinitionBuilder](new RenderDefinitionBuilder(_)) {
  def controller(v:js.Any ) = jsOpt("controller", v)
  def engine(v:Engine) = jsOpt("engine", v)
  def element(v:HTMLElement) = jsOpt("element", v)
  def canvas(v:HTMLCanvasElement) = jsOpt("canvas", v)
  def options(v:RendererOptions) = jsOpt("options", v)
  def bounds(v:Bounds) = jsOpt("bounds", v)
  def context(v:CanvasRenderingContext2D) = jsOpt("context", v)
  def textures(v:js.Any ) = jsOpt("textures", v)
}

@js.native
trait RendererOptions extends js.Object
object RendererOptions extends RendererOptionsBuilder(noOpts)
class RendererOptionsBuilder(val dict:OptMap) extends JSOptionBuilder[RendererOptions, RendererOptionsBuilder](new RendererOptionsBuilder(_)) {
  def width(v:Double) = jsOpt("width", v)
  def height(v:Double) = jsOpt("height", v)
  def pixelRatio(v:Int) = jsOpt("pixelRatio", v)
  def background(v:String) = jsOpt("background", v)
  def wireframeBackground(v:String) = jsOpt("wireframeBackground", v)
  def hasBounds(v:Boolean) = jsOpt("hasBounds", v)
  def enabled(v:Boolean) = jsOpt("enabled", v)
  def wireframes(v:Boolean) = jsOpt("wireframes", v)
  def showSleeping(v:Boolean) = jsOpt("showSleeping", v)
  def showDebug(v:Boolean) = jsOpt("showDebug", v)
  def showBroadphase(v:Boolean) = jsOpt("showBroadphase", v)
  def showBounds(v:Boolean) = jsOpt("showBounds", v)
  def showVelocity(v:Boolean) = jsOpt("showVelocity", v)
  def showCollisions(v:Boolean) = jsOpt("showCollisions", v)
  def showSeparations(v:Boolean) = jsOpt("showSeparations", v)
  def showAxes(v:Boolean) = jsOpt("showAxes", v)
  def showPositions(v:Boolean) = jsOpt("showPositions", v)
  def showAngleIndicator(v:Boolean) = jsOpt("showAngleIndicator", v)
  def showIds(v:Boolean) = jsOpt("showIds", v)
  def showShadows(v:Boolean) = jsOpt("showShadows", v)
  def showVertexNumbers(v:Boolean) = jsOpt("showVertexNumbers", v)
  def showConvexHulls(v:Boolean) = jsOpt("showConvexHulls", v)
  def showInternalEdges(v:Boolean) = jsOpt("showInternalEdges", v)
  def showMousePosition(v:Boolean) = jsOpt("showMousePosition", v)
}

@js.native
@JSGlobal("Matter.Render")
class Render extends js.Object {
  var controller: js.Any = js.native
  var element: HTMLElement = js.native
  var canvas: HTMLCanvasElement = js.native
  var options: RendererOptions = js.native
  var bounds: Bounds = js.native
  var context: CanvasRenderingContext2D = js.native
  var textures: js.Any = js.native
  var mouse: Mouse = js.native
}

@js.native
@JSGlobal("Matter.Render")
object Render extends js.Object {
  def create(options: RenderOptions): Render = js.native
  def run(render: Render): Unit = js.native
  def stop(render: Render): Unit = js.native
  def setPixelRatio(render: Render, pixelRatio: Double): Unit = js.native
  def world(render: Render): Unit = js.native
}
