#**Analisis Probabilistico**

<br><br>
##Sombreros


![sombreros](/imgs/sombreros1.png)

![sombreros](/imgs/sombreros2.png)

![sombreros](/imgs/sombreros3.png)


<br><br>
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

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%3D%5Csum_%7Bx%3D1%7D%5E%7Bn%7D%20x%20Pr%5Cbig%5C%7Bx%20%3D%20x%5Cbig%5C%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX_%7Bi%7D%5D%3DPr%5Cbig%5C%7B%20candidate%20i%20is%20hired%5Cbig%5C%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX_%7Bi%7D%5D%3D1%2Fi&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%3DE%5B%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20x_%7Bi%7D%5D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7DE%5B%20x_%7Bi%7D%5D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![img](http://www.sciweavers.org/tex2img.php?eq=%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D1%2Fi&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)




<br><br>
##El dado. Probabilidad que salga un 6
Calcularemos el indicador de variables aleatorias
![img](http://www.sciweavers.org/tex2img.php?eq=%20I%20%7B6%7D%20%3D%5Cbegin%7Bcases%7D1%20%26%20si%20%20sale%20%20un%20%20%206%20%5C%5C0%20%26%20Si%20%20%20sale%20%20%20otro%20nu%20%5Cend%7Bcases%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)



Ahora tenemos:


![img](http://www.sciweavers.org/tex2img.php?eq=%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%201%2F6&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)



