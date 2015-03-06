# INSERTION-SORT

**Insertion-sort** es un algoritmo eficiente para la clasificación de un pequeño número de elementos. La ordenación por inserción funciona de la misma manera como se podría ordenar una o ginebra, es decir, a partir de una mano vacía izquierda y las cartas boca abajo sobre la mesa. Una carta a la vez se retira entonces de la mesa y se inserta en la posición correcta en la mano izquierda. Para encontrar la posición correcta para una tarjeta, que se compara con cada uno de que ya están en la mano de las tarjetas, de derecha a izquierda. El pseudocódigo para la inserción especie se presenta en un procedimiento llamado INSERCIÓN-SORT, que toma como parámetro un arreglo A [1. . n] que contiene una secuencia de longitud n que se va a clasificar. (En el código, el número n de elementos de A se denota por la longitud [A].) Los números de entrada se clasifican según el lugar: los números se reorganizan dentro de un arreglo A. El arreglo de entrada A contiene la secuencia de salida ordenados cuando la Inserción SORT está terminado.

#### Pseudocódigo
INSERTION-SORT (A)																

1.  for j <- 2 to length[A]	
2.       do key <- A[j]
3.         Insert A[j] into the sorted sequence A[1 . . j - 1].
4.        i <- j - 1
5.        while i > 0 and A[i] > key
6.           do A[i + 1] <- A[i]
7.              i <- i - 1
8.        A[i + 1] <- key

![costes](http://www.ee.ryerson.ca/~courses/coe428/files/8_a.gif)

####Analisis de Insertion-Sort
costo total T(n):
![](http://www.sciweavers.org/upload/Tex2Img_1425539811/render.png)

donde  t_{j} es el numero de veces que la linea 4 se ejecuta para un valor j.

![](http://www.sciweavers.org/upload/Tex2Img_1425616166/render.png)

![](http://www.sciweavers.org/upload/Tex2Img_1425616461/render.png)

**Mejor Caso**
Analizaremos el mejor caso del algoritmo(cuando el vector está ordenado),tj=1, entonces el tiempo de ejecucion es:
![](http://www.sciweavers.org/upload/Tex2Img_1425618041/render.png)


**Peor Caso**
Analizaremos el peor caso del algoritmo(cuando el vector está en orden inverso), tj=j, entonces el tiempo de ejecución es:
![](http://www.sciweavers.org/upload/Tex2Img_1425621242/render.png)

