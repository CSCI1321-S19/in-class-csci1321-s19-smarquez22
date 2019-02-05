package drmario

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.canvas.Canvas
import scalafx.animation.AnimationTimer

object Main extends JFXApp {
  val boardWidth = 8 * 30
  val boardHeight = 16 * 30
  stage = new JFXApp.PrimaryStage {
    title = "Dr. Mario"
    scene = new Scene(boardWidth, boardHeight) {
      val canvas = new Canvas(boardWidth, boardHeight)
      val gc = canvas.graphicsContext2D
      val renderer = new Renderer(gc)
      val board = new Board
      content = canvas

      var lastTime = -1L
      val timer = AnimationTimer(time => {
        if (lastTime != -1) {
          val delay = (time - lastTime) / 1e9
        }
        lastTime = time
      })
      timer.start()
      renderer.render(board)
    }
  }
}