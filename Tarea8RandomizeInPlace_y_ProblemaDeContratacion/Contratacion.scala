/*Tarea8 COntratacion*/

import scala.util.Random
object ProblemaContratacion{
  def main(args: Array[String]){
    var A = Array(45,33,96,17,69,52,96,60,17,92)
    var CopiaA = Array(45,33,96,17,69,52,96,60,17,92)
    var tam = A.length
    println("Problema de la contratación\n")

    for(i<-0 to tam-1)
      print(A(i)+" ")

    RandomizeInPlace(A)//Revuelve la entrada

    println("\nArreglo revuelto con Randomize-In-Place")
    for(i<-0 to tam-1)
      print(A(i)+" ")
    println()

    println("\nCon RandomInPlace")
    var best=0//Tomamos en cuenta que el mejor es el primero
    for(i <- 0 to tam-1){
      println("Entrevistando al empleado "+ (i+1))
      if( A(i) > A(best) ){
	best = i
	println("\nSe ha contratado a un nuevo candidato")
      }
    }

    println("Con Permute-By-Sorting")
    for(i<-0 to tam-1)
      print(CopiaA(i)+" ")
    
    Permuta(CopiaA)//Revuelve la entrada

    println("\nArreglo revuelto con Permute-By-Sorting")
    for(i<-0 to tam-1)
      print(CopiaA(i)+" ")
    println()

    println("\nAqui el problema con PermuteBySorting")
    best=0//Tomamos en cuenta que el mejor es el primero
    for(i <- 0 to tam-1){
      println("Entrevistando al empleado "+ (i+1))
      if( CopiaA(i) > CopiaA(best) ){
	best = i
	println("\ncontratando a un nuevo mejor candidato")
      }
    }
  }

//Con Randomize
  def RandomizeInPlace(A: Array[Int]){
    var n = A.length
    var r = new Random()
    for(i <-0 to n-1){
      var ran = r.nextInt(n-i) + i
      var aux = A(i)
      A(i) = A(ran)
      A(ran) = aux
    }
  }


  def Permuta(A: Array[Int]){
    var n = A.length
    var P = new Array[Int](n)//Arreglo de Permutaciones
    var r = new Random()//Objeto tipo Random
    for(i <-0 to P.length -1 ){
      var valor = n*n*n//n al cubo
      var ran = r.nextInt(valor)
      P(i) = ran
    }
  
    //Ahora a ordenar el arreglo A con respecto al arreglo P, se usará selección
    var indice = 0
    var aux = 0
    var auxA = 0//aux para el arreglo A
    var menor = 0
    for(i <- 0 to (n-1)){
      indice = i
      menor = P(i)
      for(j <- (i + 1) to (n - 1)){
        if(menor > P(j)){
          menor = P(j)
          indice = j
        }
      }
      if(indice != i){
        aux = P(indice)
        auxA = A(indice)

        P(indice) = P(i)
	A(indice) = A(i)

        P(i) = aux
	A(i) = auxA
      }
    }
  }
}
