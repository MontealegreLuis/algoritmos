object MemorizedCutRod {
	

	  var pi = Array(1,5,8,9,10,17,17,20,24,30)
	  
	  def main(args: Array[String]){
	    var tubo = 10
		
		println("El arreglo es:")
		for(i<-0 to pi.length-1)
		print(pi(i)+" \n")
		println("Ganancia maxima de "+tubo+" tubos es= "+MemorizedCutRod(tubo));
	    
	  }
	  
	  def MemorizedCutRod(n: Int): Int = {
	    var r = Array.ofDim[Int](n+1)
	    for(i<-0 to n)
	      r(i) = -1000000
	    return MemorizedCutRodAux(n,r)
	  }
	  
	  def MemorizedCutRodAux(n: Int,r: Array[Int]): Int = {
	    if(r(n)>=0)
	      return r(n)
	    
	    if(n==0)
	      return 0
	  
	    else
	    {
	    var q = -1000000
	    for(i<-0 to n-1)
	      q = max(q,pi(i) +  MemorizedCutRodAux(n-i-1,r))
	    r(n) = q
	    return q
	    }
	  }
	  
	  def max(x: Int, y: Int): Int = {
	    
	    if( x <= y)
	      return y
	    else
	      return x
	    
	  }
	  
	}
