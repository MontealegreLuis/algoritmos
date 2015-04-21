import scala.util.Random

object RIP{
    
    def Randomize_in_Place(A:Array[Int]){
	var n = A.length
        var k = 0
	var temp = 0
	var rand = new Random
        for(i <- 0 to n - 1){
            k = rand.nextInt(n-1)
	    temp = A(i)	
            A(i) = A(k)
            A(k) = temp
        }
    }
    
    def Imprime(A:Array[Int]){
		for(i<-0 to A.length-1)
			print(" "+A(i))
		println("")	
    }

    def main(args:Array[String]){
        var A = Array(1,2,3,4)      
        println("Arreglo inicial:")
	Imprime(A)       
        Randomize_in_Place(A)
        println("Arreglo permutado:")
        Imprime(A)       
    }

}
