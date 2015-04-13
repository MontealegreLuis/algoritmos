#Análisis probabilístico#

##Descripción##

La mayoría de los algoritmos no son deterministas, por lo que al recibir los datosde entrada aleatorios, recibirá distintos datos de salida. En estos casos, la mejor forma de abordar este tipo de algoritmos es con ayuda del análisis probabilístico.

A diferencia de los problemas anteriores, donde se buscaba analizar el peor de los casos, en el análisis probabilisticos se deberá analizar al caso promedio, debido a que tanto el mejor como el peor de los casos son los escenarios menos probables.

Al aplicar análisis probabilístico a nuestro algoritmo estamos calculando a su vez el tiempo de ejecución promedio.

##*El problema de la moneda*

Tratar de determinar el número esperado de águilas que caen al lanzar una moneda.

###Solución
Nuestro espacio de prueba S = {a, s} con Pr{a} = Pr{s} = 1/2

Se define un indicador de variable aleatoria X H , donde cada aguila será el evento H.

X H = I {H}
![p4](http://i.imgur.com/tcu40XL.jpg) 
El numero de veces que salga águila sera el valor esperado del indicador X H.

E [X H]
= E[I {H}]
= 1*Pr{H}+ 0*Pr{T}
= 1*(1/2)+ 0*(1/2)
= 1/2

Siendo Xi = I {el i-ésimo lanzamiento de una moneda resulte en el evento H}
X será el número variable de águilas que aparecen después de n lanzamientos de moneda.

Así, podemos calcular el número esperado de águilas:
![p5](http://i.imgur.com/rZfck6Y.jpg) 

##*El problema de contratación*

Necesitamos contratar a un nuevo asistente de oficina por medio de una agencia, que envía un posible candidato cada día, al cual se le contratará si está mejor calificado que el trabajador actual.

Suponemos que la agencia nos manda una lista de n candidatos y cada día elegimos aleatoriamente a cuál entrevistar, a cada candidato se le asigna un valor numerico de acuerdo a sus habilidades (ranking), contratando a un empleado sólo si su valor en el ranking supera a un trabajador actual.

###Solución
Sea X el número de veces que se contrata a un nuevo asistente, se calcula E[X] definiendo n variables que indiquen si un candidato se contrató o no, siendoXi la variable aleatoria asociada con el evento de ser contratdo o no.
![prob2](http://i.imgur.com/Vw1zV8B.png  "prob2")
Luego, se propone un indicador de variables aleatorias, donde X sea el número de veces que contratamos un nuevo asistente, y Xi la variable aleatoria asociada con el evento en el que el candidato i es contratado.

Xi = I {candidato i es contratado}
![prob2](http://i.imgur.com/o1ScZeX.png  "prob2")
y 

X = X1  + X2 + X3 + ... + Xn

E[Xi] = Pr {candidato i es contratado}
E[Xi] = 1/i

![p](http://i.imgur.com/cfip6ZB.jpg)

Por lo tanto el tiempo ejecución promedio de este algoritmo es *ln n* + O(1) (orden 1).

##*El problema de los sombreros*

Una empleado tiene como única función en un restaurante, recoger los sombreros de n personas que entran. Cuando salen, el empleado toma al azar uno de los sombreros y se lo entrega a una persona. ¿Cuál es la probabilidad de que le entreguen su sombrero original?

###Solución

Similar al ejercicio anterior, se relizan los mismo procedimientos

![p6](http://i.imgur.com/qxu1U4Y.jpg) 

La expresión queda así al no poderse simplificarse más.