//TAREA 11
//Rayen Ari Ramos Rocha
//201126031



object CutRodTopDown {
 
  val DEFAULT_REVENUE = -1

  def memoizedCutRod(prices: Array[Int], rodLength: Int, revenues: Array[Int]): Int = {
    if (revenues(rodLength - 1) >= 0)
      return revenues(rodLength - 1)

    var maxRevenue = DEFAULT_REVENUE
    if (rodLength == 0)
      maxRevenue = 0
    else {
      for (lngth <- 0 to rodLength - 1) {
	var snd = 0;
	if ((rodLength - (lngth + 1)) > 0)
	  snd = memoizedCutRod(prices, rodLength - (lngth + 1), revenues)

	maxRevenue = math.max(maxRevenue, prices(lngth) + snd)
      }
    }

    revenues.update(rodLength - 1, maxRevenue)
    return maxRevenue
  }

  def run(prices: Array[Int], rodLength: Int): Int = {
    var revenues = new Array[Int](rodLength)
    0 to rodLength - 1 foreach(i => revenues.update(i, DEFAULT_REVENUE))
    memoizedCutRod(prices, rodLength, revenues)
  }
}




//main
object MemoCutRod {
  def main(args: Array[String]) = {
    val prices = Array(1,2,3,6,9,12,15,20,21,25,29,30,31,33,50)
    println("El valor maximo obtenido es: ")
    println(CutRodTopDown.run(prices, prices.size))
   
  }
}