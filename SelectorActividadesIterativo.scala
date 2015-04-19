import Array._
object SelectorIterativo{
  def main(args: Array[String]){
    //Matriz de los tiempos
    var s = Array(1, 3, 0, 5, 3, 5, 6,   8,  8,  2, 12)
    var f = Array(4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16)
    var aux = Array[Int](10)
    var A = Array[Int](10)    
    print("s:\t")
    for(i <- s)	print(i + "\t") 
    println()
    print("f:\t")
    for(i <- f)	print(i + "\t") 
    println()
    var n = s.length
    A(0) = 1//Esta nstrucción es para asignar la primer columna al conjunto solución	
    var k = 0

    for(m <- 1 to n-1)
      if( s(m) >= f(k) ){
        aux(0) = m+1
	A = Concatena(A,aux)
	k = m
      }

    println("\nColumnas compatibles:")
    for(i<-A)	print(i+" ")
    println()
  }

  def Concatena(A: Array[Int], B: Array[Int]):Array[Int] = {
    var C = concat(A, B)	//Concatena los dos arreglos
    return C
  }
}
