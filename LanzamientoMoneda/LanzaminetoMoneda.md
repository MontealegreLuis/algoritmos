==========================================================
#Águila o Sol, lanzamiento de moneda#
==========================================================

##Descripción##
Se trata de calcular el número de veces que se podría obtener águila, en vez de sol, en n volados distintos.

##Pseudocodigo##
	n = Total de tiradas
	
	1. Para i = 1 hasta n
	2.    tirada := random(0,1)
	3.    Si tirada == 0
	4.       regresa aguila
	5.    Si no
	6.       regresa sol

##Calculo probabilistico##

Indicador de variable aleatoria

En esta ocasión nuestro espacio de en el que se realizara la prueba es S = {a, s} con Pr{a} = Pr{s} = 1/2.

En donde el indicador de variable aleatoria 
![ima](http://i.imgur.com/Jfu0eIM.png) asociado con que la moneda caiga águila que es el evento H.


![ima](http://i.imgur.com/XRnpg12.png)


###Tiempo de ejecución promedio###

El número esperado de águilas al lanzar una moneda es simplemente el valor esperado de indicador ![ima](http://i.imgur.com/Jfu0eIM.png)

![ima](http://i.imgur.com/UATPq4e.png)

###Valor esperado###

Para encontrar el número esperado en n volados, se generaliza con la sumatoria de la posibilidad del evento de la variable aleatoria.

![ima](http://i.imgur.com/qZ2fzbI.png)
