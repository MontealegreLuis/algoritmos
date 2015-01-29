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

_Siendo __n__ el número de elementos del arreglo a ordenar._

No. | Instrucción | Código | Tiempo
-|--------------------|-------------------------|-----------------------------
1 |minimo = i| c1|_1_
2 | for j=i+1 to n | c2| _n +1_
3 | if lista[j] < lista[minimo] | c3| _n_
4 | minimo = j  | c4|  n
5 | intercambiar(lista[i], lista[minimo]) | c5| n


* En __1__, el tiempo es _1_  porque es una sola instrucción.
* En __2__ el tiempo es _n+1_ por ser el inicio de un ciclo sencillo y la isntrucción se repetira n más un vez adicional.
* __3, 4__ y __5__ es lo mismo que la instrucción 2, pero al estar dentro del ciclo se le resta 1.

Ahora, procedemos a calcular el orden para el peor de los casos de nuestro algoritmo.

![ec1](http://www.sciweavers.org/tex2img.php?eq=T%28x%29%20%3D%20%20%20c_%7B1%7D%20%2B%20%20c_%7B2%7D%28n%2B1%29%20%2B%20%20c_%7B3%7Dn%20%2B%20c_%7B4%7Dn%20%2B%20c_%7B5%7Dn&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0) 

Se simplifica.
![ec2](http://www.sciweavers.org/tex2img.php?eq=T%28x%29%20%3D%20%20%20c_%7B1%7D%20%2B%20%20c_%7B2%7Dn%20%2B%20c_%7B2%7D%20%2B%20%20c_%7B3%7Dn%20%2B%20c_%7B4%7Dn%20%2B%20c_%7B5%7Dn&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0) 

Se agrupa en términos independietes.
![ec3](http://www.sciweavers.org/tex2img.php?eq=T%28x%29%20%3D%20c_%7B2%7Dn%20%20%2B%20%20c_%7B3%7Dn%20%2B%20c_%7B4%7Dn%20%2B%20c_%7B5%7Dn%20%2B%20c_%7B1%7D%20%2B%20c_%7B2%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0) 
![ec4](http://www.sciweavers.org/tex2img.php?eq=T%28x%29%20%3D%20%28c_%7B2%7D%20%20%2B%20%20c_%7B3%7D%20%2B%20c_%7B4%7D%20%2B%20c_%7B5%7D%29n%20%2B%20c_%7B1%7D%20%2B%20c_%7B2%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0) 

De esta forma, nos damos cuenta de que el exponente mayor es de grado 1, por lo tanto, nuestro algoritmo es de orden 1.
