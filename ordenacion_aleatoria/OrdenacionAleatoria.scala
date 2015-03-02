import scala.util.Random

object OrdenacionAleatoria {

  def main(args: Array[String]){
    
    var A = Array(9,4,7,3,6,1,0,2,8,5)
    var P = Array.ofDim[Int](A.length)
    var r = new Random()
    for(i<-0 to A.length-1)
      P(i) = r.nextInt(A.length*A.length*A.length - 1) + 1
    
    println("Arreglo original")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    
    println("\nArreglo de prioridad")
    for(i<-0 to P.length-1)
      print(P(i)+" ")
      
    ord(A,P)  
    println("\n\nArreglo ordenado")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
  }
  
  def ord(A: Array[Int],P: Array[Int]){
    var total = P.length;
    
    for(i<-0 to total-2){
      var menor = i;
      for(j<-i+1 to total-1)
      {
        if(P(j) < P(menor))
          menor = j
      }
      
      if( i != menor){
        var aux = A(i)
        var cam = P(i)
        A(i) = A(menor)
        P(i) = P(menor)
        A(menor) = aux
        P(menor) = cam
      }
    }
  }
}