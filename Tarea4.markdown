#Algoritmo Selection Sort

El **ordenamiento por selección** (*Selection Sort en inglés*) es un algoritmo de ordenamiento que requiere O(n^2) operaciones para ordenar una lista de n elementos.

##descripción

Su funcionamiento es el siguiente:

    Buscar el mínimo elemento de la lista
    Intercambiarlo con el primero
    Buscar el siguiente mínimo en el resto de la lista
    Intercambiarlo con el segundo

Y en general:

    Buscar el mínimo elemento entre una posición i y el final de la lista
    Intercambiar el mínimo con el elemento de la posición i


##Ejemplo:

![Ejemplo](https://lh4.googleusercontent.com/-lqGD4_nfvtM/VM8UAlwJRrI/AAAAAAAAALg/841JbT8k1Qk/w400-h150/AlgoritmoSelectionSort.gif)


##Pseudocódico

****
    Para i <- 1 Hasta n ConPaso 1 Hacer
        indice <- i
        menor <- A[i]
        Para j <- (i + 1) Hasta n ConPaso 1 Hacer
            Si menor > A[j] Entonces
                menor <- A[j]
                indice <- j
            FinSi
        FinPara
        Si indice <> i Entonces
            auxiliar <- A[indice]
            A[indice] <- A[i]
            A[i] <- auxiliar
        FinSi
    FinPara

****

##Implementacón en Scala
****

```scala
object Seleccion{
    def SelectionSort(A:Array[Int], Tam:Int){
        var indice = 0
        var aux = 0
        var menor = 0
        for(i <- 0 to (Tam - 1)){
            indice = i
            menor = A(i)
            for(j <- (i + 1) to (Tam - 1)){
                if(menor > A(j)){
                    menor = A(j)
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
    def main(args:Array[String]){
        var A = Array(8, 2, 0, 7, 9, 3, 6, 2, 1, 5)
        println("El Arreglo Original:\n")
        for(i <- A){
            print(i + ", ") 
        }
        println("\n")
        SelectionSort(A, A.length)
        println("El Arreglo Ordenado:\n")
        for(i <- A){
            print(i + ", ") 
        }
    }
}
```

****

##Desarrollo

![Tabla](https://lh5.googleusercontent.com/-AzJcCSJi1u8/VM_LbW07JoI/AAAAAAAAANY/3juP3I2PCKY/w601-h360-no/Cuadro.JPG)

![Funcion1](https://lh6.googleusercontent.com/-mgvWJQNgnO4/VM_LbV9WtRI/AAAAAAAAANg/9cr131c5e9U/w929-h37-no/Funcion1.JPG)

![Funcion2](https://lh6.googleusercontent.com/-ufkg4u0QUFE/VM_LbWwsOOI/AAAAAAAAANo/NY_ozftyglI/w838-h43-no/Funcion2.JPG)

![Funcion3](https://lh5.googleusercontent.com/-BOpEhau-_V8/VM_LcAdt8FI/AAAAAAAAANw/sCPR9VmGbng/w808-h45-no/Funcion3.JPG)

![Funcion4](https://lh3.googleusercontent.com/-QesN_aPc-00/VM_LcD0HqGI/AAAAAAAAAN4/J3jDz9UOO1Q/w822-h43-no/Funcion4.JPG)

![Funcion5](https://lh4.googleusercontent.com/-I149Ojv5EKQ/VM_LcQ8-lDI/AAAAAAAAAOA/sKC-RroAtqY/w717-h38-no/Funcion5.JPG)

![Ecuacion](https://lh6.googleusercontent.com/-RKO-s0cXPFQ/VM_Lc3mbslI/AAAAAAAAAOY/DGlUoe80zg8/w133-h33-no/Funcion6.JPG)



###Por lo tanto, el algoritmo de Selection Sort es de orden (n^2).


