/*
 Tarea8 Parte 1: Randomize In Place(A)
 1.n = A.length
 2.for i = 1 to n
 3.  swap A[i] with A[RANDOM(i,n)]
*/

import scala.util.Random
object RandomizeInPlace
{
  def main(args: Array[String])
  {
    var A = Array(1,2,3,4,5,6,7,8,9,10)
    println("Randomize In Place")
    println("Arreglo original(está ordenado)")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    Ordena(A)
    println("\nArreglo revuelto")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println()
  }

  def Ordena(A: Array[Int])
  {
    var n = A.length
    var r = new Random()//Objeto tipo Random
    for(i <-0 to n-1)
    {
      var ran = r.nextInt(n-i) + i
      var aux = A(i)
      A(i) = A(ran)
      A(ran) = aux
    }
  }//Llave de la funcion Ordena

}//Llave del object
