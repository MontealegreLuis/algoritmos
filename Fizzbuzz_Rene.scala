

object Fizzbuzz_Rene {


    def main (args: Array[String]){
         
         for(i<-0 to 100){
            if((i%3)==0 ||(i%5==0)){
		        if((i%3)==0){
					print(" Fizz")
					}
			   if((i%5)==0){
				   print(" buzz")
					}
                      println("")
                      }   
                       else
                            {
		println(" "+i)
			}	
       }
    
    }



}
