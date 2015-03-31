==================================================
#SELECTION SORT#
==================================================

Es un algoritmo que tiene como principio encontrar el elemento mas pequeño de cada subarreglo, mientras que en cada iteración intercambia la primera posición de este con la posición del menor. Cada subarreglo se vuelve mas pequeño hasta llegar a un arreglo de tamaño 2 en el que solo se puede hacer una última ordenación.

Su funcionamiento es el siguiente:

* Buscar el mínimo elemento de la lista.
* Intercambiarlo con el primero.
* Buscar el siguiente mínimo en el resto de la lista.
* Intercambiarlo con el segundo.



Y en general:

* Buscar el mínimo elemento entre una posición i y el final de la lista.
* Intercambiar el mínimo con el elemento de la posición i.


##Pseudocodigo##


		n = (Longitud de A) - 1
		
		1. Para i = 1 hasta n - 1
		2.    menor := i
		3.    Para j = i+1 hasta n
		4.       Si A[j] < A[menor]
		5.         menor := j
		6.    Si i <> menor
		7.       aux := A[i]
		8.       A[i] := A[menor]
		9.       A[menor] := aux


##Tiempo de ejecución##

Ci con i para cada linea del código, n el número de veces a ejecutarse, tj tiempo dependiente de j


![ima](http://i.imgur.com/osYnPKL.png)

en la cual la ecuación general queda de la siguiente forma:

![ima2](http://i.imgur.com/d27B2Bf.png)
##Mejor caso: El arreglo ordenado##

Con tj = 0, ya que no se tendria que reasignar la variable menor por lo que no habría intercambios.


![ima3](http://i.imgur.com/YfdkwfA.png)

##Peor caso: Arreglo ordenado inversamente##

Ya que el arreglo esta ordenado inversamente se tiene que reasignar la variable menor el
mayor numero de veces posible y realizando todos
los intercambios que el ciclo permite.

![ima4](http://i.imgur.com/PuYDPrU.png)


##Orden##

Después de haber realizado los dos casos mas significativos de los cuales se pueden ocurrir las dos ecuaciones finales son de orden dos, por lo que se concluye que el algoritmo es de orden 2:

![ima5](http://i.imgur.com/hRqihz6.png)

##Código en Scala##

 
		object SelectionSort {
		  
		  def main(args: Array[String]){
		        var A = Array(5,11,3,9,5,2,4,28,1)
		
		        println("Arreglo original: ")
		            for(i<-0 to A.length-1)
		                print(A(i)+" ")
		
		    //aqui se impelemta el algoritmo de SelectionSort
		
		        var total = A.length;
		
		        for(i<-0 to total-2){
		          var menor = i;
		            for(j<-i+1 to total-1)
		              {
		              if(A(j) < A(menor))
		                  menor = j
		              }
		
		              if( i != menor){
		                var aux = A(i)
		                A(i) = A(menor)
		                A(menor) = aux
		              }
		            }
		
		        println("\nArreglo ordenado: ")
		            for(i<-0 to A.length-1)
		                print(A(i)+" ")
		  }
		}