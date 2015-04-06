object Ejercicio4{
    def main(args:Array[String]){
     	var P = Array(0,1,5,8,9,10,17,17,20,24,30)
	var n= 4
	MemoizedCutRod(P,n)
	
    }
    def MemoizedCutRod(P:Array[Int], n:Int){

	var r = new Array[Int](n+1)
	for(i <- 0 to n)
	    r(i)=(-99+i)
	val resul=MemoizedCutRodAux(P,n+1,r)
	println("La ganancia optima de un tubo de tamaño  "+n+" es: "+resul)
    }
    
    def MemoizedCutRodAux(P:Array[Int],n:Int,r:Array[Int]): Int= {
        var q=0
	if(r(n-1)>=0)
           return (r(n-1))
	if ((n-1)==0)
	    q=0
	else{
	     q=(-99)
	     for(i<-1 to n-1)
		 q=Math.max(q,(P(i)+MemoizedCutRodAux(P,n-i,r)))     
	}
	r(n-1)=q
	return q
	
    }
}
