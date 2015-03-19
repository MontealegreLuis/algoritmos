object Empleados1{
    def SelectionSort(A:Array[Int], A2:Array[Int]){
        var Tam = A2.length
        var indice = 0
        var aux = 0
        var menor = 0
        for(i <- 0 to (Tam - 1)){
            indice = i
            menor = A2(i)
            for(j <- (i + 1) to (Tam - 1)){
                if(menor > A2(j)){
                    menor = A2(j)
                    indice = j
                }
            }
            if(indice != i){
                aux = A(indice)
                A(indice) = A(i)
                A(i) = aux
            }
        }
    }
    def PermutaYOrdena(A:Array[Int]){
        val tam = A.length * A.length * A.length
        var A2 = new Array[Int](A.length)
        var azar = new scala.util.Random
        for(i <- 0 to A.length - 1){
            A2(i) = azar.nextInt(tam)
        }
        SelectionSort(A,A2)
    }
    def main(args:Array[String]){
        var NumContr = 1 // Numero de contrataciones
        var A = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        PermutaYOrdena(A)
        var EmpleadoAdecuado = A(0)
        for(i <- 1 to A.length - 1){
            if(A(i) > EmpleadoAdecuado){
                NumContr += 1
                EmpleadoAdecuado = A(i)
            }
        }
        println("Se ha hecho " + NumContr + " contratacion(es)\n")
        println("El empledo mas adecuado es: " + EmpleadoAdecuado)
    }
}