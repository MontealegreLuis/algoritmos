#El problema de los sombreros
Supongamos que un numero *n* de personas dejan su sombrero a un encargado en cierto lugar, al momento de retirarse el encargado les devuelve el sombrero de manera aleatoria, de esta manera no sabemos a cuantas personas les regreso el sombrero correcto, esa es la cuestion que se intentara resolver.

###Análisis
Definimos nuestro espacio de prueba S = {sc, si} // sc=Sombrero correcto, si=sombrero incorrecto

Psc={1/m} y Psi{m-1/m}

Se calcula E[X] definiendo i variables que indiquen si una persona recibio el sombrero correcto

Necesitamos sabe cuantas personas recibieron el sombrero correcto

![Form](http://latex.codecogs.com/gif.latex?E%5BX%5D%20%3D%20E%5Cleft%5B%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%7BX_%7Bi%7D%7D%5Cright%20%5D%20%5C%20%5C%5C%20%5C%20%5C%5C%20%5C%20%5C%20%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7DE%5Cleft%5B%7BX_%7Bi%7D%7D%5Cright%20%5D%20%5C%5C%20%5C%5C%20%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%7B%5Cfrac%7B1%7D%7Bm-i&plus;1%7D%7D%20%5C%5C%20%5C%5C%20%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%7B%5Cfrac%7B1%7D%7Bi%7D%7D)

###=ln *n* + *O*(1)

