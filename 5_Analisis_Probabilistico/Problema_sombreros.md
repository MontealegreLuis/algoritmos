#El problema de los sombreros
###Descripción

Cada uno de n de personas deja su sombrero a la entrada de un restaurante. Cuando se retiran, recogen su sombrero  al azar. Determinar la probabilidad de  personas con el sombrero correcto.

###Análisis

Sea S nuestro espacio muestral:

S = {1,2,3,4,...,n} 

Podemos definir un indicador de variable aleatoria Xi, asociado con que el sombrero corresponda a la persona correcta que es el evento i

![](https://raw.githubusercontent.com/naycont/Stuff/master/somb.jpg) 

Pr{c} = 1/i                                   (sombrero correcto)

Pr{i} = H-1/i                               (sombrero incorrecto)




###Cálculos

![](https://raw.githubusercontent.com/naycont/Stuff/master/formula3.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/formula.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/sum.png) 

= 1

Así, el número esperado de personas que obtienen sus propios sombreros es 1. 

