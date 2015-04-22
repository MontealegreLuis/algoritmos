/*
  Tarea13: Greedy-Activity-Selector(s,f)
	   Método iterativo
*/
import Array._

object Greedy
{
  def main(args: Array[String])
  {
    var s = Array(1, 3, 0, 5, 3, 5, 6,   8,  8,  2, 12)
    var f = Array(4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16)

    var aux = Array[Int](10)
    var A = Array[Int](10)
    
    println("Columnas:")
    for(i<-1 to 11)
      print(i+"\t")
    println()
    println("Matrices S y F")
    for(i <- s)
      print(i + "\t") 
    println()
    for(i <- f)
      print(i + "\t") 
    println()

    //Desde aqui el pseudocódigo de Greedy Activity Selector(s,f)
    var n = s.length

    //Esta nstrucción es para asignar la primer columna al conjunto solución
    A(0) = 1	//Equivale a la asignación A(0) = s(0)

    var k = 0

    for(m <- 1 to n-1)
      if( s(m) >= f(k) )
      {
        aux(0) = m+1	//Equivale a aux(0) = s(m)
	A = Une(A,aux)
	k = m
      }
    println("Columnas del Conjunto solucion:\n")
    for(i<-A)
      print(i+" ")
    println()

  }//Llave del main

  /*Función que concatena dos arreglos y marca los elementos repetidos*/
  def Une(A: Array[Int], B: Array[Int]):Array[Int] = 
  {
    var z=0
    var C = concat(A, B)	//Concatena los dos arreglos
    var n = C.length
    for(i <-0 to n-2)		//Busca repetidos
      for(j <- i+1 to n-1)
	if( C(i) == C(j) )
	  C(j) = -9999		//Marca los elementos
    return C
  }//Llave de la función Une

}//Llave del object
