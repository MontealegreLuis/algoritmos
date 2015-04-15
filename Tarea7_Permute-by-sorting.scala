/*
 Tarea 7 Permute-by-sorting(A)
 1. n=A.length
 2. let P[1..n] be a new array
 3. for i = 1 to n
 4.     P[i] = RANDOM(1,n^3)
 5. sort A, using P as sort keys
*/

import scala.util.Random
object PermuteBySorting
{
  def main(args: Array[String])
  {
    var A = Array(1,2,3,4,5,6,7,8,9,10)
    println("Permute By Sorting")
    println("Arreglo original(está ordenado)")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    Permuta(A)
    println("\nArreglo original revuelto")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println()
  }


  def Permuta(A: Array[Int])
  {
    var n = A.length
    var P = new Array[Int](n)//Arreglo de Permutaciones
    var r = new Random()//Objeto tipo Random
    for(i <-0 to P.length -1 )//Se llena de permutaciones de 1 a 10
    {
      var valor = n*n*n//n al cubo
      var ran = r.nextInt(valor)
      P(i) = ran
    }
    //Imprimimos el arreglo P
    println("\n\n\nArreglo P(Se lleno de puros aleatorios)\n")
    for(i<-0 to P.length-1)
      print(P(i)+" ")
    println()    

    //Ahora a ordenar el arreglo A con respecto al arreglo P, se usará selección
    var indice = 0
    var aux = 0
    var auxA = 0//aux para el arreglo A
    var menor = 0
    for(i <- 0 to (n-1))
    {
      indice = i
      menor = P(i)
      for(j <- (i + 1) to (n - 1))
      {
        if(menor > P(j))
        {
          menor = P(j)
          indice = j
        }
      }
      if(indice != i)//Aquí se hace el swap de P y de A
      {
        aux = P(indice)
        auxA = A(indice)

        P(indice) = P(i)
	A(indice) = A(i)

        P(i) = aux
	A(i) = auxA
      }
    }//Llave del for para ordenar por seleccion

    println("\nArreglo P ordenado")
    for(i<-0 to A.length-1)
      print(P(i)+" ")
    println()

  }//Llave de la funcion Permuta

}
