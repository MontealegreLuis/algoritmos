import scala.util.Random
object RandomizeInPlace{
  def main(args: Array[String]){
    var A = Array(31,64,93,99,182,928,9820,271,92,84)
    println("Randomize In Place")
    println("Arreglo original")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    Ordena(A)
    println("\nArreglo revuelto")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println()
  }

  def Ordena(A: Array[Int]){
    var n = A.length
    var r = new Random()
    for(i <-0 to n-1){
      var ran = r.nextInt(n-i) + i
      var aux = A(i)
      A(i) = A(ran)
      A(ran) = aux
    }
  }
}
