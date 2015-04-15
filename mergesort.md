#Algoritmo de ordenamiento por mezcla (merge sort)

##Descripción##

Mergesort es un **algoritmo de divide y vencerás** inventado porJohn von Neumann en 1945.

En términos generales, mergesort trabaja de la siguiente manera:

1. Si la longitud de la lista es 0 ó 1, entonces ya está ordenada. En otro caso:
2. Dividir la lista desordenada en dos sublistas de aproximadamente la mitad del tamaño.
3. Ordenar cada sublista recursivamente aplicando el ordenamiento por mezcla.
4. Mezclar las dos sublistas en una sola lista ordenada.

La razón por la que este algoritmo mejora el tiempo de ejecución respecto a otros, es el siguiente:

* Una lista pequeña necesitará menos pasos para ordenarse que una lista grande.
* Se necesitan menos pasos para construir una lista ordenada a partir de dos listas también ordenadas, que a partir de dos listas desordenadas. Por ejemplo, sólo será necesario entrelazar cada lista una vez que están ordenadas.

Todo esto garantizado por el principio de divide y vencerás y la recursividad.

##Pseudocódigo##

	Paso 1: n1 = q - (p + 1)
	Paso 2: n2 = r - q
	Paso 3: con L[1...n1 + 1] y R[1...n2 + 1] como nuevos arreglos
	Paso 4: Para i = 1 Hasta n1
	Paso 5: 	L[i] = A[p+i-1]
			 FinPara
	Paso 6: Para j = 1 Hasta n2
	Paso 7: 	R[j] = A[q + j]
			 FinPara
	Paso 8: L[n1 + 1] = infinito
	Paso 9: R[n2 + 1] = infinito
	Paso 10: i=1
	Paso 11: j=1
	Paso 12: Para k = p Hasta r
	Paso 13: 	Si L[i] <= R[j] Entonces
	Paso 14: 		A[k] = L[i]
	Paso 15: 		i = i+1
					sino
	Paso 16: 		 	A[k] =R[j]
	Paso 17 :   			j = j+1
					finsino
				fin Si
			   finpara

 ##*Cálculo de orden* 
Antes de calcular el orden del algoritmo, primero se debe encontrar el tiempo de ejecución de cada isntrucción, como se muestra en la siguiente tabla.

Siendo n el número de elementos del arreglo a ordenar.

|No. | Instrucción | Código | Tiempo|
|-|-|-|-|
|1 |n1 = q - (p + 1)								| c1	|_1_|
|2 |n2 = r - q							| c2	|_1_|
|3 |con L[1...n1 + 1] y R[1...n2 + 1] como nuevos arreglos| c3	|_1_|
|4 |Para i = 1 Hasta n1						| c4	|_(n/2 + 1)_|
|5 |L[i] = A[p+i-1]	| c5	|_(n/2)_|
|6 | Para j = 1 Hasta n2								| c6	|_(n/2) + 1_|
|7 | R[j] = A[q + j]					| c7	|__(n/2)__|
|8 | L[n1 + 1] = infinito 				| c8	|_1_|
|9 | R[n2 + 1] = infinito					| c9	|_1_||
|10 | i = 1	| c10	|_1_|
|11 | j = 1)	| c11	|_1_|
|12|Para k = p Hasta r| c12	|_n+1_|
|13 |Si L[i] <= R[j] Entonces						| c13	|_n_|
|14| A[k] = L[i]| c14	|_n_|
|15| i = i+1 							| c15	|n|

T(x) = a(n) + c

De esta forma, nos damos cuenta de que el exponente mayor es de grado 1, por lo tanto, nuestro algoritmo es de orden O(n).