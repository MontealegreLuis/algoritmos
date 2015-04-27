//TAREA 9
//Rayen Ari Ramos Rocha
//201126031

//Contratacion por prioridad.

import scala.util.Random;

object Contratacion {

  
  def main(args: Array[String]){
    
    var A = Array(1,5,6,2,3,9,11,10,14,4,7,8)
    
    println("Orden de los entrevistados")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println("\n");
    var P = Array.ofDim[Int](A.length)
    var r = new Random()
    for(i<-0 to A.length-1)
      P(i) = r.nextInt(A.length*A.length*A.length - 1) + 1
    orden(A,P)  
    
    println("Orden final de entrevistados")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
    println("\n");
    
    val total = assistant(A)
    println("No.de contratos: " +total)
  }
  
  def assistant(A: Array[Int]): Int = {
    var total = 0
    var best = 0
    for(i<-0 to A.length-1)
    {
      println("Entrevistado al candidato: "+A(i))
      if(A(i) > best)
      {
        best = A(i)
        total = total + 1
        println("se contrato al candidato: "+A(i))
      }
      
    }
    return total
  }
  
  def orden(A: Array[Int],P: Array[Int]){
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