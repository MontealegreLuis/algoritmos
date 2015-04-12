#ANÁLISIS PROBABÍLISTICO

##PROBLEMA DE CONTRATACIÓN

Supongamos que necesitas contratar a un nuevo empleado y para esto le dejas a una empresa para que realice la contratación.
El solicitante sólo será contratado si es el mejor.

##Algoritmo
```
 1 Contratar-asistente(n)
 2   best=0
 3   for i=1 to n
 4     Entrevistar candidato i
 5     if candidato es mejor que candidato best
 6       best=i
 7       contratar candidato i
```

##Análisis
Sea **x** el numero de veces que se contrata a un nuevo asistente.

Se calcula **E[x]** definiendo n variables que indiquen si un canditato se contrató

Sea *Xi* la  variable aleatoria asociada con el evento en el que el solicitante i es contratado.
Entonces *Xi* = {1 si el solicitante i escontratado y 0 si no es contratado}

E[Xi]= 1/i

Entonces calculamos E[x]
[Clic aqui para ver la formula1](http://latex.codecogs.com/gif.latex?E\left&space;[&space;x&space;\right&space;]=E\left&space;[&space;\sum_{x=1}^{n}&space;=_{i}\right&space;])
[](http://latex.codecogs.com/gif.latex?=\sum_{x=1}^{n}E[X_{_{i}}])
[](http://latex.codecogs.com/gif.latex?=\sum_{x=1}^{n}1/i)

=In n + O(1)


##PROBLEMA DE MONEDAS
Lo que se quiere es determinar el numero de veces que una moneda va a caer Águila
##Algoritmo
```
   1 Lanzamientos(n)
   2  for i=1 to n
   3      Lanzar=random(0,1)
   4      if Lanzar==1
   5          return aguila
   6      else
   7          return sol
```
##Análisis
###Primero se define el espacio muestral que es *S= {a,s} con Pr{a}= Pr{s} =1/2*
###Sea X####H ###La variable aleatoria asociada con el evento
###X####H###= {1 si cae Aguilay 0 si cae Sol}
[](http://latex.codecogs.com/gif.latex?E\left&space;[&space;X_{H}&space;\right&space;]\left&space;=&space;E\left&space;[&space;I\left&space;\{&space;H&space;\right&space;\}&space;\right&space;])
[](http://latex.codecogs.com/gif.latex?\inline&space;=1*Pr\left&space;\{&space;a&space;\right&space;\}&plus;0*Pr\left&space;\{&space;s&space;\right&space;\}&space;=&space;1*\left&space;(&space;1/2&space;\right&space;)&space;&plus;&space;0*\left&space;(&space;1/2&space;\right&space;)&space;=&space;1/2)

###Ahora necesitamos a Xi que es el indicador de la variable aleatoriaasociada con el evento del lanzamiento i-esimo de una moneda donde es aguila
###Xi = I{el i-esimo lanzamiento de una moneda resulta en el evento H}
Sea X el numero variable de Aguilas que aparece despues de *n*  lanzamientos de la moneda
[](http://latex.codecogs.com/gif.latex?\inline&space;X=&space;\sum_{i=1}^{n}&space;X_{i})

Necesitamos calcular el numero de aguilas, asi que la ecuacion queda:
[](http://latex.codecogs.com/gif.latex?\inline&space;E\left&space;[&space;X&space;\right&space;]=E\left&space;[&space;\sum_{i=1}^{n}&space;X_{i}\right&space;])
[](http://latex.codecogs.com/gif.latex?\inline&space;=\sum_{i=1}^{n}E\left&space;[&space;X_{i}&space;\right&space;]&space;=\sum_{i=1}^{n}&space;1/2&space;=&space;n/2)


##PROBLEMA DE LOS SOMBREROS
###Supongamos que un numero n de personas dejan su sombrero a un encargado en cierto lugar, al momento de retirarse el encargado les devuelve el sombrero de manera aleatoria, de esta manera no sabemos a cuantas personas les regreso el sombrero correcto, esa es la cuestion que se intentara resolver.

##Análisis

###Definimos nuestro espacio de prueba S = {sc, si} donde es sc=Sombrero correcto y si=sombrero incorrecto

###Psc={1/m} y Psi{m-1/m}

###Se calcula E[X] definiendo i variables que indiquen si una persona recibio el sombrero correcto

###Necesitamos sabe cuantas personas recibieron el sombrero correcto

[](http://latex.codecogs.com/gif.latex?\inline&space;E\left&space;[&space;X&space;\right&space;]=&space;E\left&space;[&space;\sum_{i=1}^{n}&space;X_{i}&space;\right&space;])
[](http://latex.codecogs.com/gif.latex?\inline&space;=&space;\sum_{i=1}^{n}&space;E\left&space;[&space;X_{i}&space;\right&space;])
[](http://latex.codecogs.com/gif.latex?\inline&space;=&space;\sum_{i=1}^{n}&space;\frac{1}{m-i&plus;1})
[](http://latex.codecogs.com/gif.latex?\inline&space;=&space;\sum_{i=1}^{n}&space;\frac{1}{i})
= In n + O(1)