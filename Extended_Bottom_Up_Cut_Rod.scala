object Extended_Bottom_Up_Cut_Rod{
    
   def main(args:Array[String]){
     	var P = Array(1,5,8,9,10,17,17,20,24,30)
	var n= 4
        println("Los cortes son = ")
          Extended_BottomUpCutRod(P,n)
	//var resp= Extended_BottomUpCutRod(P,n)
	//println("resultado= "+resp)
	
    }
   
     def Extended_BottomUpCutRod(P:Array[Int], n:Int){
   	var r = new Array[Int](n+1)
   	var s = new Array[Int](n+1)
	var m=n             
	var q=0
        r(0)=0
         
	for(j <- 1 to m){
	    q=(-999)
	    for(i<-1 to j){
              if(q<(P(i-1)+r(j-i))){  
                 q=(P(i-1)+r(j-i))
                 s(j)=i
                 //println("s(j)= "+s(j))

              }    
            }
	    r(j)=q
//	    println("r(j)= "+r(j))
	}

	while(m>0){
            println(s(m)+" ")
             m = (m-s(m))
        }
     }

}
