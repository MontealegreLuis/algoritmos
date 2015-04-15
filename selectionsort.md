#Algoritmo de ordenamiento por selección (selection sort)

##Descripción##

Consiste en encontrar el menor de todos los elementos del arreglo o vector e intercambiarlo con el que está en la primera posición. Luego el segundo mas pequeño, y así sucesivamente hasta ordenarlo todo.

Este algoritmo mejora ligeramente el __algoritmo de la burbuja__. En el caso de tener que ordenar un vector de enteros, esta mejora no es muy sustancial, pero cuando hay que ordenar un vector de estructuras más complejas, la operación de intercambiar los elementos sería más costosa en este caso. Su funcionamiento se puede definir de forma general como:

* Buscar el mínimo elemento entre una posición _i_ y el final de la lista.
* Intercambiar el mínimo con el elemento de la posición _i_.

##*Pseudocódigo*

	Paso 1: minimo = i
	Paso 2:		for j=i+1 to n
	Paso 3:			if lista[j] < lista[minimo]
	Paso 4:				minimo = j 
	Paso 5:			intercambiar(lista[i], lista[minimo])

##*Cálculo de orden* 
Antes de calcular el orden del algoritmo, primero se debe encontrar el tiempo de ejecución de cada isntrucción, como se muestra en la siguiente tabla.

Siendo n el número de elementos del arreglo a ordenar.

![Imgur](http://i.imgur.com/FN9tDLZ.png)

* En __1__, el tiempo es _1_  porque es una sola instrucción.
* En __2__ el tiempo es _n+1_ por ser el inicio de un ciclo sencillo y la isntrucción se repetira n más un vez adicional.
* __3, 4__ y __5__ es lo mismo que la instrucción 2, pero al estar dentro del ciclo se le resta 1.

Ahora, procedemos a calcular el orden para el peor de los casos de nuestro algoritmo.
![ec1](http://i.imgur.com/YnooRcx.png) 

Se simplifica.
![ec2](http://i.imgur.com/NEBybEH.png) 

Se agrupa en términos independietes.
![ec3](http://i.imgur.com/2NmNVN2.png)
![ec4](http://i.imgur.com/40QmwIA.png) 

De esta forma, nos damos cuenta de que el exponente mayor es de grado 1, por lo tanto, nuestro algoritmo es de orden 1.