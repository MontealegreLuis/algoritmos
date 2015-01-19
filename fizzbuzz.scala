object fizzbuzz {
    def Evaluador(num:Int, div:Int) : Boolean = {
        if(num % div == 0)
            return true
        else
            return false
    }
    def main(args:Array[String]){
        for(i <- 1 to 100){
            if(Evaluador(i, 3) == true && Evaluador(i, 5) == true)
                print("Fizz.Buzz, ")
            else if(Evaluador(i, 3) == true)
                print("Fizz, ")
            else if(Evaluador(i, 5) == true)
                print("Buzz, ")
            else
                print(i + ", ")
        }
    }
}