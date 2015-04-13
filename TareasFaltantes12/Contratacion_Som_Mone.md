# CONTRATACION #
#### Descripción ####
Supongamos que necesitas contratar a un nuevo asistente de oficina
Decides contratar una agencia que te envía un candidato cada día
Decides que después de entrevistar a cada persona sólo la contratarás si el solicitantes mejor calificado que el asistente actual

#### Pseudocodigo ####
#####HIRE-ASSISTANT(n)#####
----------
1. best = 0 //candidate 0 is a least-qualified dummy candidate
2. for i = 1 to n
3.    interview candidate i
4.    if candidate i is better than candidate best
5.    best = i
6.    hire candidate i

----------
####Análisis####
   - Sea X el número de veces que contratamos un nuevo asistente
   - ![](http://www.sciweavers.org/upload/Tex2Img_1428886028/render.png)
   - Calculamos E[X] definiendo n variables que indiquen si un candidato se contrató o no
   - Sea Xi la variable aleatoria asociada con el evento en el que el candidato i es contratado
   ![](http://www.sciweavers.org/upload/Tex2Img_1428886599/render.png)
   ![](http://www.sciweavers.org/upload/Tex2Img_1428887205/render.png)


# MONEDAS#
####Descripción
Tratemos de determinar el número esperado de águilas que caen al lanzar una moneda
####Pseudocodigo

----------
1. lanzamiento(n)
2. for i = 1 to n
3.     lanzamiento(0,1)
4.     if lanzar == 1
5.        return aguila
6.     else
7.        return sol

----------

####Análisis


- Nuestro espacio de prueba S = {a, s} con Pr{a} = Pr{s} = 1/2

- Podemos entonces definir un indicador de variable aleatoria XH moneda caiga águila que es el evento H
![](http://www.sciweavers.org/upload/Tex2Img_1428888058/render.png)
- El número esperado de águilas al lanzar una moneda es simplemente el valor esperado de nuestro indicador XH
![](http://www.sciweavers.org/upload/Tex2Img_1428888363/render.png)

#SOMBREROS
####Descripción
Supongamos que un numero n de personas dejan su sombrero a un encargado en cierto lugar, al momento de retirarse el encargado les devuelve el sombrero de manera aleatoria, de esta manera no sabemos a cuantas personas les regreso el sombrero correcto, esa es la cuestion que se intentara resolver.

####Análisis
- Definimos nuestro espacio de prueba S = {sc, si} donde es sc=Sombrero correcto y si=sombrero incorrecto Psc={1/m} y Psi{m-1/m}
- Se calcula E[X] definiendo i variables que indiquen si una persona recibió el sombrero correcto
- Necesitamos sabe cuantas personas recibieron el sombrero correcto 
= In n + O(1)