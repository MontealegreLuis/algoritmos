object ExtendedCutRodBottomUp {
	

	  var pi = Array(1,5,8,9,10,17,17,20,24,30)
	  var s = Array[Int]();
	  
	  def main(args: Array[String]){
	    var tubo = 10
	    println("El arreglo es: ")
		for(i<-0 to pi.length-1)
		print(pi(i)+"  \n");
		println("Ganancia maxima de "+tubo+" tubos es ="+ExtendedCutRodBottomUp(tubo));
	    
	    print("Cortes Realizados= ")
	    Imprimir(tubo)
	    println("")
	  }
	  
	  def ExtendedCutRodBottomUp(n: Int): Int = {
	    var r = Array.ofDim[Int](n+1)
	    s = Array.ofDim[Int](n+1)
	    r(0) = 0
	    for(j<-0 to n-1)
	      {
	      var q = -1000000
	      for(i<-0 to j)
	        if(q < pi(i)+r(j-i))
	        {
	        q = pi(i)+r(j-i)
	        s(j+1) = i+1
	        }
	      r(j+1) = q
	      }
	    return r(n) 
	  }
	  
	  def Imprimir(num: Int){
	    var n = num
	    
	    while(n>0)
	    {
	      print(s(n)+" ")
	      n = n - s(n)
	    }
	  }
	}
