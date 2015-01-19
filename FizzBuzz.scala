//Fizz Buzz
// Gerardo Flores Petlacalco
//201124783
//Analisis y diseño de algoritmos
object FizzBuzz{
	def main(args: Array[String]){

		//Declaracion de variables

		var fizz = "fizz"
		var buzz = "buzz"
		var fb = "FizzBuzz"

		//Entramos a un ciclo for de 1 al 100
		for( i <- 0 to 100) {
			if((i % 5 == 0) && (i % 3 == 0)) {
				println(fb);
			}
			else if(i % 3 == 0){
				println(fizz);
			}
				else if(i % 5 == 0){
					println(buzz)
				}
				else
					println(i);
				
			
		}
	}
}


