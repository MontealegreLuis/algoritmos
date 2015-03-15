import scala.util.Random

object OrdenacionAleatoria {

  def main(args: Array[String]){
    
    var A = Array(9,4,7,3,6,1,0,2,8,5)

    
    println("Arreglo original")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    
    ord_pos(A)  
    println("\n\nArreglo ordenado")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
  }
  
  def ord_pos(A: Array[Int]){
    var n = A.length;
    var r = new Random()
    for(i<-0 to n-1){
      var ran = r.nextInt(n-i) + i
      var aux = A(i)
      A(i) = A(ran)
      A(ran) = aux
    }
  }
}
