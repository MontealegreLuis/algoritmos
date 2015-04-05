object BottomUpCut_Rod{
    
   def main(args:Array[String]){
     	var P = Array(1,5,8,9,10,17,17,20,24,30)
	var n= 4
	var resp= BottomUpCutRod(P,n)
	println("resultado= "+resp)
	
    }
   
     def BottomUpCutRod(P:Array[Int], n:Int):Int={
	var q=0
	var r = new Array[Int](n+1)
          r(0)=0
	for(j <- 1 to n){
	    q=(-99)
	    for(i<-1 to j)
                q=Math.max(q,P(i-1)+r(j-i))
            r(j)=q
	}

	for(j <- 1 to n){
	    println("valor de r(j)= "+(r(j)))
	}
	
	return (r(n))	
       }
}
