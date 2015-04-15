#Ordenamiento por selección
#(Selection Sort)



**DESCRIPCIÓN**

El **ordenamiento por selección** consiste en encontrar el menor de todos los elementos del arreglo e intercambiarlo con el que está en la primera posición. Luego el segundo mas pequeño, y así sucesivamente hasta ordenarlo todo. 


**PSEUDOCODIGO**:

![](https://raw.githubusercontent.com/naycont/Stuff/master/SelectionPseudo.jpg) 


**TIempo de Ejecución**

| Código     | TIempo     |
| ------------- | ------------- |
| Para i=1 hasta n-1 | n |
| mínimo = i  | n-1 |
| Para j=i+1 hasta n | ![](https://raw.githubusercontent.com/naycont/Stuff/master/suma.png)   |
| Si lista[j] < lista[minimo] entonces | ![](https://raw.githubusercontent.com/naycont/Stuff/master/suma2.png)  |
| minimo = j |  ![](https://raw.githubusercontent.com/naycont/Stuff/master/suma2.png)  |
|intercambiar (Lista[i], Lista[minimo]) | n-1 |

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoSelection.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoSelection2.png) 


![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoSelection3.png) 

![](https://raw.githubusercontent.com/naycont/Stuff/master/TiempoSelection4.png) 

Por lo tanto el tiempo de ejecución es una función  cuadrática de n.

En conclusión:

El algoritmo de seleccion tiene un **orden de crecimiento ![](https://raw.githubusercontent.com/naycont/Stuff/master/render2.jpg) **


###Código en escala:

![](https://raw.githubusercontent.com/naycont/Stuff/master/img1.jpg) 

Salida:

![](https://raw.githubusercontent.com/naycont/Stuff/master/img3.jpg) 

