import scala.util.Random;

object ContratacionAleatorioPrioridad {

  
  def main(args: Array[String]){
    
    var A = Array(9,4,7,3,6,1,0,2,8,5)
    
    println("Orden original de entrevistados")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println("\n");
    var P = Array.ofDim[Int](A.length)
    var r = new Random()
    for(i<-0 to A.length-1)
      P(i) = r.nextInt(A.length*A.length*A.length - 1) + 1
    ord(A,P)  
    
    println("Orden final de entrevistados")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println("\n");
    
    val total = hire_assistant(A)
    println("\nEn total fueron contratados: "+total)
  }
  
  def hire_assistant(A: Array[Int]): Int = {
    var total = 0
    var best = 0
    for(i<-0 to A.length-1)
    {
      println("------Esta siendo entrevistado candidato: "+A(i))
      if(A(i) > best)
      {
        best = A(i)
        total = total + 1
        println("----->Esta siendo contratado candidato: "+A(i))
      }
      
    }
    return total
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