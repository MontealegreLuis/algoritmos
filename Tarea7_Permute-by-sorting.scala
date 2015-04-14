/*Tarea7*/
import scala.util.Random
object PermuteBySorting{
  def main(args: Array[String]){
    var A = Array(42,22,43,124,875,656,72,43,94,23)
    println("Arreglo original")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    Permute(A)
    println("\nArreglo mezclado")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println()
  }

  def Permute(A: Array[Int]){
    var n = A.length
    var P = new Array[Int](n)//Arreglo de Permutaciones
    var r = new Random()
    for(i <-0 to P.length -1 ){
      var valor = n*n*n//n al cubo
      var ran = r.nextInt(valor)
      P(i) = ran
    }   

    //Ahora a ordenar el arreglo A 
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
