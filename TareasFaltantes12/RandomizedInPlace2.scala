/**
 * Created by Clarissa on 12/04/2015.
 */
object RandomizedInPlace2{
  def SelectionSort(A:Array[Int], A2:Array[Int]){
    var Tam = A2.length
    var indice = 0
    var aux = 0
    var menor = 0

    for(i <- 0 to (Tam - 1)){
      indice = i
      menor = A2(i)
      for(j <- (i + 1) to (Tam - 1)){
        if(menor > A2(j)){
          menor = A2(j)
          indice = j
        }
      }
      if(indice != i){
        aux = A(indice)
        A(indice) = A(i)
        A(i) = aux
      }
    }

    println("El arreglo ordenado de acuerdo a las prioridades es:\n")
    for(i <- A)
      print(i + ", ")
    println("\n")
  }

  def PermutaOrdena(A:Array[Int]){
    val n = A.length * A.length * A.length
    var A2 = new Array[Int](A.length)
    var Ran = new scala.util.Random

    for(i <- 0 to A.length - 1){
      A2(i) = Ran.nextInt(n)
    }

    println("El arreglo con prioridades es:\n")
    for(i <- A2)
      print(i + ", ")
    println("\n")
    SelectionSort(A,A2)
  }

  def main(args:Array[String]){
    var Contrataciones = 1
    var A = Array(23, 33, 45, 46, 50, 66, 80, 99, 100, 1000)
    println("El arreglo Original es:\n")
    for(i <- A)
      print(i + ", ")
    println("\n")


    PermutaOrdena(A)
    var EmpleadoAdecuado = A(0)
    for(i <- 1 to A.length - 1){
      if(A(i) > EmpleadoAdecuado){
        Contrataciones += 1
        EmpleadoAdecuado = A(i)
      }
    }
    println("Se realizo " + Contrataciones + " contrataciones\n")
    println("El empledo adecuado es: " + EmpleadoAdecuado)
  }
}

