#Algoritmo de Ordenamiento "Merge Sort"
##Descripción

El método *merge sort* u *Ordenamiento por mezcla* es un algoritmo propuesto en 1945 por John Von Neumann. Se basa en la técnica de diseño Divide y Vencerás.

Consiste en dividir el problema a resolver en subproblemas del mismo tipo que a su vez se dividirán, mientras no sean suficientemente pequeños o triviales.

Para ello sigue una serie de pasos detallados a continuación:

1. Ordenar una secuencia S de elementos:
	1. Si S tiene uno o ningún elemento, está ordenada
	2. Si S tiene al menos dos elementos se divide en dos secuencias S1 y S2, S1 conteniendo los primeros n/2, y S2 los restantes.
	3. Ordenar S1 y S2, aplicando recursivamente este procedimiento.
	4. Mezclar S1 y S2 ordenadamente en S
2. Mezclar dos secuencias ordenadas S1 y S2 en S:
	1. Se tienen referencias al principio de cada una de las secuencias a mezclar (S1 y S2).
	2. Mientras en alguna secuencia queden elementos, se inserta en la secuencia resultante (S) el menor de los elementos referenciados y se avanza esa referencia una posición.

Si presentamos estos pasos en una imagen, se puede notar la formación de un árbol donde partiendo de las hojas, se van a ordenar los nodos padre, por medio de una mezcla entre sus dos hijos, hasta llegar al nodo raíz.

![Imgur](http://i.imgur.com/zE6QUvJ.jpg)

Árbol desordenado

![Imgur](http://i.imgur.com/1kWSonV.jpg)

Árbol ordenado

Entre sus propiedades destacan las siguientes:

1. Es Estable.
2. Ocupa muy poca memoria auxiliar.
3. No ordena en el lugar, sino que parte el arreglo para ordenarlos por separado.
4. Su complejidad es igual a T(n) = O(n log n).


##Pseudocódigo

![Imgur](http://i.imgur.com/4PITDuT.png)

##Calculos

![Imgur](http://i.imgur.com/GBSD6tw.png)

Paso 1:

![Imgur](http://i.imgur.com/7bjkfEj.jpg)

Paso 2:

![Imgur](http://i.imgur.com/5M3aiFg.jpg)

Paso 3:

![Imgur](http://i.imgur.com/ete6UNk.jpg)

Paso 4:

![Imgur](http://i.imgur.com/ytYvzkh.jpg)

Paso 5:

![Imgur](http://i.imgur.com/xoqsSfF.jpg)

Paso 6:

![Imgur](http://i.imgur.com/Kk2bI56.jpg)

Considerando únicamente el término principal de la fórmula el orden de crecimiento del algoritmo es:

![Imgur](http://i.imgur.com/yd02IZf.jpg)

###Referencias

- http://mycyberacademy.com/algoritmos-de-ordenamiento-ii-quick-sort/
- http://www.ecured.cu/index.php/MergeSort#Propiedades
