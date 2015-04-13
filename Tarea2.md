#Algoritmo de inserción

##Descripción del pseudocódigo
Este pseudocódigo ordena los elementos en orden ascendente. Compara elemento por elemento comenzando desde el lugar dos contra el uno, así hasta terminar.

Hay un **while** que, siempre y cuando haya más elementos a la izquierda y el elemento de la izquierda sea mayor que el de la derecha, sobreescribe el elemento de la derecha con el de la izquierda y decrementa el índice **i** para que siga recorriendo hacia la izquierda mientras se cumpla la condición del **while**. Así se recorre el arreglo, a partir de la posición actual, hacia la izquierda, haciendo un hueco para meter el elemento **key** que vendría siendo el más pequeño.
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
El tiempo de ejecución es la suma de las veces en las que se ejecuta una instrucción. A continuación se hará el cálculo:

[clic aqui pa ver la fórmula]( http://latex.codecogs.com/gif.latex?T%28n%29%3DC_%7B1%7Dn%20&plus;%20C_%7B2%7D%28n-1%29%20&plus;%20C_%7B4%7D%28n-1%29%20&plus;%20C_%7B5%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7Dt_%7Bj%7D%20&plus;%20C_%7B6%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D-1%29%20&plus;%20C_%7B7%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D-1%29%20&plus;%20C_%7B8%7D%28n-1%29 )
