import scala.util.Random

object volados{
def main(args:Array[String])
{
	var n = new Random
	var p=new Array[Int](11)
	var aguila=0
	var sol=0
	var i=0
	
	for (j<-0 to 10)
	{
		p(j)=n.nextInt(10)
	}
	printf("Tirando volados\n")
	for(i<-0 to p.length-1)
	{
		if(p(i) % 2 == 1)
		{
			printf("En el volado "+i+" salio Aguila\n")
			aguila=aguila+1
		}
		else if(p(i) % 2 == 0)
		{
			printf("En el volado "+i+" salio Sol\n")
			sol=sol+1
		}
	}
	
	printf("El total de Aguilas en los 10 volados fueron "+aguila+"\n");
	printf("El total de Soles en los 10 volado fueron "+sol+"\n");
   }
}
