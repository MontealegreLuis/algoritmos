object CutRod {
	

	  var pi = Array(1,5,8,9,10,17,17,20,24,30)
	  
	  def main(args: Array[String]){
	    
		var tubos = 10
		
	    println("El arreglo es:")
		for(i<-0 to pi.length-1)
		print(pi(i)+"  \n");
		println("Ganancia maxima de "+tubos+" tubos es="+CutRod(tubos))
	  }
	  
	  def CutRod(n: Int): Int = {
	    if(n==0)
	      return 0
	  
	    var q = -10000000
	    for(i<-0 to n-1)
	      q = max(q,pi(i) +  CutRod(n-1-i))
	    return q
	  }
	  
	  def max(x: Int, y: Int): Int = {
	    
	    if( x <= y)
	      return y
	    else
	      return x
	    
	  }
	}
