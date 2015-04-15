#Selection Sort

Es un algoritmo que tiene como principio encontrar el elemento mas pequeño de cada subarreglo, mientras que en cada iteración intercambia la primera posición de este con la posición del menor. Cada subarreglo se vuelve mas pequeño hasta llegar a un arreglo de tamaño 2 en el que solo se puede hacer una última ordenación.

##Pseudocodigo
		  
	n = (Lenght A) - 1

    1. for i = 1 to n - 1
    2.    menor := i
    3.    for j = i+1 to n
    4.       if A[j] < A[menor]
    5.         menor := j
    6.    if i <> menor
    7.       aux := A[i]
    8.       A[i] := A[menor]
    9.       A[menor] := aux


##Tiempo de ejecución

Obtenemos los costos de los tiempo de ejecución de cada linea del algoritmo

![Form](http://latex.codecogs.com/gif.latex?C_%7B1%7Dn&plus;C_%7B2%7D%28n-1%29&plus;C_%7B3%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7Dj&plus;C_%7B4%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28j-1%29&plus;C_%7B5%7D%5Csum_%7Bj%3D2%7D%5E%7Bn-1%7Dt_%7Bj%7D&plus;C_%7B6%7D%28n-1%29&plus;C_%7B7%7D%28t_%7Bj%7D%29&plus;C_%7B8%7D%28t_%7Bj%7D%29&plus;C_%7B9%7D%28t_%7Bj%7D%29)

###Mejor caso
Nuestro mejor caso es que el arreglo este ordenado, así tenemos:

![Form](http://latex.codecogs.com/gif.latex?C_%7B1%7Dn&plus;C_%7B2%7D%28n-1%29&plus;C_%7B3%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29&plus;C_%7B4%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29&plus;C_%7B6%7D%28n-1%29%20%5C%5C%20%5C%5C%20%3D%20n%5E%7B2%7D&plus;2n&plus;3)

En este caso el algoritmo es de orden ![Form](http://latex.codecogs.com/gif.latex?O%28n%5E2%29)

###Peor caso
Aquí suponemos que el arreglo esta ordenado inversamente, entonces:

![Form](http://latex.codecogs.com/gif.latex?C_%7B1%7Dn&plus;C_%7B2%7D%28n-1%29&plus;C_%7B3%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7Dj&plus;C_%7B4%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28j-1%29&plus;C_%7B5%7D%5Csum_%7Bj%3D2%7D%5E%7Bn-1%7Dt_%7Bj%7D&plus;C_%7B6%7D%28n-1%29&plus;C_%7B7%7D%28t_%7Bj%7D%29&plus;C_%7B8%7D%28t_%7Bj%7D%29&plus;C_%7B9%7D%28t_%7Bj%7D%29%20%5C%5C%20%5C%5C%20%3DC_%7B1%7Dn&plus;C_%7B2%7D%28n-1%29&plus;C_%7B3%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7Dj&plus;C_%7B4%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28j-1%29&plus;C_%7B5%7D%5Csum_%7Bj%3D2%7D%5E%7Bn-1%7D%28j-1%29&plus;C_%7B6%7D%28n-1%29&plus;C_%7B7%7D%28n-1%29&plus;C_%7B8%7D%28n-1%29&plus;C_%7B9%7D%28n-1%29%20%5C%5C%20%5C%5C%20%3DC_%7B1%7Dn&plus;C_%7B2%7D%28n-1%29&plus;C_%7B3%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D-1%29&plus;C_%7B4%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29&plus;C_%7B5%7D%5Csum_%7Bj%3D2%7D%5E%7Bn-1%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29&plus;C_%7B6%7D%28n-1%29&plus;C_%7B7%7D%28n-1%29&plus;C_%7B8%7D%28n-1%29&plus;C_%7B9%7D%28n-1%29%20%5C%5C%20%5C%5C%20%3D%5Cfrac%7B3%7D%7B2%7Dn%5E2&plus;%5Cfrac%7B11%7D%7B2%7Dn-6)

En este caso el algoritmo también es de orden ![Form](http://latex.codecogs.com/gif.latex?O%28n%5E2%29)