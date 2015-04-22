import Array._
object SelectorRecursivo{
  def main(args:Array[String]){
    //Matriz de los tiempos
    var s = Array(1, 3, 0, 5, 3, 5, 6,   8,  8,  2, 12)
    var f = Array(4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16)
    var k = -1
    var n = s.length
    print("s:\t")
    for(i <- s)	print(i + "\t") 
    println()
    print("f:\t")
    for(i <- f)
      print(i + "\t") 
    println()

    var sol = Array[Int](10) //Matriz solución
    sol = RAS(s,f,k,n-1)

    println("Columnas que son compatibles(el cero es conjunto vacio):\n")
    for(i<-sol)
      print((i+1)+" ")
    println()
  }//main

  def RAS(s: Array[Int], f: Array[Int], k: Int, n: Int): Array[Int] ={
    var vacio = Array(-1)
    var resul = Array[Int](10)
    var sol = Array[Int](10)
    var m = k+1
    if(k != -1)
      while( (m<=n)&&( s(m)<f(k) ) )
        m = m+1
    if(m <= n){
      var aux = Array(m)
      return Concatena( aux,RAS(s,f,m,n) )
    }
    return vacio
  }

  def Concatena(A: Array[Int], B: Array[Int]):Array[Int] = {
    var C = concat(A, B)//Concatena los dos arreglos
    return C
  }
}
