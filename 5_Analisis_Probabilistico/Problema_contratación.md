#El problema de la contratación

###Descripción

- Supongamos que necesitas contratar a un nuevo
asistente de oficina
- Decides contratar una agencia que te envía un
candidato cada día
- Decides que después de entrevistar a cada
persona sólo la contratarás si el solicitantes está
mejor calificado que el asistente actual

###Pseudocódigo

![](https://raw.githubusercontent.com/naycont/Stuff/master/p_contratacion.jpg) 

###Análisis

Sea un espacio de pruebas S y un evento A.

S = {1,2,3,4...,n}

![](https://raw.githubusercontent.com/naycont/Stuff/master/EventoA.jpg) 

Sea X el número de veces que contratamos  un nuevo asistente 

![](https://raw.githubusercontent.com/naycont/Stuff/master/contratacion_analisis.gif) 


Calculamos E[X] definiendo n variables que indiquen si un candidato se contrató o no

E[Xi] =  Pr {candidato i es contratado}

E[Xi] = 1/i

![](https://raw.githubusercontent.com/naycont/Stuff/master/formula3.png) 

 ![](https://raw.githubusercontent.com/naycont/Stuff/master/contratacion_analisis3.gif) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/formula2.png) 	



Por lo tanto el tiempo PROMEDIO de ejecución de este algoritmo es:

**ln(n) + O(1) **


