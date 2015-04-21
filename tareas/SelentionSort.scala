object SelentionSort {
    def main(args: Array[String]){
    
      var A= Array(18, 7, 20, 15)
    
      var aux=0
      var tem=0
      var t=0
      var f=0
      
      for(i <- 0 to (A.length-1)){
        tem=0
        t=A(i)
      
       for(j <- (i+1) to (A.length-1)){
        if(t > A(j)){
          f=1
          aux=j
          t=A(j)
          
        }
       }
        if(f==1){
          tem=A(i)
          A(i)=A(aux)
          A(aux)=tem
          f=0
          
        }                 
      }
        
      for (number <- A) {
     
      println(number)
  
    }
   }
}