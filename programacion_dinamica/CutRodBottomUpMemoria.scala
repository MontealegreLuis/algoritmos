object CutRodBottomUp {

  var p = Array(1,5,8,9,10,17,17,20,24,30)
  var s = Array[Int]();
  
  def main(args: Array[String]){
    var tubo = 10
    println("Este es el arreglo de precios: ")
    for(i<-0 to p.length-1)
      println("Tamaño: "+(i+1)+" Precio: "+p(i))
    println("Maxima ganancia de cortar un tubo de: "+tubo);
    var r = Bottom_Up_Cut_Rod(tubo)
    println("Ganancia: "+r)
    print("Cortes: ")
    Imprimir(tubo)
  }
  
  def Bottom_Up_Cut_Rod(n: Int): Int = {
    var r = Array.ofDim[Int](n+1)
    s = Array.ofDim[Int](n+1)
    r(0) = 0
    for(j<-0 to n-1)
      {
      var q = -999999
      for(i<-0 to j)
        if(q < p(i)+r(j-i))
        {
        q = p(i)+r(j-i)
        s(j+1) = i+1
        }
      r(j+1) = q
      }
    return r(n) 
  }
  
  def Imprimir(num: Int){
    var n = num
    
    while(n>0)
    {
      print(s(n)+" ")
      n = n - s(n)
    }
    /*
    for(i<-0 to s.length-1)
      println(s(i))
      
      */
  }
}