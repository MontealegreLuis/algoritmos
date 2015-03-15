import scala.util.Random;

object ContratacionAleatorioEnPosicion {

   def main(args: Array[String]){
    
    var A = Array(9,4,7,3,6,1,0,2,8,5)
    
    println("Orden original de entrevistados")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println("\n");

    ord_pos(A)  
    
    println("Orden final de entrevistados")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println("\n");
    
    val total = hire_assistant(A)
    println("\nEn total fueron contratados: "+total)
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
  
}