package drmario

import scalafx.scene.canvas.GraphicsContext
import scalafx.scene.paint.Color

class Renderer(gc: GraphicsContext) {
  import Renderer._
  
  
  def render(board: Board): Unit = {
    gc.fill = Color.Black
    gc.fillRect(0, 0, Main.boardWidth, Main.boardHeight)
    
    for(be <- board.elements; cell <- be.cells) {
      cell.color match {
        case DrMarioColor.Red => gc.fill = Color.Red
        case DrMarioColor.Blue => gc.fill = Color.Blue
        case DrMarioColor.Yellow => gc.fill = Color.Yellow
      }
    }
    
  }
}