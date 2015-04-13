#**Insertion-Sort**#
##Descripción del algoritmo##
 Este método consiste en ordenar el arreglo desplazando los elementos mayores hacia la parte derecha y los inferiores hacia la parte izquierda.
El método toma a cada elemento de la estructura y los compara con los que se encuentran en posiciones anteriores a la de él, dentro de la estructura; si resulta que el elemento con el que se está comparando es mayor que el elemento a ordenar, se recorre hacia la siguiente posición superior. Si por el contrario, si es menor; se detiene el proceso de comparación debido a que se encontró que el elemento ya esta ordenado y se coloca en su posición.

###Pseudocódigo###

    function insertionSort(array A)
    for i from 1 to length[A]-1 do
        value := A[i] 
        j := i-1
        while j >= 0 and A[j] > value do
            A[j+1] := A[j]
            j := j-1
        done
        A[j+1] = value
        
    done     
    
    

####Costos###
![Texto alternativo](http://1.bp.blogspot.com/-sxdZxjZaLOI/T4eJc97MIGI/AAAAAAAAAi8/IsbiP78JnBQ/s1600/code-cost.png "Título de la imagen")
El mejor de los casos
![Texto alternativo](http://3.bp.blogspot.com/-oGLtdQYlZOU/T4eUys_PRiI/AAAAAAAAAjM/WAdJwRPKyUI/s1600/sumatory-best-case.png "Título de la imagen")

En el peor de los casos
![Texto alternativo](http://2.bp.blogspot.com/-cbjZoyO762k/T4eWzJMzuVI/AAAAAAAAAjU/3Uaj-75Te3M/s1600/sumatory-worst-case.png "Título de la imagen")

Por lo tanto nos da como resultado que el ordenamiento por inserción tiene un worst-case running time de   ****Θ(n^2).****

