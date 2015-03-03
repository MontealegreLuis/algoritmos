# Ordenamiento por Selección #

Este algoritmo mejora ligeramente el algoritmo de la burbuja. En el caso de tener que ordenar un vector de enteros, esta mejora no es muy sustancial, pero cuando hay que ordenar un vector de estructuras más complejas, la operación de intercambiar los elementos sería más costosa en este caso. Su funcionamiento se puede definir de forma general como:


Buscar el mínimo elemento entre una posición i y el final de la lista
Intercambiar el mínimo con el elemento de la posición i

### Pseudocodigo ###

----------
	para i=1 hasta n-1;
   		minimo = i;
   		para j=i+1 hasta n
       		si lista[j] < lista[minimo] entonces
           		minimo = j 
       		fin si
   		fin para
   		intercambiar(lista[i], lista[minimo])
	fin para

### Implementacion en Scala ###
----------
    object Seleccion{
    def SelectionSort(A:Array[Int], Tamayo:Int){
      var aux = 0 
      var index = 0
      var men = 0
        for(i <- 0 to (Tamayo - 1)){
            index = i
            men = A(i)
            for(j <- (i + 1) to (Tamayo - 1)){
                if(men > A(j)){
                    men = A(j)
                    index = j
                }
            }
            if(index != i){
                aux = A(index)
                A(index) = A(i)
                A(i) = aux
            }
        }
    }
    def main(args:Array[String]){
        var A = Array(98,89,1,0,44,2,55,21,5)
        print("Original: ")
        for(Cont <- A){print(Cont + " ")}
        print("\n")
        SelectionSort(A, A.length)
        print("Ordenado: ")
        for(Cont <- A){print(Cont + " ")}
     }
    }