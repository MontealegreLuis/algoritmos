package fizz_buzz

object fizzbuzz {

  def main(args: Array[String]){
    
    println("Algoritmo que imprime los numeros del 1 al 100, si es multiplo de 3 mostrara la palabra fizz, si es multiplo de 5 mostrara buzz, si es ambos sera fizz buzz")
    fb()
  }
  
  def fb(){
    
    for(i<-1 to 100)
    {
      if(i%3 == 0 || i%5 == 0)
      {
        if(i%3 == 0)
        print("Fizz ")
        if(i%5 == 0)
        print("Buzz");
        
        println();
      }
      else
        println(i);
    }
  }
}
