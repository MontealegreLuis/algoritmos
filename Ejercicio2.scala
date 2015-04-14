object Ejercicio2{
    def SelectionSort(A:Array[Int], B:Array[Int]){
        var Tam = B.length
        var indice = 0
        var aux = 0
        var menor = 0

        for(i <- 0 to (Tam - 1)){
            indice = i
            menor = B(i)
            for(j <- (i + 1) to (Tam - 1)){
                if(menor > B(j)){
                    menor = B(j)
                    indice = j
                }
            }
            if(indice != i){
                aux = A(indice)
                A(indice) = A(i)
                A(i) = aux
            }
        }

println("El arreglo ordenado de acuerdo a las prioridades es:\n")
        for(i <- A)
            print(i + ", ")

      println("\n")
    }


    def PermutaYOrdena(A:Array[Int]){
        val n = A.length
        var B = new Array[Int](A.length)
        var Ran = new scala.util.Random
       
        for(i <- 0 to A.length - 1){
            B(i) = Ran.nextInt(n)
        }

        println("El arreglo con prioridades es:\n")
        for(i <- B)
            print(i + ", ")

      println("\n")
        SelectionSort(A,B)
    }

    def main(args:Array[String]){

        var Contrataciones = 1 // Numero de contrataciones
        var A = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
     
 println("El arreglo Original es:\n")
        for(i <- A)
            print(i + ", ")
      println("\n")


        PermutaYOrdena(A)
       //Asumimos que el primero es el mejor
        var EmpleadoAdecuado = A(0)
       
        //Aqui los comparamos con los demas si relamente es el mejo
        //Sino cambiamos y aumentamos el numero de veces de contratacion
        for(i <- 1 to A.length - 1){
            if(A(i) > EmpleadoAdecuado){
                Contrataciones += 1
                EmpleadoAdecuado = A(i)
            }
        }

        println("Se realizo" + Contrataciones + " contrataciones\n")
        println("El empledo adecuado es: " + EmpleadoAdecuado)
    }
}


//Randomized-hire-assitent
