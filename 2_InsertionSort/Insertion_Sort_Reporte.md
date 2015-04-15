#Ordenamiento por Inserción
#(Insertion Sort)


**DESCRIPCIÓN**

El **ordenamiento por inserción** técnicamente es la forma mas lógica de ordenar cualquier cosa para un humano, por ejemplo, una baraja de cartas. 

En este tipo de algoritmo, los elementos que van a ser ordenados son considerados uno a la vez. Cada elemento es INSERTADO en la posición apropiada con respecto al resto de los elementos ya ordenados.




**PSEUDOCODIGO**:

![Merge][id]
[id]: https://raw.githubusercontent.com/naycont/Stuff/master/insertion_image.png


**TIempo de Ejecución**

![ ](https://raw.githubusercontent.com/naycont/Stuff/master/Insertion_costos.png  "Tiempo de Ejecución")

![ ](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoInsertion.png  "T(n)")

Simplificando:

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoInsertion2.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoInsertion3.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoInsertion4.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoInsertion5.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoInsertion6.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoInsertion7.png) 

Podemos expresar este tipo de ecuación como:  ![](https://raw.githubusercontent.com/naycont/Stuff/master/render.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoInsertion8.png) 

Por lo tanto el tiempo de ejecución es una función  cuadrática de n.

En conclusión:

El de inserción tiene un **orden de crecimiento ![](https://raw.githubusercontent.com/naycont/Stuff/master/render2.jpg) **


###Código en escala:
![](https://raw.githubusercontent.com/naycont/Stuff/master/InsertionScala.jpg) 

Salida:

![](https://raw.githubusercontent.com/naycont/Stuff/master/InsertionScalaSalida.jpg) 

