//Daniel Elias Vazquez Lobato
//Implematacion del Algoritmo SelectionSort
//Analisis y Diseño de Algoritmos

object SelectionSort {
  
  def main(args: Array[String]){
        var A = Array(5,11,3,9,5,2,4,28,1)

        println("Arreglo original: ")
            for(i<-0 to A.length-1)
                print(A(i)+" ")

    //aqui se impelemta el algoritmo de SelectionSort

        var total = A.length;

        for(i<-0 to total-2){
          var menor = i;
            for(j<-i+1 to total-1)
              {
              if(A(j) < A(menor))
                  menor = j
              }

              if( i != menor){
                var aux = A(i)
                A(i) = A(menor)
                A(menor) = aux
              }
            }

        println("\nArreglo ordenado: ")
            for(i<-0 to A.length-1)
                print(A(i)+" ")
  }
}
