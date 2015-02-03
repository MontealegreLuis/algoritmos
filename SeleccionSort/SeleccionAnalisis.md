#Selection Sort
###Descripcion del algoritmo
Su funcionamiento es el siguiente:

Buscar el mínimo elemento de la lista
Intercambiarlo con el primero
Buscar el siguiente mínimo en el resto de la lista
Intercambiarlo con el segundo
Y en general:

Buscar el mínimo elemento entre una posición i y el final de la lista
Intercambiar el mínimo con el elemento de la posición i

####Estabilidad Ventas y Desventajas

Puede que exista algo de discrepancia en cuanto a si es o no estable este algoritmo, pero en realidad esta implementación parece ser bastante estable. Se puede verificar esto ordenando un conjunto de datos que tenga un par de ellos con la misma clave. Se vera claramente que el orden relativo entre ellos es conservado. Algunos autores no lo consideran asi, pero independientemente de esto, este algoritmo tienes entre sus ventajas: Es fácil su implementación. No requiere memoria adicional. Realiza pocos intercambios. Tiene un rendimiento constante, pues existe poca diferencia entre el peor y el mejor caso. Como todos también tiene algunas desventajas: Es lento y poco eficiente cuando se usa en listas grandes o medianas. Realiza numerosas comparaciones.

###Algoritmo


| #| Pseudocodigo | Costo |
| ---------- | ---------- | ---------- |
| 1   | para i=1 hasta n-1;  |  ![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422940094/render.png)  |
| 2   | minimo = i; | ![GitHub Logo]( http://www.sciweavers.org/upload/Tex2Img_1422940124/render.png)  |
| 3   |    para j=i+1 hasta n |  ![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422939891/render.png)   j=2|
| 4   |  si lista[j] < lista[minimo] entonces |  ![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422939969/render.png)   j=2 |
| 5   |    minimo = j   |   ![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422939969/render.png)   j=2 |
| 6   |  fin si  | --------- |
| 7   |   fin para| ---------  |
| 8   | intercambiar(lista[i], lista[minimo]) |  ![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422940169/render.png)  |
| 9   | fin para |---------  |


###Tiempo de Ejecucion

#####j=2
 ![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422940289/render.png)


###Tiempo de ejecucion peor de los casos
![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422940398/render.png)





      
        
       
 
   
