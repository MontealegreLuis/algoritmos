/*
  Tare8 Parte 2: Problema de la contratación usando:
  -Permutacion por ordenacion(PERMUTE-BY-SORTING)
  -La que mando por correo(RANDOMIZE-IN-PLACE)
*/

import scala.util.Random
object ProblemaContratacion
{
  def main(args: Array[String])
  {
    var A = Array(1,2,3,4,5,6,7,8,9,10)
    var CopiaA = Array(1,2,3,4,5,6,7,8,9,10)
    var tam = A.length
    println("\t\t\t*****Problema de la contratación*****\n")
    println("Entre más alto el valor es mejor el empleado. Está ordenado con el peor caso")

    for(i<-0 to tam-1)
      print(A(i)+" ")

    RandomizeInPlace(A)//Revuelve la entrada

    println("\nArreglo revuelto con Randomize-In-Place")
    for(i<-0 to tam-1)
      print(A(i)+" ")
    println()

    println("\n***Aqui el problema de la contratación con RandomInPlace***")
    var best=0//Tomamos en cuenta que el mejor es el primero
    for(i <- 0 to tam-1)
    {
      println("Se está entrevistando al empleado "+ (i+1))
      if( A(i) > A(best) )
      {
	best = i
	println("\nSe ha contratado a un nuevo mejor candidato")
      }
    }

    println("\n\n*******Ahora usando Permute-By-Sorting****")
    println("El arreglo otra vez está con el peor caso\n")
    for(i<-0 to tam-1)
      print(CopiaA(i)+" ")
    
    Permuta(CopiaA)//Revuelve la entrada

    println("\nArreglo revuelto con Permute-By-Sorting")
    for(i<-0 to tam-1)
      print(CopiaA(i)+" ")
    println()

    println("\n***Aqui el problema de la contratación con PermuteBySorting***")
    best=0//Tomamos en cuenta que el mejor es el primero
    for(i <- 0 to tam-1)
    {
      println("Se está entrevistando al empleado "+ (i+1))
      if( CopiaA(i) > CopiaA(best) )
      {
	best = i
	println("\nSe ha contratado a un nuevo mejor candidato")
      }
    }


  }

  //***********Función para mezclar con Randomize In Place
  def RandomizeInPlace(A: Array[Int])
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
  }//Llave de la funcion RandomizeInPlace

  //**************Función para mezclar con Permute By Sorting
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
  }
}

