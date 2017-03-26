package collision

import body.Body
import core.Engine
import org.querki.jsext.{JSOptionBuilder, OptMap, noOpts}
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by Dan on 3/24/2017.
  */

@js.native
trait GridDefinition extends js.Object
object GridDefinition extends GridDefinitionBuilder(noOpts)
class GridDefinitionBuilder(val dict:OptMap) extends JSOptionBuilder[GridDefinition, GridDefinitionBuilder](new GridDefinitionBuilder(_))

@js.native
@JSGlobal("Matter.Grid")
class Grid extends js.Object

@js.native
@JSGlobal("Matter.Grid")
object Grid extends js.Object {
  def create(options: GridDefinition = ???): Grid = js.native
  def update(grid: Grid, bodies: js.Array[Body], engine: Engine, forceUpdate: Boolean): Unit = js.native
  def clear(grid: Grid): Unit = js.native
}