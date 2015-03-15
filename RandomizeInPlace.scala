object RandomizeInPlace{
    def RIP(A:Array[Int]){
        var azar = new scala.util.Random
        var aux = 0
        var indice = 0
        for(i <- 0 to A.length - 1){
            aux = A(i)
            indice = azar.nextInt(A.length - 1)
            A(i) = A(indice)
            A(indice) = aux
        }
    }
    def main(args:Array[String]){
        var A = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        
        println("El arreglo normal es:\n")
        for(i <- A)
            print(i + ", ")
            
        println("\n")
          
        RIP(A)
        
        println("El arreglo Permutado es:\n")
        for(i <- A)
            print(i + ", ")
    }
}