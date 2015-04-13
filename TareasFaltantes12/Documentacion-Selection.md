#SELECTION-SORT #

Consiste en encontrar el menor de todos los elementos del arreglo o vector e intercambiarlo con el que está en la primera posición. Luego el segundo mas pequeño, y así sucesivamente hasta ordenarlo todo. Su implementación requiere O(n2) comparaciones e intercambios para ordenar una secuencia de elementos. 

#### Descripción ####

Este algoritmo mejora ligeramente el algoritmo de la burbuja. En el caso de tener que ordenar un vector de enteros, esta mejora no es muy sustancial, pero cuando hay que ordenar un vector de estructuras más complejas, la operación de intercambiar los elementos sería más costosa en este caso. Su funcionamiento se puede definir de forma general como:

*Buscar el mínimo elemento entre una posición i y el final de la lista*
*Intercambiar el mínimo con el elemento de la posición i*

Así, se puede escribir el siguiente **pseudocódigo** para ordenar una lista de n elementos indexados desde el 1: 

![](https://moshalg.files.wordpress.com/2012/06/pseudo_2.png)

#### Analisis ####


- ¿Cómo medimos el tiempo?
 - Cantidad de operaciones
 - Alcanza con contar cantidad de comparaciones
- Arreglo con n elementos
- n-1 ejecuciones del ciclo principal
- En la i-ésima iteración hay que encontrar el mínimo de entre n-i
elementos y por lo tanto necesitamos n-i-1 comparaciones
 ![](http://www.sciweavers.org/upload/Tex2Img_1428813409/render.png)
- Observar que el costo no depende del eventual ordenamiento parcial o
total del arreglo


