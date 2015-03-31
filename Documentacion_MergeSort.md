#Algoritmo de MergeSort
##Descripción del pseudocódigo
En el pseudocódigo se crean dos nuevos subarreglos a partir del original. También se considera que los dos subarreglos están ordenados.
Las primeras dos lineas es para obtener el índice superior que van a tener los subarreglos, el izquierdo y derecho respectivamente. Como **p** <= **q** < **r**, la línea 1 se encarga de que el subarreglo tenga longitud de uno.
El primer **for** es para almacenar la parte izquierda en un nuevo arreglo llamado L.
El segundo **for** es para almacenar la parte derecha en un nuevo arreglo llamado R.
Las lineas 8 y 9 agregan un elemento muy grande al final de cada subarreglo para que cuando se vaya haciendo la mezcla tenga un elemento de paro y pueda tomar los demás elementos del otro subarreglo.
Las lineas 10 y 11 vuelven a inicializar los índices para hacer la mezcla. 
El último **for** recorre desde **p** hasta **r** para ir modificando el arreglo original. Dentro del **for** hay un **if** para saber qué elemento de qué subarreglo se va a insertar en el arreglo original, por lo cual se manejan los dos índices, **i** y **j**, que se modifican conforme se elige el subarreglo izquierdo o derecho.
##Pseudocódigo
```
MergeSort(A, p, q, r)

1  n1 = q - p + 1
2  n2 = r - q
3  sean L[1 ... n1 + 1] y R[1 ... n2 + 1] nuevos arreglos
4  for i = 1 to n1
5  	L[i] = A[p + i - 1]
6  for j = 1 to n2
7  	R[j] = A[q + j]
8  L[n1 + 1] = 99999
9  R[n2 + 1] = 99999
10  i = 1
11  j=1
12  for k = p to r
13        if L[i] <= R[j]
14		A[k] = L[i]
15		i = i + 1
16	     else	A[k] = R[j]
17	     j = j + 1
```

##Cálculo del orden
Para el cálculo del orden primero tendremos que calcular el tiempo de ejecución.
El tiempo de ejecución es la suma de los tiempos de cada línea ejecutada.
```
																Costo		Num de veces

1  n1 = q - p + 1												  c1			1
2  n2 = r - q													  c2			1
3  sean L[1 ... n1 + 1] y R[1 ... n2 + 1] nuevos arreglos		  c3			0
4  for i = 1 to n1												  c4		  n1 + 1
5  	L[i] = A[p + i - 1]											  c5			n1
6  for j = 1 to n2												  c6		  n2 + 1
7  	R[j] = A[q + j]												  c7			n2
8  L[n1 + 1] = 99999											  c8			1
9  R[n2 + 1] = 99999											  c9			1
10  i = 1														  c10			1
11  j=1															  c11			1
12  for k = p to r												  c12			1
13        if L[i] <= R[j]										  c13			r
14		A[k] = L[i]												  c14			r
15		i = i + 1												  c15			r
16	     else	A[k] = R[j]
17	     j = j + 1
```
Aquí se omitieron las líneas 16 y 17 porque entre las lineas 13 y 16 dan un número de veces **r** y entre las líneas 15 y 17 dan un número de veces **r**.

[clic aqui pa ver la primer fórmula]( http://latex.codecogs.com/gif.latex?T(n)=c1&plus;c2&plus;c4(n1&plus;1)&plus;c5(n1)&plus;c6(n2&plus;1)&plus;c7(n2)&plus;c8&plus;c9&plus;c10&plus;c11&plus;c12(r&plus;1)&plus;c13(r)&plus;c14(r)&plus;c15(r) )

Realizando las multiplicaciones queda:
[clic aqui para la segunda fórmula]( http://latex.codecogs.com/gif.latex?T(n)=c1&plus;c2&plus;c4(n1)&plus;c4&plus;c5(n1)&plus;c6(n2)&plus;c6&plus;c7(n2)&plus;c8&plus;c9&plus;c10&plus;c11&plus;c12(r)&plus;c12&plus;c13(r)&plus;c14(r)&plus;c15(r) )

Agrupando nos queda:
[clic para ver la tercer fórmula]( http://latex.codecogs.com/gif.latex?T(n)=(c4&plus;c5){\color{Red}&space;n1}&plus;(c6&plus;c7){\color{Red}&space;n2}&plus;(c12&plus;c13&plus;c14&plus;c15){\color{Red}&space;r}&plus;(c1&plus;c2&plus;c4&plus;c6&plus;c8&plus;c9&plus;c10&plus;c11&plus;c12) )