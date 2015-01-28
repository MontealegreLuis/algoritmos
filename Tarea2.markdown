#Insertion Sort
##descripción
El **ordenamiento por inserción** _(insertion sort en inglés)_ es una manera muy natural de ordenar para un ser humano, y puede usarse fácilmente para ordenar un mazo de cartas numeradas en forma arbitraria. Requiere O(n²) operaciones para ordenar una lista de n elementos.

Inicialmente se tiene un solo elemento, que obviamente es un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a mayor, se toma el elemento k+1 y se compara con todos los elementos ya ordenados, deteniéndose cuando se encuentra un elemento menor (todos los elementos mayores han sido desplazados una posición a la derecha) o cuando ya no se encuentran elementos (todos los elementos fueron desplazados y este es el más pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los demás elementos.

![Ejemplo](https://lh6.googleusercontent.com/-BJlZ4IMuErs/VMGSkQx8-oI/AAAAAAAAAFA/6OXrjxgQ3_g/w300-h180-no/InsertionSort-ejemplo.gif)

###pseudocódigo
    Para i <- 2 hasta n con paso 1
        key <- a[i]
        j <- (i - 1)
        Mientas j>0 y a[j]>key Entonces
            a[j+1] <- a[j]
            j <- (j - 1)
        FinMientras
        a[j + 1] <- key
    FinPara

###Implementación en scala
```scala
object InsertionSort{
    def main(args:Array[String]){
        val A = Array(2, 200, 45, 18, 49)
        val key:Int
        val j = 0
        for(i <- 1 to A.length - 1){
            key = A(i)
            j = i - 1
            while(j > 0 && A(j) > key){
                A( j + 1) = A(j)
                j = j - 1
            }
            A(j + 1) = key
        }
        //Mandamos a imprimir el Arreglo ordenado
        for(numero <- A){
            print(numero + ", ")
        }
    }
}
```
###Desarrollo
![Tabla](https://lh5.googleusercontent.com/-x3c81RF0kJo/VMGRSh7FZeI/AAAAAAAAAEY/WhesPLQumxU/w720-h301-no/Tabla.JPG)

![Formula](https://lh4.googleusercontent.com/-kalDxqPUCek/VMGWt2S-_2I/AAAAAAAAAGA/MnSzNTJEQjs/w703-h40-no/formulaInsertionSort.JPG)

![Imagen2](https://lh4.googleusercontent.com/-zoP1Wot9aBY/VMGlRCo6uFI/AAAAAAAAAII/BJqa6nVlx4o/w674-h48-no/Formula2InsertionSort.JPG)

![Imagen3](https://lh3.googleusercontent.com/-3RZH7thIERA/VMGkVgBo7fI/AAAAAAAAAIQ/--Ig3U9TLec/w708-h54-no/Formula4InsertionSort.JPG)

![Imagen4](https://lh3.googleusercontent.com/-KeMCtSO72Io/VMGkVT_f3TI/AAAAAAAAAIY/s1AaxSU3ifo/w613-h53-no/Formula5InsertionSort.JPG)

![Imagen5](https://lh5.googleusercontent.com/-36UkdccFJaY/VMGkWHu6F4I/AAAAAAAAAIg/U13PT1f-rLU/w570-h53-no/Formula6InsertionSort.JPG)

![Imagen6](https://lh6.googleusercontent.com/-D4m9oR299Mo/VMGkWUkd-EI/AAAAAAAAAIo/DrSTgdiG8OI/w120-h46-no/Formula7InsertionSort.JPG)