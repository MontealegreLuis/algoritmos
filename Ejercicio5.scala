object Ejercicio5{
    def main(args:Array[String]){
     	var P = Array(0,1,5,8,9,10,17,17,20,24,30)
	var n= 4
	var resp= BottomUpCutRod(P,n)
	println("La ganancia optima de un tubo de tamaño "+n+" es "+resp)
    }
    def BottomUpCutRod(P:Array[Int], n:Int):Int={
	var q=0
	var r = new Array[Int](n+1)
	for(j <- 0 to n){
	    q=(-99)
	    for(i<-0 to j)
                q=Math.max(q,P(i)+r(j-i))
            r(j)=q
	}
	return (r(n))	
    }
}
