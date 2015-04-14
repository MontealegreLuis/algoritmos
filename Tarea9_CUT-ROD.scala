/*
  Tarea9 CUT-ROD
*/

object Cut_Rod
{
  //Para no pasarla como argumento se declara aqui
  var p = Array(1,5,8,9,10,17,17,20,24,30)
  def main(args: Array[String])
  {
    var tubo = 10
    println("Tamaño del tubo para cortar: "+tubo);
    println("Ganancia máxima: "+CutRod(tubo))
  }

  def CutRod(n: Int): Int = 
  {
    if(n==0)
      return 0
    var q = -9999
    for(i<-0 to n-1)
      q = max(q, p(i) + CutRod(n-1-i))
    return q
  }

  def max(a: Int, b: Int): Int = 
  {
    if( a <= b)
      return b
    else
      return a
  }
}
