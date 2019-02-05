package drmario

class Pill(val pp1: PillPiece, val pp2: PillPiece) extends BoardElement{
  def fall(): Pill = {
    new Pill(cells.map(pp => pp.fall()))
  }
}