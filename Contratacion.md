#El problema de la contratación
Supongamos que necesitas contratar un nuevo __asistente de oficina__. Decides contratar una agencia que te envía un candidato cada día.

Decides que después de entrevistar a cada persona, sólo la contrataras si el solicitante esta mejor calificado que el asistente actual.

###Algoritmo
		Contratar-asistente(n)
		1- best=0
		2- for i=1 to n
		3- Entrevistar candidato i
		4- if candidato es mejor que candidato best
		5- best=i
		6- contratar candidato i
###Analisis
Sea X el numero de veces que contratamos un nuevo asistente

![Form](http://latex.codecogs.com/gif.latex?E%5BX%5D%20%3D%20%5Csum_%7Bx%3D1%7D%5E%7Bn%7D%7Bx%7D%5C%20%5C%20%5CPr%5Cbig%20%5C%7BX%3Dx%5Cbig%20%5C%7D)

Se calcula E[X] definiendo n variables que indiquen si un candidato se contrató o no.

Sea ![Form](http://latex.codecogs.com/gif.latex?X_%7Bi%7D) la variable aleatoria asociada con el evento en el que el candidato i es contratado

Tenemos entonces ![Form](http://latex.codecogs.com/gif.latex?X_%7Bi%7D)= {1 si candidato i es contatado y 0 sino es contratado

E[![Form](http://latex.codecogs.com/gif.latex?X_%7Bi%7D)]=  1/i

Entonces calculamos E[X]:

![Form](http://latex.codecogs.com/gif.latex?E%5BX%5D%20%3D%20E%5Cleft%20%5B%5Csum_%7Bx%3D1%7D%5E%7Bn%7D%7BX_%7Bi%7D%7D%5Cright%20%5D)

![Form](http://latex.codecogs.com/gif.latex?%3D%20%5Csum_%7Bx%3D1%7D%5E%7Bn%7D%7BE%5Cletf%20%5BX_%7Bi%7D%5Cletf%20%5D%7D)

![Form](http://latex.codecogs.com/gif.latex?%3D%20%5Csum_%7Bx%3D1%7D%5E%7Bn%7D%7B1/i%7D)


###=ln *n* + *O*(1)
