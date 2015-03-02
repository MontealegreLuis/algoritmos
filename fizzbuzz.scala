object fizzbuzz{
     def main (args: Array [String]){
     comparacion()
  }

   def comparacion(){
	for(i<-0 to 100){
	  if(((i%3)!=0)&&((i%5)!=0))
             print(i)
	  mod(i)
	  println("")
	}
   }

   def mod(i: Int){
      if(i%3==0)
        print("fizz")
      if(i%5==0)
        print("buzz")
   }	

}



