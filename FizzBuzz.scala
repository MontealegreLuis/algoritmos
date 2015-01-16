object FizzBuzz {
    def main(args: Array[String]) {
       for (i <- 0 to 100) {
           if (i % 3 == 0) {
               println ("Fizz")
           } else {
               println(i)
           }
       }
    }
}
