package drmario

class Board {
  private var _elements = List.tabulate[BoardElement](10)(i => new Virus(util.Random.nextInt(8), util.Random.nextInt(16), DrMarioColor.Random))
  def elements = _elements
}