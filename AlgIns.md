#Algoritmo de inserción

###*Descripción del algoritmo*

Inicialmente se tiene un solo elemento, que obviamente es un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a mayor, se toma el elemento k+1 y se compara con todos los elementos ya ordenados, deteniéndose cuando se encuentra un elemento menor (todos los elementos mayores han sido desplazados una posición a la derecha) o cuando ya no se encuentran elementos (todos los elementos fueron desplazados y este es el más pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los demás elementos.

###*Algoritmo*

 1. Para j = 2 hasta Longitud de A
 2. key = A[j]
 3. i = j - 1
 4. Mientras i > 0 y A[i] > key
 5. A[i + 1] = A[i]
 6. i = i - 1
 7. A[i + 1] = key



###*Tiempo de ejecucion*
El tiempo de ejecución es la suma de los tiempos de cada linea que se ejecuta. Tomando el algoritmo, la ecuación queda así:

![Formula](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%3Dc_%7B1%7D%2Bc_%7B2%7D%28n-1%29%2Bc_%7B3%7D%28n-1%29%2Bc_%7B4%7D%5Csum_%7Bj%3D2%7D%5En%28t_%7Bj%7D%29%2Bc_%7B5%7D%5Csum_%7Bj%3D2%7D%5En%28t_%7Bj%7D-1%29%2Bc_%7B6%7D%5Csum_%7Bj%3D2%7D%5En%28t_%7Bj%7D-1%29%2Bc_%7B7%7D%28n-1%29&bc=White&fc=Black&im=jpg&fs=12&ff=modern&edit=0)

#####*Mejor caso*
En este algoritmo el mejor caso ocurre cuando el algoritmo ya esta ordenado asi que la formula se desarrolla de la siguiente manera

![Form](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20c_%7B1%7Dn%20%2B%20c_%7B2%7D%28n-1%29%20%2B%20c_%7B3%7D%28n-1%29%2Bc_%7B4%7D%28n-1%29%2Bc_%7B7%7D%28n-1%29&bc=White&fc=Black&im=jpg&fs=12&ff=modern&edit=0)
![Form](http://www.sciweavers.org/tex2img.php?eq=%3D%28c_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2Bc_%7B4%7D%2Bc_%7B7%7D%29n-%28c_%7B2%7D%2Bc_%7B3%7D%2Bc_%7B4%7D%2Bc_%7B7%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=modern&edit=0)

![Form](http://www.sciweavers.org/tex2img.php?eq=%3Dan%2Bb&bc=White&fc=Black&im=jpg&fs=12&ff=modern&edit=0)

El orden de crecimiento es de O(n)

#####*Peor caso*
Para algunos algoritmos el peor caso sucede frecuentemente.

Simplificando la ecuacion.
![Form](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20c_%7B1%7Dn%20%2B%20c_%7B2%7D%28n-1%29%20%2B%20c_%7B3%7D%28n-1%29%2Bc_%7B4%7D%28%5Cfrac%7Bn%28n%2B1%29%7D%7B2%7D-1%29%2Bc_%7B5%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29%2Bc_%7B6%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29%2B%20c_%7B7%7D%28n-1%29&bc=White&fc=Black&im=jpg&fs=12&ff=modern&edit=0)

![Form](http://www.sciweavers.org/tex2img.php?eq=%3D%28%5Cfrac%7Bc_%7B4%7D%7D%7B2%7D%29%2B%28%5Cfrac%7Bc_%7B5%7D%7D%7B2%7D%29%2B%28%5Cfrac%7Bc_%7B6%7D%7D%7B2%7D%29n%5E%7B2%7D%2Bc_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2B%28%5Cfrac%7Bc_%7B4%7D%7D%7B2%7D%29%2B%28%5Cfrac%7Bc_%7B5%7D%7D%7B2%7D%29%2B%28%5Cfrac%7Bc_%7B6%7D%7D%7B2%7D%29n-%28c_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2Bc_%7B7%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=modern&edit=0)

![Form](http://www.sciweavers.org/tex2img.php?eq=%3Dan%5E%7B2%7D%2Bbn%2Bc&bc=White&fc=Black&im=jpg&fs=12&ff=modern&edit=0)

Se puede ver como una ecuacion cuadratica pero lo que realmente nos interesa es el orden de crecimiento fijandonos en el exponente

Por lo tanto el orden de crecimiento es de ![Form](http://www.sciweavers.org/tex2img.php?eq=O%28n%5E%7B2%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=modern&edit=0)



