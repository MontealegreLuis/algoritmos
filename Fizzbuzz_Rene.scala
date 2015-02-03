

object Fizzbuzz_Rene {


    def main (args: Array[String]){
         
         for(i<-0 to 100){
            if((i%3)==0 ||(i%5==0)){
		        if((i%3)==0){
					System.out.print(" Fizz");
					}
			   if((i%5)==0){
					System.out.print(" buzz");
					}
                      System.out.println("");
                      }   
                       else{
					System.out.println(" "+i);
						}	
       }
    
    }



}
