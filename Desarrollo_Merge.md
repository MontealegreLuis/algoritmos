#Algortimo de Merge Sort
###Descripción
Es un método de ordenamiento, la idea general es que: Dados dos conjuntos ordenados, A y B, si los mezclamos entre ambos, tomando los valores de ellos en orden, entonces nos va quedar el conjunto ordenado C, con los elementos de A y B.

La condición de paro ocurre cuando la secuencia a ordernar es de longitud 1, en cuyo caso no hay nada que hacer, porque una secuencia de un elemento ya se encuentra ordenada.

###Pseudocódigo
~~~
MERGE(A,p,q,r)
	n1 = q-p+1
	n2 = r-q
	     let L[1...n1+1] and R[1...n2+1] be new arrays
	for i = to n1
	     L[i] = A[p+i-1]
	for j = 1 to n2
	      R[j] = A[q+j]
	L[n1 + 1] = inifinto
	R[n2 + 1] = inifinto
	i = 1
	j = 1
	for k = p to r
	       if L[i] <= R[j]
			A[k] = L[i]
		else A[k] = R[j]
			j = j+1
~~~
###Desarrollo 

![img](http://www.sciweavers.org/tex2img.php?eq=%0AC_%7B1%7D%20%3D%201%0A%0AC_%7B2%7D%20%3D%201%0A%0AC_%7B3%7D%20%3D%201%0A%0AC_%7B4%7D%20%3D%20%20%28%5Cfrac%7Bn%7D%7B2%7D%29%2B1%20%0A%0AC_%7B5%7D%20%3D%20%20%5Cfrac%7Bn%7D%7B2%7D%0A%0AC_%7B6%7D%20%3D%20%20%28%5Cfrac%7Bn%7D%7B2%7D%29%2B1%20%20%0A%0AC_%7B7%7D%20%3D%20%20%5Cfrac%7Bn%7D%7B2%7D%20%0A%0AC_%7B8%7D%20%3D%201%0A%0AC_%7B9%7D%20%3D%201%0A%0AC_%7B10%7D%20%3D%201%0A%0AC_%7B11%7D%20%3D%201&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=%0A%0AC_%7B12%7D%20%3D%20n%2B1%0A%0AC_%7B13%7D%20%3D%20%20n%0A%0AC_%7B14%7D%20%3D%20%20n%0A%0AC_%7B15%7D%20%3D%20%20n%0A&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])


![Imagen1](https://lh3.googleusercontent.com/-q60H071QRWs/VMhBuMrLONI/AAAAAAAAAK8/cKP2SL_2P18/w1044-h45-no/Imagen1.JPG)

![Imagen2](https://lh3.googleusercontent.com/-y7L6WbimYsg/VMhBuSPPvqI/AAAAAAAAALE/sR-4Yg-kXOc/w1008-h57-no/Imagen2.JPG)

![Imagen3](https://lh6.googleusercontent.com/-PDkdNkpMM40/VMhBurZPl6I/AAAAAAAAALM/EA-G0hCV1sU/w160-h44-no/Imagen4.JPG)

#####Como podemos observar el orden del algoritmo es O(n)

**_Autor: Rene Almeida Lopez_**
