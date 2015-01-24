#Algoritmo de Ordenamiento "Insertion-Sort"

##Caracteristicas

La idea de este algoritmo de ordenación consiste en ir insertando un elemento de la lista ó un arreglo en la parte ordenada de la misma, **asumiendo que el primer elemento es la parte ordenada**, el algoritmo ira comparando un elemento de la parte desordenada de la lista con los elementos de la parte ordenada, insertando el elemento en la posición correcta dentro de la parte ordenada, y así sucesivamente hasta obtener la lista ordenada.
Las ventajas de este algoritmo son las siguientes:

+ Es un algoritmo sencillo de entender y codificar.
+ Si el tamaño de la entrada es **N**, entonces el orden del tiempo de ejecución, para el peor caso es O(N2).
+ Si la entrada esta "casi ordenada", el algoritmo se ejecuta mucho más rápidamente.Esta velocidad tiende a un tiempo O(N), peor caso que se cumple cuando la entrada está totalmente ordenada.
+ Es por la propiedad anterior que este algoritmo, a pesar de no ser el más rápido para entradas grandes, suele usarse de la siguiente manera: Se semi-ordena la entrada con algún otro algoritmo más rápido y más adecuado para entradas grandes. Luego, cuando tenemos la entrada "casi ordenada" usamos este algoritmo.

##Pseudocódigo

![Imgur](http://i.imgur.com/CpYH11W.png)

##Calculos
Tomando en cuenta la siguiente imagen procedemos a realizar los cálculos.

![Imgur](http://i.imgur.com/TRjGIKI.png)

###Paso 1:

![Imgur](http://i.imgur.com/hRRNBZt.png)

###Paso 2:

![Imgur](http://i.imgur.com/sPUne73.png)

###Paso 3:
Para este paso usaremos las siguiente formulas con las que reemplazaremos los terminos C5, C6 Y C7

####T1
![Imgur](http://i.imgur.com/cXsX1ZP.jpg)

####T2
![Imgur](http://i.imgur.com/cXsX1ZP.jpg)

Con lo anterior, queda

![Imgur](http://i.imgur.com/Jt0Vw2s.jpg)

###Paso 4:

![Imgur](http://i.imgur.com/QrINHp9.png)

###Paso 5:

![Imgur](http://i.imgur.com/pCrr9Nu.png)

###Paso 6:

![Imgur](http://i.imgur.com/Y3bSXko.png)

###Paso 7:

![Imgur](http://i.imgur.com/CowUnEQ.png)

###Paso 8:

![Imgur](http://i.imgur.com/hLfxvRy.png)

Considerando únicamente el término principal de la fórmula el orden de crecimiento del algoritmo es:

![Imgur](http://i.imgur.com/9NZmQbT.jpg)


