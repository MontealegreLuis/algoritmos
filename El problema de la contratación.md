#Análisis Probabilístico "El problema de la contratación"
##Descripción
El análisis probabilístico se usa para calcular el tiempo de ejecución promedio, en esta ocasión vamos a analizar el "Problema de la contratación". El cual dice:  
Supongamos que necesitas contratar a un nuevo asistente de oficina, decides contratar a una agencia que te envía un candidato cada día. Decides que después de entrevistar a cada persona sólo la contratarás si el solicitante está mejor calificado que el asistente actual.

##Pseudocódigo
![Imgur](http://i.imgur.com/ihZqIR9.jpg)
##Cálculos
Para realizar el cálculo del tiempo de ejecución vamos a considerar lo siguientes puntos:

- La entrevista tiene un costo bajo, digamos *Ci*, mientras que contratar es caro, digamos *Ch*.
- Si *m* es el número de personas contratadas, el costo total asociado a este algoritmo es 0(Ci n + Ch m).
- Sin importar cuanta gente contrates, siempre entrevistamos *n* candidatos y siempre pagamos el costo asociado *Ci n* de las entrevistas.
- Así que de debes concentrarte en analizar *Ch m*, el costo de contratar, el cual siempre varía.
- En el peor de los casos contratamos a cada candidato que llega. Pero lo bueno que esto no es siempre cierto por qué no tenemos ni idea del orden en que llegarán los candidatos y tampoco será algo que podamos controlar.
- Por lo tanto nos ocuparemos con el caso promedio.

###Nuestro espacio muestral *S*


- ![Imgur](http://i.imgur.com/89do4CC.jpg)


###Indicador de variables aleatorias

- ![Imgur](http://i.imgur.com/tp0SjxQ.jpg)


- ![Imgur](http://i.imgur.com/UXAGq4z.jpg)

###Cálculos
- ![Imgur](http://i.imgur.com/zC0329u.jpg)
- ![Imgur](http://i.imgur.com/4tfX7Eu.jpg)
- ![Imgur](http://i.imgur.com/VzruQJx.jpg)

Por lo tanto el tiempo PROMEDIO de ejecución de este algoritmo es:

- ![Imgur](http://i.imgur.com/gd5Kd5W.jpg)



