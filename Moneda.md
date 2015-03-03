#El problema de la moneda
Se busca determinar el nuemero esperado de aguilas que caen al lanzar una moneda

###Pseudocodigo

		Lanzamientos(n)
		1.- for i=1 to n
		2.- 	Lanzar=random(0,1)
		3.- 	if Lanzar==1
		4.- 		return aguila
		5.-		else return sol

###Analisis
Definimos nuestro espacio de prueba S = {a,s} con Pr{a} = Pr{s} = 1/2

Sea ![Form](http://latex.codecogs.com/gif.latex?X_%7BH%7D) la __variable aleatoria__ asociada con el evento.

![Form](http://latex.codecogs.com/gif.latex?X_%7BH%7D)={__1__ si cae aguila y __0__ si cae sol}

E[![Form](http://latex.codecogs.com/gif.latex?X_%7BH%7D)]= E[I{H}]

= 1 * Pr{a} + 0 * Pr{s}

= 1 * (1/2) + 0 * (1/2)

= __1/2__

Ahora necesitamos definir un ![Form](http://latex.codecogs.com/gif.latex?X_%7Bi%7D) que es el indicador de __Variable aleatoria__ asociado con el evento en el que el lanzamiento i-esimo de una moneda es aguila

![Form](http://latex.codecogs.com/gif.latex?X_%7Bi%7D) = I{el i-esimo lanzamiento de una moneda resulta en el evento H}

Sea X el numero variable de aguilas que aparecen despues de *n* lanzamientos de la moneda

![Form](http://latex.codecogs.com/gif.latex?X%20%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%7BX_%7Bi%7D%7D)

Necesitamos calcular el numero de aguilas, asi que la ecuacion queda:

![Form](http://latex.codecogs.com/gif.latex?E%5BX%5D%20%3D%20E%5Cleft%5B%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%7BX_%7Bi%7D%7D%5Cright%20%5D%20%5C%20%5C%5C%20%5C%20%5C%5C%20%5C%20%5C%20%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7DE%5Cleft%5B%7BX_%7Bi%7D%7D%5Cright%20%5D%20%5C%5C%20%5C%5C%20%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%7B1/2%7D%20%5C%5C%20%5C%5C%20%3D%20n/2)