object Rodcut{
    def max(x:Int, y:Int):Int={
        if(x >= y) return x
        else return y
    }
    def Cut_Rod(P:Array[Int], n:Int):Int={
        var q = 0
        if(n == 0){
	 	        return 0 
        }
     	  q = (-99)
	      for(i <- 1 to n)
       		 q = max(q, P(i - 1) + Cut_Rod(P, n - i))
           
        return q     
    }

    def main(args:Array[String]){
     	  var P = Array(1,5,8,9,10,17,17,20,24,30)
	      var n = 4
	      println(Cut_Rod(P, n))

    }
}