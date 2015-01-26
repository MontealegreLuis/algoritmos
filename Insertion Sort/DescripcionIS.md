# Algoritmo de Inserción #

## Descripción  ##

Este es un algoritmo de ordenamiento, en donde los elementos del arreglo se van comparando con los demás, tomando en cuenta que el primer elemento de este arreglo esta en la parte ordenada.

En este algoritmo de Inserción, se compara cada uno de los elementos de la parte que se encuentra desordenada del arreglo con los elementos de la parte que está ordenada, y se inserta en la posición que le toca de la parte que está ordenada.

## Tiempo de ejecución ##

El tiempo de ejecución lo obtenemos mediante la suma de los tiempos de cada línea ejecutada, donde se obtiene el costo y las veces que se va a repetir cada instrucción. 

![Imagen](https://raw.githubusercontent.com/moonniy/algoritmos/master/img/imagen1.png) 

El peor de los casos en este algoritmo se da cuando los elementos se encuentran en orden inverso. Entonces se obtiene que:

![Imagen](https://raw.githubusercontent.com/moonniy/algoritmos/master/img/image1.1.png)
![Imagen](https://raw.githubusercontent.com/moonniy/algoritmos/master/img/image1.2.png)

Con la sustitución de las sumatorias, el calculo seria de la siguiente manera:

![Imagen](https://raw.githubusercontent.com/moonniy/algoritmos/master/img/imagen2.png) 

En donde obtenemos que la función tiene un orden de crecimiento cuadrático.


