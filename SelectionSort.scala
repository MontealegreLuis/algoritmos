object SelectionSort{
     def main (args: Array [String]){
     	val A = Array(20,254,36,18,4)
        var key=0
	var j=0
	var x=0   
     	for (i <- 0 to A.length-1) {
      		key = A(i)
      		j = i
		x = 0
      		while (j<A.length) {
                   
	   	   if(key>A(j)){
		      key=A(j)
		      x=j	
	    	   }
	           j=j+1 
        	}
		if(key!=A(i)){
		   A(x)=A(i)
		   A(i)=key	
 		}
        }
     	for (number <- A) {
       	     println(number)
        }
     }
}


