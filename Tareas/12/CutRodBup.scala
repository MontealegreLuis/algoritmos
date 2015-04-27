//Tarea 12
//RAyen Ari Ramos Rocha
//201126031


object CutRodBottomUp { 
  val DEFAULT_REVENUE = -1

  def run(prices: Array[Int], rodLength: Int): Int = {
    var revenues = new Array[Int](rodLength + 1)
    revenues.update(0, 0)

    for (j <- 1 to rodLength) {
      var maxRevenue = DEFAULT_REVENUE
      for (i <- 1 to j) {
	maxRevenue = math.max(maxRevenue, prices(i - 1) + revenues(j - i))
      }
      revenues(j) = maxRevenue
    }

    return revenues(rodLength)
  }
}  

//main
object CutRodBup {
  def main(args: Array[String]) = {
    val prices = Array(1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 32, 35, 37, 40, 43, 45, 49, 50)
    println("El valor maximo obtenido es: ")
    println(CutRodBottomUp.run(prices, prices.size))
  }
}