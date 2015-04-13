#**Selection-Sort**#

###Descripción del algoritmo###
 Método de ordenamiento por selección,este algoritmo consiste en encontrar al menor de todos los elementos del arreglo e intercambiarlo con el que esta en la primera posición y así sucesivamente hasta ordenar todo el arreglo.

###Características###
- Algoritmo que ubica elementos de un arreglo en una secuencia, dada por una relación de orden.

- Busca el mínimo posición i y el final de la lista.

- intercambia el mínimo con el elemento de la posición i.


----------

###Pseudocódigo###

    para i=1 hasta n-1
    mínimo = i;
    para j=i+1 hasta n
        si lista[j] < lista[mínimo] entonces
            mínimo = j /* (!) */
        fin si
    fin para
    intercambiar(lista[i], lista[mínimo])
	fin para



----------

####Complejidad###

Al algoritmo de ordenamiento por selección, para ordenar un vector de n términos, tiene que realizar siempre el mismo número de comparaciones:

 ![Texto alternativo](http://upload.wikimedia.org/math/c/b/f/cbfeee262d4e18dfcb8e7b002c484ba1.png "Título de la imagen")

Esto es, el número de comparaciones c(n) no depende del orden de los términos, si no del número de términos.

![Texto alternativo](http://upload.wikimedia.org/math/d/d/2/dd21bb372cce2aa705251d7280c552b4.png "Título de la imagen")

El número de intercambios i(n), también es fijo, téngase en cuenta que la instrucción:

intercambiar(lista[i], lista[mínimo])
siempre se ejecuta, aun cuando i= mínimo, lo que da lugar:


![Texto alternativo](http://upload.wikimedia.org/math/8/f/4/8f423aac98cabfbc4d548e1d1004d22b.png "Título de la imagen")

sea cual sea el vector, y el orden de sus términos, lo que implica en todos los casos un coste lineal:



![Texto alternativo](http://upload.wikimedia.org/math/f/5/f/f5fb4d8e10f724f775e88888013ae191.png "Título de la imagen")

La cota ajustada asintótica del número de intercambios es lineal, del orden de n.

La fórmula que representa el rendimiento del algoritmo, viene dada por la función:


![Texto alternativo](http://upload.wikimedia.org/math/d/c/9/dc939a98fc6ef680a9708fab178f391d.png "Título de la imagen")

