//Daniel Elias Vazquez Lobato
//Implematacion del Algoritmo FizzBuzz
//Analisis y Diseño de Algoritmos

object FizzBuzz{

def main(args: Array[String]){

val num = 0
val c1 = "Fizz"
val c2 = "Buzz"

for(i <- 1 to 100){
	if( (i%3 == 0) && (i%5 == 0)){
		println(c1+c2)
	}else
		if( i%3 == 0){
			println(c1)
	}else
		if(i%5 == 0){
			println(c2)
		}
	else{
		println(i)
		}
	}
}

}



