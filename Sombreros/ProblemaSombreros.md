==========================================================
#Problema de los sombreros#
==========================================================

##Descripción##

El problema consiste en que un número n de personas dejan su sombrero a un encargado a la entrada de un restaurante, y cuando llega el momento de irse, el encargado regresa un sombrero aleatorio a cada una de las personas, ¿Cual es la probabilidad de que el encargado regrese el sombrero correcto de las pernas que entraron?

##Pseudocodigo##
	
	n = Total de personas y sombreros
	
	1. Total = n
	2. Para i = 1 hasta n
	3.    sombrero = sombrero aleatorio 
	4.    Si sombrero es de persona i
	5.       cont++;
	6.    Sino
	7.       descartar sombrero del Total
	8.       Total = Total-1

##Calculo probabilistico##

Indicador de variable aleatoria
El número de sombreros es variable para cada persona, entonces para un caso base:

![ima](http://i.imgur.com/GWyODHD.png)
 
Tiempo de ejecución promedio
Contemplando el cambio en el total de sombreros, se calcula una fórmula para poder determinar la cantidad total actual con un índice i (persona actual)

![ima](http://i.imgur.com/BmnYlZH.png)