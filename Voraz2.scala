object Voraz2{
	   def Greedy_ActivityS(s:Array[Int], f:Array[Int]):String={
        var n = s.length
        var k=1
        var i=0
        var a = "1"
        for (m <- 1 to n-1){
            if(s(m) >= f(k)){
                a = a + " " + (m + 1)
                k = m   
             }  
         }
         return a 
     }
     
     def main(args:Array[String]){
     	   var s = Array(1,3,0,5,3,5,6,8,8,2,12)
	       var f = Array(4,5,6,7,9,9,10,11,12,14,16)
	       println("El resultado es: " + Greedy_ActivityS(s,f))
    }		
}
