package drmario

class Board {
  private var _elements = List.tabulate[BoardElement](10)(i => new Virus(util.Random.nextInt(8), util.Random.nextInt(16), DrMarioColor.Random))
  def elements = _elements
  private val fallInterval = 1.0
  private var fallDelay = 0.0
  private var upHeld = false
  private var leftHeld = false
  private var rightHeld = false
  private var downHeld = false

  def update(delay: Double): Unit = {
    fallDelay += delay
    if (fallDelay >= fallInterval) {
      currentPill = currentPill.fall()
      fallDelay = 0.0
    }
  }
    def upPressed() = upHeld = true
    def upPressed() = downHeld = true
    def upPressed() = leftHeld = true
    def upPressed() = right= true
}