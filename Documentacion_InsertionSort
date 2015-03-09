#Algoritmo de inserción

##Descripción del pseudocódigo
Este pseudocódigo ordena los elementos en orden ascendente. Compara los elementos del arreglo con un ciclo **for** que va desde el segundo elemento hasta el último.
Siempre convierte al elemento de la derecha en **key** y el índice **i** va a ser el elemento de la izquierda para comparar.
Hay un **while** que, siempre y cuando haya más elementos a la izquierda (es la condición de i>0) y el elemento de la izquierda sea mayor que el de la derecha (es la condición A[i] > key), sobreescribe el elemento de la derecha con el de la izquierda y decrementa el índice **i** para que siga recorriendo hacia la izquierda mientras se cumpla la condición del **while**. De esta forma se recorre el arreglo, a partir de la posición actual, hacia la izquierda, haciendo un hueco para meter el elemento **key** que vendría siendo el más pequeño.
##Pseudocódigo
```
Insertion Sort

1  for i=2 to A.length
2  key=A[j]
3  //Insert A[j] into the sorted sequence A[1,..., j-1]
4  i=j-1
5  while i > 0 and A[i] > key
6  A[i + 1] = A[i]
7  i = i - 1
8  A[i + 1] = key
```

##Cálculo del orden
Para el cálculo del orden primero tendremos que calcular el tiempo de ejecución.
El tiempo de ejecución es la suma de los tiempos de cada línea ejecutada, así que nos iremos al peor escenario, en el que los elementos estén en orden inverso al que se desea.


[clic aqui pa ver la fórmula]( http://latex.codecogs.com/gif.latex?T%28n%29%3DC_%7B1%7Dn%20&plus;%20C_%7B2%7D%28n-1%29%20&plus;%20C_%7B4%7D%28n-1%29%20&plus;%20C_%7B5%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7Dt_%7Bj%7D%20&plus;%20C_%7B6%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D-1%29%20&plus;%20C_%7B7%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D-1%29%20&plus;%20C_%7B8%7D%28n-1%29 )
