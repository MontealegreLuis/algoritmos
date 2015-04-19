object Greedy_Activity_Selector{
	
     def main(args:Array[String]){
     	var s = Array(1,3,0,5,3,5,6,8,8,2,12)
	var f = Array(4,5,6,7,9,9,10,11,12,14,16)
	println("El resultado es: "+GreedyActivityS(s,f))
	
    }

    def GreedyActivityS(s:Array[Int], f:Array[Int]):String={
	var n = s.length
	var k=1
	var i=0
	var a =" "+s(0)
	for (m <- 1 to n-1){
		if(s(m)>=f(k)){
		   a = a + " "+(m+1)
		   k = m		
		}	
	}
	return a 
    }
		
}
