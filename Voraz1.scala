object Voraz1{
    def Recursive_ActivityS(s:Array[Int], f:Array[Int],k:Int,n:Int ):String={
        var m = k+1
            while((m < n) && (s(m) < f(k)))
                m = m + 1
                
            if (m < n)
                return Integer.toString(m+1)+" "+Recursive_ActivityS(s,f,m ,n)
            else
                return "0";
    }
    def main(args:Array[String]){
    	  var s = Array(1,3,0,5,3,5,6,8,8,2,12)
	      var f = Array(4,5,6,7,9,9,10,11,12,14,16)
	      println("El resultado es: "+Recursive_ActivityS(s,f,0,11))
	  }
}
