package contratacionR

import scala.util.Random

object contratacionRandomize {
  
  def main(args: Array[String])
{
  var mejor=0
  var pos=0
  var califi=new Random
  
  var A=new Array[Int](1)
  var aux2=new Array[Int](11)
  
  var m=new Random
  A(0)=m.nextInt(10)
  
  for(i<-0 to 10)
  {
    aux2(i)=califi.nextInt(10)
    
    printf("El candidato "+i+" obtuvo calificación "+aux2(i)+"\n")
    if(A(0) < aux2(i))
    {
      A(0)=aux2(i)
      printf("El candidato "+i+" obtuvo mejor calificación,su calificación fue "+A(0)+"\n")
      mejor=i
    }
  }
    printf("\n!!EL  CANDIDATO CONTRATADO FUE EL # "+mejor+"\n\n")
  }

  

}