object Greedy_Activity_Selector{
	

    def GreedyActivity(s:Array[Int], f:Array[Int]):String={
	var n = s.length
	var k=1
	var i=0
	var A = "1"
	for (m <- 1 to n-1){
		if(s(m)>=f(k)){
		   A = A + " "+(m+1)
		   k = m		
		}	
	}
	return A 
    }

    

     def main(args:Array[String]){

     	var s = Array(1,3,0,5,3,5,6,8,8,2,12)
	var f = Array(4,5,6,7,9,9,10,11,12,14,16)

	println("Las actividades son: "+GreedyActivity(s,f))
	
     }
		
}
