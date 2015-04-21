import scala.util.Random

object contratacion{
def main(args: Array[String])
{
	var mejor=0
	var calificacion=new Random
	var pos=0
	var aux=new Array[Int](1)
	var aux2=new Array[Int](11)
	var m=new Random
	aux(0)=m.nextInt(10)
	
	for(i<-0 to 10)
	{
		aux2(i)=calificacion.nextInt(10)
		printf("El aspirante "+i+", calificacion "+aux2(i)+"\n")
		if(aux(0) < aux2(i))
		{
			aux(0)=aux2(i)
			printf("El aspirante "+i+" saco mejor calificacion,su calificacion fue "+aux(0)+"\n")
			mejor=i
		}
	}
		printf("\nEL MEJOR CANDIDATO FUE EL ASPIRANTE # "+mejor+"\n\n")
  }
}