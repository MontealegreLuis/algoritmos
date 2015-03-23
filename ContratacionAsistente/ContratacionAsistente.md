==========================================================
#Contratación de asistente#
==========================================================

##Descripción##

Se necesita contratar a un nuevo asistente de oficina. Decides contratar una agencia que te envía un candidato cada día. Decides que después de entrevistar a cada persona sólo la contratarás si el solicitantes está mejor calificado que el asistente actual.

##Pseudocodigo##

	n = Total de entrevistados
	
	1. mejor = 0
	2. Para i = 1 hasta n
	3.    entrevistar al candidato i
	4.    Si candidato i es mejor que candidato 'mejor'
	5.       mejor = i
	6.       contratar candidato i

##Calculo probabilistico##

Indicador de variable aleatoria

Sea X el número de veces que contratamos un nuevo asistente

![ima](http://i.imgur.com/DgzfDO8.png)


![ima](http://i.imgur.com/pZW0qik.png)


###Tiempo de ejecución promedio###

Sea Xi en el que el candidato i es contratado la variable aleatoria asociada con el evento

![ima](http://i.imgur.com/ZmkFmTE.png)