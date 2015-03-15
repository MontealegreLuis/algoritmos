#**Analisis Probabilistico**

<br>
##Sombreros


![sombreros](/imgs/sombreros1.png)

![sombreros](/imgs/sombreros2.png)

![sombreros](/imgs/sombreros3.png)


<br>
##El problema de la contratación

Supongamos que se necesita contratar a un nuevo asistente de oficina. Decides contratar una agencia que te envía un candidato cada día.

A cada persona sólo se contratara si el solicitantes está mejor calificado que el asistente actual.


###Algoritmo
    1. mejor = 0
    2. n = Total de entrevistados

    3. Para i = 1 hasta n
    4.    entrevistar al candidato i
    5.    Si candidato i es mejor que candidato 'mejor'
    6.       mejor = i
    7.       contratar candidato i

*	Para el caso de problema de contratación suponemos que los aplicantes llegan en un orden aleatorio.

*	Podemos clasificar a cada candidato con un número de 1 a n usando
rank(i).

*	La lista ordenada {rank(1), rank(2), ... , rank(n)} es una
permutación de la lista {1, 2, ..., n} (Es decir que los aplicantes vienen en un orden aleatorio, significa que la lista de rangos puede ser cualquiera de las n! permutaciones de los números).

*	Supongamos que la agencia nos manda una lista de n
candidatos y cada día elegimos aleatoriamente a cuál
entrevistar.

*	Un algoritmo es aleatorio si su comportamiento esta
determinado no sólo por sus entradas si no por un generador
de números aleatorios
Cuando usamos análisis probabilístico estamos calculando el tiempo de ejecución promedio.

Sea X el número de veces que contratamos un nuevo asistente.

![contratar](/imgs/contratar1.png)




<br><br>
##El dado. Probabilidad que salga un 6
Calcularemos el indicador de variables aleatorias

![moneda](/imgs/moneda1.png)



Ahora tenemos:


![moneda](/imgs/moneda2.png)
