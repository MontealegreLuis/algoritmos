/*
  Tarea11 Extended-Bottom-Up-Cut-Rod(p,n)
*/

object ExtendedBottomUpCutRod
{
  var p = Array(1,5,8,9,10,17,17,20,24,30)

  def main(args: Array[String])
  {
    var tubo = 9
    println("Este es el arreglo de precios: ")

    for(i<-0 to p.length-1)
      println("Tamaño: "+(i+1)+" Precio: "+p(i))
    println("Maxima ganancia de cortar un tubo de: "+tubo);
    println("Ganancia: "+AuxExtendedBottomUpCutRod(tubo))
  }

  def AuxExtendedBottomUpCutRod(n: Int): Int = 
  {
    var r = Array.ofDim[Int](n+1)
    r(0) = 0
    for(j<-0 to n-1)
    {
      var q = -999999
      for(i<-0 to j)
      q = max(q, p(i)+r(j-i))
      r(j+1) = q
    }
    return r(n)
  }

  def max(a: Int, b: Int): Int = 
  {
    if( a <= b)
      return b
    else
      return a
  }
}//Llave del object
