object Memoized_Cut_Rod{
    
    def main(args:Array[String]){
     	var P = Array(1,5,8,9,10,17,17,20,24,30)
	var n= 4
	MemoizedCutRod(P,n)
	
    }
    def MemoizedCutRod(P:Array[Int], n:Int){
	var r = new Array[Int](n+1)

	for(i <- 1 to n)
	    r(i)=(-99)

	val resul=MemoizedCutRodAux(P,n,r)
	println("El resultado es: "+resul)
    }
    
    def MemoizedCutRodAux(P:Array[Int],n:Int,r:Array[Int]): Int= {
	//println("Imprime "+(r(n)))
        //println("Imprime "+n)
	
        var q=0
	if(r(n)>=0){
	   println("Entre a la condicion "+n)
           return (r(n))
	}
	if (n==0)
	    q=0
	else{
	     
	         q=(-99)
	         println("Entre a la condicion else "+n)
	         for(i<-1 to n)
		     q=Math.max(q,(P(i-1)+MemoizedCutRodAux(P,n-i,r)))
             
	}
	r(n)=q
	return q
	
    }
}
