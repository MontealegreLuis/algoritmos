object Rodcut{
    def Cut_Rod(P:Array[Int],n:Int):Int= {
        var q=0
        if(n==0)
	    return 0 	
     	q=(0)
	for(i<-1 to n-1)
            q=Math.max(q,(P(i)+Cut_Rod(P,n-i)))
       return q        
    }
    def main(args:Array[String]){
     	var P = Array(0,1,5,8,9,10,17,17,20,24,30)
	var n=6
	println("La ganancia optima de un tubo de tamaño "+n+" es "+Cut_Rod(P,n+1))
    }
}
