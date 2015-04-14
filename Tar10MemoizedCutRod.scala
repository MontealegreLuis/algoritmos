object Memorized_Cut_Rod{
  var p = Array(1,5,8,9,10,17,17,20,24,30)

  def main(args: Array[String]){
    var tubo = 9
    println("Este es el arreglo de precios: ")
    for(i<-0 to p.length-1)
      println("Tamaño: "+(i+1)+" Precio: "+p(i))
    println("Maxima ganancia de cortar un tubo de: "+tubo);
    println("Ganancia: "+Memorized_Cut_Rod(tubo))
  }

  def Memorized_Cut_Rod(n: Int): Int = {
    var r = Array.ofDim[Int](n+1)
    for(i<-0 to n)
      r(i) = -999999
    return Memorized_Cut_Rod_Aux(n,r)
  }

  def Memorized_Cut_Rod_Aux(n: Int,r: Array[Int]): Int = {
    if(r(n)>=0)
      return r(n)
    if(n==0)
      return 0
    else{
      var q = -999999
      for(i<-0 to n-1)
	q = max(q,p(i) + Memorized_Cut_Rod_Aux(n-i-1,r))
      r(n) = q
      return q
    }
  }

  def max(a: Int, b: Int): Int = {
    if( a <= b)
      return b
    else
      return a
  }
}
