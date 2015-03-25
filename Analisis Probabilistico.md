##ANALISIS PROBABILISTICO



Continuando con el ejemplo de la contratación,un análisis probabilístico puede guiar el desarrollo de un algoritmo aleatorio.

● Si antes de ejecutar el algoritmo generamos permutaciones aleatorias de los candidatos a fin de reforzar la idea que todas las permutaciones son igualmente posibles

● Aunque hemos modificado el algoritmo, aún esperamos contratar un candidato ln n veces.

● El número de veces que contratamos un asistente difiere para diferentes entradas

– Dada la lista A1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} contratamos diez veces

– Dada la lista A2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1} contratamos un sólo asistente (la primera vez)

– Dada la lista A3 = {5, 2, 1, 8, 4, 7, 10, 9, 3, 6} contratamos 3 asistentes los que tienen las evaluaciones 5, 8, y 10

● Así tenemos entradas caras como A1 A2 y entradas intermedias como A3

● En el caso de los algoritmos aleatorios, el componente aleatorio está en el algortimo, no en la distribución de las entradas

● Cada que corremos el algoritmo, la ejecución depende de las elecciones aleatorias que se hacen, y es muy posible que difieran de la ejecución anterior del algoritmo

● Para este tipo de algoritmos ninguna entrada provoca el escenario del peor caso

● En estos casos no es posible proporcionar un array con el peor de los casos,porque la permutación aleatoria hace que el orden de la entrada sea irrelevante

● Los algoritmos aleatorios, se comportan negativamente sólo si el generador de números aleatorios produce una permutación.

 **veamos un ejemplo*
###Ejemplo
###El problema de la contratación

1.-Suponga que necesita contratar a un nuevo asistente de oficina

2.-Decide contratar una agencia que le envía un candidato cada día

3.-Decide que después de entrevistar a cada persona sólo la contratarás si el solicitante está mejor calificado que el asistente actual

###Algoritmo
~~~
HIRE-ASSISTANT(n)
1  Mejor=0   
2  for i = 1 a n
3        intercambiar candidato i
4	   if candidato i es Mejor que candidato Mejor
5		   Mejor = i
6		   Contratar candidato i
~~~

Cuando utilizamos análisis probabilístico, estamos calculando el tiempo
de ejecución promedio

*	Para el caso de problema de contratación suponemos que los aplicantes llegan en un orden aleatorio.

*	Podemos clasificar a cada candidato con un número de 1 a n usando
rank(i) 

*	La lista ordenada {rank(1), rank(2), ... , rank(n)} es una
permutación de la lista {1, 2, ..., n} (Es decir que los aplicantes vienen en un orden aleatorio, significa que la lista de rangos puede ser cualquiera de las n! permutaciones de los números)

*	Supongamos que la agencia nos manda una lista de n
candidatos y cada día elegimos aleatoriamente a cuál
entrevistar

*	**Un algoritmo es aleatorio si su comportamiento esta
determinado no sólo por sus entradas si no por un generador
de números aleatorios**

Ejemplo: Suponemos que tenemos a nuestra disposición una función
RANDOM(a, b) que regresa un número aleatorio entre a y b
(inclusivo)
– Por ejemplo RANDOM(0, 1) produce una probabilidad de 1/2

####Indicador de variables aleatorias
	Supongamos que tenemos un espacio de pruebas
S y un evento A
*	El indicador de variable aleatoria I{A} asociado al
evento A se expresa como
![1](http://www.sciweavers.org/tex2img.php?eq=%20%20I%5Cbig%5C%7BA%5Cbig%5C%7D%20%3D%5Cbegin%7Bcases%7D1%20%26%20si-A-ocurre%20%5C%5C0%20%26%20si-A-%20no-ocurre%20%5Cend%7Bcases%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

###Análisis del problema de contratación
*	Sea X el número de veces que contratamos un nuevo asistente
![2](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%3D%5Csum_%7Bx%3D1%7D%5E%7Bn%7D%20x%20Pr%20%5Cbig%5C%7BX%3Dx%5Cbig%5C%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

*	Calculamos E[X] definiendo n variables que indiquen si un candidato se contrató o no
*	Sea Xi la variable aleatoria asociada con el evento en el que el candidato i es contratado

![3](http://www.sciweavers.org/tex2img.php?eq=%20X_%7Bi%7D%3DI%20%5Cbig%5C%7Bcandidato%20i%20es%20contratado%5Cbig%5C%7D%0A%20%20%20%20%20%20%20%20%20%20%3D%5Cbegin%7Bcases%7D1%20%26%20si-el-candidato-i-es-contratado%5C%5C0%20%26%20si-el-candidato-i-no-es-contratado%20%5Cend%7Bcases%7D%20%0A%0Ay%0A%0AX%3D%20X_%7B1%7D%2BX_%7B2%7D%2B...%2BX_%7Bn%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![4](http://www.sciweavers.org/tex2img.php?eq=%0AE%5BX_%7Bi%7D%5D%3DPr%20%5Cbig%5C%7Bcandidato-i-es-contratado%5Cbig%5C%7D%0A%0AE%5BX_%7Bi%7D%5D%3D1%2Fi%0A%0AAhora%20podemos%20calcular%20E%5BX%5D%3A%0A%0AE%5BX%5D%3DE%5B%20%5Csum_%7Bi%3D1%7D%5En%20X%7Bi%7D%20%5D%0A%0AE%5BX%5D%3D%5Csum_%7Bi%3D1%7D%5En%20E%5BX%7Bi%7D%5D%0A%0AE%5BX%5D%3D%5Csum_%7Bi%3D1%7D%5En%201%2Fi%0A%0AE%5BX%5D%3Dln%20n%20%2BO%20%281%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)


###Ejemplo 2: Probabilidad que salga un 6 al lanzar un dado

####Indicador de variables aleatorias
Nuestro espacio de prueba S={1,2,3,4,5,6}
con:
![5](http://www.sciweavers.org/tex2img.php?eq=%20P_%7Br%7D%5Cbig%5C%7B1%5Cbig%5C%7D%20%3D%20P_%7Br%7D%5Cbig%5C%7B2%5Cbig%5C%7D%20%3D%20%20P_%7Br%7D%5Cbig%5C%7B3%5Cbig%5C%7D%20%3D%20%20P_%7Br%7D%5Cbig%5C%7B4%5Cbig%5C%7D%20%20P_%7Br%7D%5Cbig%5C%7B5%5Cbig%5C%7D%20%3D%20P_%7Br%7D%5Cbig%5C%7B6%5Cbig%5C%7D%20%3D%201%2F6&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])%20Ahora%20calcularemos%20su%20Expectativa:%20![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%3DE%5B%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%20x_%7Bi%7D%5D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Podemos entonces definir un indicador de variable aleatoria I6, asociado con que el dado caiga 6 que es el evento 6

![6](http://www.sciweavers.org/tex2img.php?eq=I%7B6%7D%20%3D%5Cbegin%7Bcases%7D1%26%20si-sale-un-6%5C%5C0%20%26%20si-no-sale-un-6%5Cend%7Bcases%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

El número esperado de 6 al lanzar un dado es simplemente el valor esperado 

![7](http://www.sciweavers.org/tex2img.php?eq=%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%20E%5Bx_%7Bi%7D%5D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![8](http://www.sciweavers.org/tex2img.php?eq=%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%201%2F6&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

###Ejemplo 3: Sombreros
Lo primero que hacemos es calcular el indicardor de la variable aleatoria.
Nuestro espacio de prueba S={1,0} con:

![img](http://www.sciweavers.org/tex2img.php?eq=%20I%20%7Bx%7D%20%3D%5Cbegin%7Bcases%7D1%5C%5C0%5Cend%7Bcases%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

1 si sale el sombrero adecuado y 0 si sale otro.

![img](http://www.sciweavers.org/tex2img.php?eq=s%3D%7BN%2CS%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=P_%7Br%7D%20%5Cbig%5C%7BN%5Cbig%5C%7D%3D%20%5Cfrac%7Bm-1%7D%7Bm%7D%20%20%2C%20P_%7Br%7D%20%5Cbig%5C%7BS%5Cbig%5C%7D%3D%20%5Cfrac%7B1%7D%7Bm%7D%20%0A%0AE%5BX_%7B5%7D%5D%3DT%5B%5Cbig%5C%7BS%5Cbig%5C%7D%5D%20%0A%0A%3D0%2AP_%7Br%7D%5Cbig%5C%7BN%5Cbig%5C%7D%2B1%2A%20P_%7Br%7D%20%5Cbig%5C%7BS%5Cbig%5C%7D%0A&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

= 1/m

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%20%3D%20E%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%28x_%7Bi%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%20%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20E%28X_%7Bi%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%28%20%5Cfrac%7B1%7D%7Bm-i%2B1%7D%20%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])



 