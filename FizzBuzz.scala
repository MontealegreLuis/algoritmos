object FizzBuzz {
 
 
 
    
    //   if(i%5==0&&i%3==0){
    //  System.out.println("Fizz Buzz");
    //}

    def  main( args:Array[String]){
      
  var i=1
    
     for (i<- 1 to 100) {
    if(i%5==0 && i%3==0){
     println("Fizz_Buzz")
    }
     else{ if (i %3==0)
      println("Fizz")
   
    else{ if(i%5==0)
      println("Buzz")
      else {if(i%5!=0 && i%3!=0)
        println(i)}
    }
    }
    
     }
  }
    
  
}