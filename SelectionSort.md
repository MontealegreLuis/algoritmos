#Algoritmo de ordenamiento "Selection-Sort"
##Características

Algoritmo de ordenamiento por Selección (Selection Sort en inglés): Consiste en encontrar el menor de todos los elementos del arreglo o vector e intercambiarlo con el que está en la primera posición. Luego el segundo mas pequeño, y así sucesivamente hasta ordenarlo todo. Su implementación requiere O(n2) comparaciones e intercambios para ordenar una secuencia de elementos.
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

##Pseudocódigo

![Imgur](http://i.imgur.com/zk8QrYu.jpg)

##Calculos

Usaremos los siguientes costos por instrucción para calcular el orden de crecimiento del algoritmo

![Imgur](http://i.imgur.com/o9Zrzlr.jpg)

###Paso 1:
![Imgur](http://i.imgur.com/VaD6kdH.jpg)

###Paso 2:
![Imgur](http://i.imgur.com/tj2Py0F.jpg)

###Paso 3:
![Imgur](http://i.imgur.com/ubYE87U.jpg)

###Paso 4:
Para este paso usaremos las siguiente formulas

####T1
![Imgur](http://i.imgur.com/cXsX1ZP.jpg)

####T2
![Imgur](http://i.imgur.com/kIydkXM.jpg)

Con lo anterior queda

![Imgur](http://i.imgur.com/v9wGqOI.jpg)

###Paso 5:
![Imgur](http://i.imgur.com/oclKpL2.jpg)

###Paso 6:
![Imgur](http://i.imgur.com/ViWI21K.jpg)

###Paso 7:
![Imgur](http://i.imgur.com/USKAD3s.jpg)

###Paso 8:
![Imgur](http://i.imgur.com/pXGkyvo.jpg)

###Paso 9:
![Imgur](http://i.imgur.com/uLh6sSl.jpg)

###Paso 10:
![Imgur](http://i.imgur.com/hYHowm6.jpg)

###Paso 11:
![Imgur](http://i.imgur.com/va2VeNb.jpg)


Considerando únicamente el término principal de la fórmula el orden de crecimiento del algoritmo es:


![Imgur](http://i.imgur.com/9NZmQbT.jpg)
