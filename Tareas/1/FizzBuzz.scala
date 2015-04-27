//Tarea 1
//Rayen Ari Ramos Rocha
//201126031


//Programa que verica del 1 al 100 si es divisible entre 3 se imprimira en pantalla fizz, si es divisible entre 5 buzz
//pero si es divicible entre 3 y 5 se imprime fizzbuzz.


object FizzBuzz{
	def main(args: Array[String]){

		// Variables
		var buzz = "buzz"
		var fizz = "fizz"
		var fizzbuzz = "FizzBuzz"

		//se verifica del 1 al 100 cuales son divisibles entre 5, 3 o 5 y 3.
		for( i <- 0 to 100) {
			if((i % 5 == 0) && (i % 3 == 0)) {
			  println(fizzbuzz);
			}
			else if(i % 3 == 0){
				println(fizz);
			        }
				else if(i % 5 == 0){
					println(buzz)
				        }
				else
					println("No es un numero divisible de 3 ni de 5");	
			
		}
	}
}