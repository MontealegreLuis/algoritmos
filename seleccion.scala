object seleccion{
   def main(args: Array[String]){
	var inicio= Array(1,3,4,8,0,3)
	var fin= Array(3,4,6,10,5,9)
	var a=0
	var b=0
	var k=0
	var eventos=inicio.length
	for(i<-2 to inicio.length-1)
	{
		if(inicio(i)>=fin(k))
		{
			a=inicio(k)
			b=fin(k)
			println("El evento "+k+" empieza: "+a+" termina: "+b)
			k+=1
		}
	}
	println("De "+eventos+" eventos programados solo se pueden realizar "+k+" eventos")
    }
 }