object AS{
	


	def Recursive_Activity_Selector(s:Array[Int], f:Array[Int],k:Int,n:Int ):String={
	        var m = k+1
	            while((m < n) && (s(m) < f(k)))
	                m = m + 1
	                if (m < n){
			var M= Integer.toString(m+1)
	                return M+" "+Recursive_Activity_Selector(s,f,m ,n)
			}
	            else
	                return "0";
	}



	def Greedy_Activity_Selector(s:Array[Int], f:Array[Int]):String={
        	var n = s.length
	        var A = "1"
        	var k=1
        	var i=0
	
        	for (m <- 1 to n-1){
        	    if(s(m) >= f(k)){
        	        A = A + " " + (m + 1)
        	        k = m   
        	     }  
        	 }
        	 return A
     }	


	
     
     def main(args:Array[String]){
     	   var s = Array(1,3,0,5,3,5,6,8,8,2,12)
	       var f = Array(4,5,6,7,9,9,10,11,12,14,16)
	       println(Greedy_Activity_Selector(s,f))
	       println(Recursive_Activity_Selector(s,f,0,11))
    }		
}
