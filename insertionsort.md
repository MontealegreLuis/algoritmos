#Algoritmo de ordenamiento por inserción directa (Insertion sort)

##Descripción##

Este es uno de los métodos de ordenamiento más sencillos basado en el ordenamiento de una baraja de cartas. Computacionalmente hablando es un algoritmo fácil de implementar, estable, adaptativo y más eficientes que otros algoritmos de ordenamiento cuadráticos como el __ordenamiento de burbuja__ y el **ordenamiento selectivo**; aunque como inconvenientes se tiene que no es un algoritmo muy eficiente al recibir grandes listas de información, en comparación a otros algoritmos de ordenamiento como el __ordenamiento rápido__ o el **ordenamiento por mezcla**.

El algoritmo de ordenamiento consta de tomar uno por uno los elementos de un arreglo y recorrerlo hacia su posición con respecto a los anteriormente ordenados. Así empieza con el segundo elemento y lo ordena con respecto al primero. Luego sigue con el tercero y lo coloca en su posición ordenada con respecto a los dos anteriores, así sucesivamente hasta recorrer todas las posiciones del arreglo.

##*Pseudocódigo*

	Paso 1: for j= 2 to A.length
	Paso 2:		key = A[j]
	Paso 3:		i = j-1
	Paso 4:		while i> 0 and A[i] > key
	Paso 5:			A[i+1] = A[i]
	Paso 6:			i =i-1
	Paso 7: 	A[i+1]=key

##*Cálculo de orden* 
Antes de calcular el orden del algoritmo, primero se debe encontrar el tiempo de ejecución de cada isntrucción, como se muestra en la siguiente tabla.

*Siendo **n** el número de elementos del arreglo a ordenar.*

No. | Instrucción | Código | Tiempo
-----|----------------------------|---------------------------------|-------------------------------
1 | for j= 2 to A.length | c1|_n_
2 | key = A[j] | c2| _n - 1_
3 | i = j-1 | c3| _n - 1_
4 | while i> 0 and A[i] > key | c4|  ![Sumatoria1](http://www.sciweavers.org/tex2img.php?eq=%5Csum_%7Bj%3D2%20%7D%5E%7Bn%7D%20t_%7Bj%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
5 | A[i+1] = A[i] | c5| ![Sumatoria2](http://www.sciweavers.org/tex2img.php?eq=%5Csum_%7Bj%3D2%20%7D%5E%7Bn%7D%20%28t_%7Bj%7D%20-1%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
6 | i =i-1 | c6| ![Sumatoria2](http://www.sciweavers.org/tex2img.php?eq=%5Csum_%7Bj%3D2%20%7D%5E%7Bn%7D%20%28t_%7Bj%7D%20-1%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
7 | A[i+1]=key | c7| _n-1_

* En __1__, el tiempo es _n_ por estar en un ciclo sencillo (for) que se inicia n+1 veces del tamaño n, y como su ciclo inicia desde j=2, n+1-1 = n.
* en __2, 3__ y __7__ el tiempo es _n - 1_ porque se ejecuta una instrucción menos que el ciclo que los contiene.
* __4__ usa una sumatoria debido a que es un ciclo dentro de otro ciclo, __5__ y __6__ es lo mismo que la instrucción 4, pero al estar dentro del ciclo se le resta 1.

Ahora, procedemos a calcular el orden para el peor de los casos de nuestro algoritmo.

![ecuacion0](http://i.imgur.com/jMyzMTP.png) 
Convirtiendo las sumatorias a una expresión en función de n, nos queda:
![ecuacion1](http://i.imgur.com/LyPlnrn.png)
Reduciendo términos
![ecuacion2](http://i.imgur.com/zVEjsAX.png) 
Se agrupan términos semejantes
![ecuacion3](http://i.imgur.com/U3q8VLN.png) 
![ecuacion4](http://i.imgur.com/vAmgdkw.png)
Y ya que la ecuación nos quedo similar a la forma: 
![ecuacion5](http://i.imgur.com/ofyphEY.png) 

Se observa que el grado más elevado es 2, por lo tanto, el algoritmo es de orden 2.
