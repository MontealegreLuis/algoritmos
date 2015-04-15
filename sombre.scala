import scala.util.Random

object sombre{
def main(args:Array[String])
{
	var n = new Random
	var num=0
	var c = 0
	var i=0
	var j=0
	var total=0
	var personas=Array(1,2,3,4,5,6,7,8,9,10)
	var sombreros=new Array[Int](personas.length)
	
	for(i<-0 to personas.length-1)
		sombreros(i) = 0
		printf("Dejando  sombreros...\n")
	
	while( c != 10 )
	{
		n.nextInt(10)
		
		for( i <- 0 to personas.length-1)
		{	
			if(sombreros(i) == 0)
			{
				sombreros(i) = n.nextInt(10)
				c=c+1
			}
		}
	}
	printf("\nTermiando de comer,repartiendo sombreros...\n")
	for(j<-0 to personas.length-1)
	{
		printf("\na persona "+personas(j)+ " le dieron el sombrero numero "+sombreros(j))
		if(personas(j)==sombreros(j))
		{
			total=total+1
		}
	}
	printf("\nEl total de personas con el sombrero correcto es = "+total+"\n")
  }
}
