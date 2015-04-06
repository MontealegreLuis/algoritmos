#MERGE SORT
Algoritmo de ordenamiento por mezcla basado en la técnica divide y vencerás.
Este algoritmo funciona de la siguiente manera: 

1. Si la longitud de la lista es 0 ó 1, entonces ya está ordenada. En otro caso:
2. Dividir la lista desordenada en dos sublistas de aproximadamente la mitad del tamaño.
3. Ordenar cada sublista recursivamente aplicando el ordenamiento por mezcla.
4. Mezclar las dos sublistas en una sola lista ordenada.

El ordenamiento por mezcla incorpora dos ideas principales para mejorar su tiempo de ejecución: 

* Una lista pequeña necesitará menos pasos para ordenarse que una lista grande.
* Se necesitan menos pasos para construir una lista ordenada a partir de dos listas también ordenadas, que a partir de dos listas desordenadas. Por ejemplo, sólo será necesario entrelazar cada lista una vez que están ordenadas.

##Pseudocódigo
~~~
MERGE(A,p,q,r)
1   n1 = q - p +1
2   n2 = r - q
3   let L[1..n1+1] y R[1..n2+1] nuevos arreglos
4   para i = 1 a n1
5       L[i] = A[p + i -1]
6   para j = 1 a n2
7       R[i] = A[q + j]
8   L[n1 + 1] = 99999
9   R[n2 + 1] = 99999
10 i = 1
11 j = 1
12 para k = p a r
13    Si L[i]<=R[j]
14         A[k] = L[i]
15         i = i + 1
16    Si_no A[k] = R[j]
17              j =  j + 1
~~~
##Tiempo de ejecución
El tiempo de ejecución es la suma de los tiempos de cada línea ejecutada.
Si una línea toma ci para ejecutarse y se ejecuta n veces su tiempo total de ejecución es: c_i n

![1](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20%20c_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2Bc%7B4%7D%28%20%5Cfrac%7Bn%7D%7B2%7D%2B1%29%2Bc%7B5%7D%28%20%5Cfrac%7Bn%7D%7B2%7D%29%2Bc%7B6%7D%28%20%5Cfrac%7Bn%7D%7B2%7D%2B1%29%2Bc%7B7%7D%28%20%5Cfrac%7Bn%7D%7B2%7D%29%2Bc_%7B8%7D%2Bc_%7B9%7D%2Bc_%7B10%7D%2Bc_%7B11%7D%2Bc_%7B12%7D%28n%2B1%29%2Bc_%7B13%7Dn%2Bc_%7B14%7Dn%2Bc_%7B15%7Dn%2Bc_%7B16%7Dn%2Bc_%7B17%7Dn&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![Ecuacion 2](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20%20%28c_%7B4%7D%20%5Cfrac%7B1%7D%7B2%7D%2Bc_%7B5%7D%20%5Cfrac%7B1%7D%7B2%7D%2Bc_%7B6%7D%20%5Cfrac%7B1%7D%7B2%7D%2Bc_%7B7%7D%20%5Cfrac%7B1%7D%7B2%7D%2B%20c_%7B12%7D%2Bc_%7B13%7D%2Bc_%7B14%7D%2Bc_%7B15%7D%2Bc_%7B16%7D%2Bc_%7B17%7D%29n%20%2B%28c_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2Bc_%7B4%7D%2Bc_%7B6%7D%2Bc_%7B8%7D%2Bc_%7B9%7D%2Bc_%7B10%7D%2Bc_%7B11%7D%2Bc_%7B12%7D%20%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Por lo tanto el tiempo de ejecución es una función lineal de n.
![Ecuacion 4](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20%20%28a%29n%20%2B%20c&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)


Por lo tanto es de: 
![5](http://www.sciweavers.org/tex2img.php?eq=%20%5CTheta%20%28n%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

**Autor: ** *Guadalupe Nayeli Martínez Castillo*

