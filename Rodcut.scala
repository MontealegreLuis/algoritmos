object Rodcut{

    def Cut_Rod(p:Array[Int],n:Int):Int= {
              var q=0

               if(n==0){
	 	return 0 
                 }	
     	     q=(-99)
	     for(i<-1 to n){
       		 q=Math.max(q,(p(i-1)+Cut_Rod(p,n-i)))
	        }
       return q        
    }

  def main(args:Array[String]){
     	var p = Array(1,5,8,9,10,17,17,20,24,30)
	var n=4
	println(Cut_Rod(p,n))
    }

}
