/**
 * Created by JordyCuan on 14/ene/15.
 */
class FizzBuzz extends App{
	var i = 0;

	for(i <- 1 to 100) {

		if( i % 3 == 0 && i % 5 == 0){
			println("FizzBuzz");
		}else if( i % 3 == 0 ){
			println("Fizz");
		}else if( i % 5 == 0 ){
			println("Buzz");
		}else{
			println(i);
		}
	}
}
