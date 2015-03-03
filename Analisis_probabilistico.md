#**Analisis Probabilistico**

####Ejemplo 1:

#####El problema de la contratación

Necesitamos contratar a un nuevo asistente de oficina para ello se contrata una agencia que te envía un candidato cada día.

A cada persona sólo se contratara si el solicitantes está mejor calificado que el asistente actual.

###Algoritmo
~~~
HIRE-ASSISTAN(n)
1 best = 0 
2 for i = 1 to n
3    interview candidate i
4    if candidate i is better then candidate best
5 best = i
6 hire candidate i
~~~
Cuando usamos análisis probabilístico estamos calculando el tiempo de ejecución promedio.

Sea X el número de veces que contratamos un nuevo asistente.

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%3D%5Csum_%7Bx%3D1%7D%5E%7Bn%7D%20x%20Pr%5Cbig%5C%7Bx%20%3D%20x%5Cbig%5C%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

Calculamos E[X] definiendo n variables que indiquen si un candidato se contrató o no

Sea Xi en el que el candidato i es contratado la variable aleatoria asociada con el evento.

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX_%7Bi%7D%5D%3DPr%5Cbig%5C%7B%20candidate%20i%20is%20hired%5Cbig%5C%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX_%7Bi%7D%5D%3D1%2Fi&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%3DE%5B%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20x_%7Bi%7D%5D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7DE%5B%20x_%7Bi%7D%5D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D1%2Fi&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=%3Dln%20n%20%2B%20O%281%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

####Ejemplo 2: Del dado. Que probabilidad hay que salga un 6
Calcularemos el indicador de variables aleatorias
![img](http://www.sciweavers.org/tex2img.php?eq=%20I%20%7B6%7D%20%3D%5Cbegin%7Bcases%7D1%20%26%20si%20%20sale%20%20un%20%20%206%20%5C%5C0%20%26%20Si%20%20%20sale%20%20%20otro%20nu%20%5Cend%7Bcases%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=%20P_%7Br%7D%5Cbig%5C%7B1%5Cbig%5C%7D%20%3D%20P_%7Br%7D%5Cbig%5C%7B2%5Cbig%5C%7D%20%3D%20%20P_%7Br%7D%5Cbig%5C%7B3%5Cbig%5C%7D%20%3D%20%20P_%7Br%7D%5Cbig%5C%7B4%5Cbig%5C%7D%20%20P_%7Br%7D%5Cbig%5C%7B5%5Cbig%5C%7D%20%3D%20P_%7Br%7D%5Cbig%5C%7B6%5Cbig%5C%7D%20%3D%201%2F6&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])
Ahora calcularemos su Expectativa:
![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%3DE%5B%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%20x_%7Bi%7D%5D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%20E%5Bx_%7Bi%7D%5D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%201%2F6&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

###Ejemplo 3: Sombreros
Lo primero que hacemos es calcular el indicardor de la variable aleatoria.

![img](http://www.sciweavers.org/tex2img.php?eq=%20I%20%7Bx%7D%20%3D%5Cbegin%7Bcases%7D1%5C%5C0%5Cend%7Bcases%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

1 si sale el sombrero adecuado y 0 si sale otro.

![img](http://www.sciweavers.org/tex2img.php?eq=s%3D%7BN%2CS%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=P_%7Br%7D%20%5Cbig%5C%7BN%5Cbig%5C%7D%3D%20%5Cfrac%7Bm-1%7D%7Bm%7D%20%20%2C%20P_%7Br%7D%20%5Cbig%5C%7BS%5Cbig%5C%7D%3D%20%5Cfrac%7B1%7D%7Bm%7D%20%0A%0AE%5BX_%7B5%7D%5D%3DT%5B%5Cbig%5C%7BS%5Cbig%5C%7D%5D%20%0A%0A%3D0%2AP_%7Br%7D%5Cbig%5C%7BN%5Cbig%5C%7D%2B1%2A%20P_%7Br%7D%20%5Cbig%5C%7BS%5Cbig%5C%7D%0A&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

= 1/m

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%20%3D%20E%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%28x_%7Bi%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=E%5BX%5D%20%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20E%28X_%7Bi%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=%3D%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%20%28%20%5Cfrac%7B1%7D%7Bm-i%2B1%7D%20%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])



**Autor: ** *Rene Almeida Lopez*
