package drmario

class PillPiece(val x: Int, val y: Int, val color: DrMarioColor.Value) extends Cell{
  def fall(): PillPiece = new PillPiece(x, y+1, color)
}