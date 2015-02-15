/**
* Created by Administrador on 25/01/2015.
*/
object FizzBuzz {

  def main(args: Array[String]) {
    for (i <- 0 to 100) {
      if (i % 3 == 0 && i % 5 == 0)
        println (i+" FizzBuzz")
      else
       if (i % 3 == 0) {
        println (i+" Fizz")
      }
      else if (i % 5 == 0) {
        println (i+" Buzz")
      }
      else {
        println(i)
      }
    }
  }

}
