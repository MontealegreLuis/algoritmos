========================================
#INSERTION SORT#
========================================


El ordenamiento por insertion sort es una manera muy natural de ordenar para un ser humano, y puede usarse fácilmente para ordenar un mazo de cartas numeradas en forma arbitraria. Requiere O(n²) operaciones para ordenar una lista de n elementos.

Inicialmente se tiene un solo elemento, que obviamente es un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a mayor, se toma el elemento k+1 y se compara con todos los elementos ya ordenados, deteniéndose cuando se encuentra un elemento menor (todos los elementos mayores han sido desplazados una posición a la derecha) o cuando ya no se encuentran elementos (todos los elementos fueron desplazados y este es el más pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los demás elementos.

#Pseudocodigo#

	1. Para j = 2 hasta Longitud de A
	2.     key = A[j]
	3.     i = j - 1
	4.     Mientras i > 0 y A[i] > key
	5.         A[i + 1] = A[i]
	6.         i = i - 1
	7.     A[i + 1] = key

##Tiempo de ejecución##

![ima](http://i.imgur.com/c39jKNK.png)


Ci con i para linea del código, n el número de veces a ejecutarse

Ecuación general:

![ima2](http://i.imgur.com/emvY9BA.png)

##Mejor caso: Arreglo ordenado##

![ima3](http://i.imgur.com/LWungsg.png)


##Peor caso: Arreglo inversamente ordenado##
![ima4](http://i.imgur.com/tYT1g8z.png)



##Orden##
![ima5](http://i.imgur.com/mnP4XWT.png)