package contratacionP
import scala.util.Random

object contratacionPermutacion {
  
def main(args: Array[String])
{
  var mejor=0
  var pos=0
  var califi=new Random
  
  var aux=new Array[Int](11)
  var aux2=new Array[Int](11)
  
 var p = new Array[Int](11)
  
  var m=new Random
  aux(0)=m.nextInt(10)
  
  for(i<-0 to 10)
  {
    aux2(i)=califi.nextInt(10)
    printf("El candidato "+i+" obtuvo calificación "+aux2(i)+"\n")
    aux(i) = aux2(i)
    aux2(aux2(i))=aux(i)
    
    
    if(aux(0) < aux2(i))
    {
      aux(0)=aux2(i)
      printf("El candidato "+i+" obtuvo mejor calificación,su calificación fue "+aux(0)+"\n")
      mejor=i
    }
  }
    printf("\n!!EL  CANDIDATO CONTRATADO FUE EL # "+mejor+"\n\n")
  }

}