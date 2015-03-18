# SelectionSort - Algoritmo

##Características

Algoritmo de ordenamiento por Selección (Selection Sort en inglés): Consiste en encontrar el menor de todos los elementos del arreglo o vector e intercambiarlo con el que está en la primera posición. Luego el segundo mas pequeño, y así sucesivamente hasta ordenarlo todo. Su implementación requiere O(n<sup>2</sup>) comparaciones e intercambios para ordenar una secuencia de elementos.
Este algoritmo mejora ligeramente el algoritmo de la burbuja. En el caso de tener que ordenar un vector de enteros, esta mejora no es muy sustancial, pero cuando hay que ordenar un vector de estructuras más complejas, la operación de intercambiar los elementos sería más costosa en este caso. Su funcionamiento se puede definir de forma general como:

- Buscar el mínimo elemento entre una posición i y el final de la lista.
- Intercambiar el mínimo con el elemento de la posición.

Entre sus ventajas destaca

- Es fácil su implementación.
- No requiere memoria adicional. 
- Realiza pocos intercambios. 
- Tiene un rendimiento constante, pues existe poca diferencia entre el peor y el mejor caso.

Entres sus desventajas están:

- Es lento y poco eficiente cuando se usa en listas grandes o medianas. 
- Realiza numerosas comparaciones.

<br>
##Pseudocódigo

![img](http://i.imgur.com/zk8QrYu.jpg)

<br>
##Cálculo del Orden


###1.- ![selection](/imgs/selectionSort/selec1.png)

###2.- ![selection](/imgs/selectionSort/selec2.png)

###3.- ![selection](/imgs/selectionSort/selec3.png)

###4.- ![selection](/imgs/selectionSort/selec4.png)


###Conociendo estas equivalencias: 
###Equivalencia 1: ![selection](/imgs/selectionSort/selec5.png)

###Equivalencia 2: ![selection](/imgs/selectionSort/selec6.png)


###5.- Sustituyendo: ![selection](/imgs/selectionSort/selec7.png)

###6.- Continuamos el desarrollo: ![selection](/imgs/selectionSort/selec8.png)

###7.- ![selection](/imgs/selectionSort/selec9.png)

###8.- ![selection](/imgs/selectionSort/selec10.png)

###9.- ![selection](/imgs/selectionSort/selec11.png)

###10.- ![selection](/imgs/selectionSort/selec12.png)

###11.- ![selection](/imgs/selectionSort/selec13.png)

###Solución - Orden del algoritmo: ![selection](/imgs/selectionSort/selec14.png)