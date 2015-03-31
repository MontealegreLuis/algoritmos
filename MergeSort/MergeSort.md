========================================
#MERGE SORT#
========================================


Conceptualmente, el ordenamiento por mezcla funciona de la siguiente manera:

* Si la longitud de la lista es 0 ó 1, entonces ya está ordenada. En otro caso:
* Dividir la lista desordenada en dos sublistas de aproximadamente la mitad del tamaño.
* Ordenar cada sublista recursivamente aplicando el ordenamiento por mezcla.
* Mezclar las dos sublistas en una sola lista ordenada.

El ordenamiento por mezcla incorpora dos ideas principales para mejorar su tiempo de ejecución:

Una lista pequeña necesitará menos pasos para ordenarse que una lista grande.
Se necesitan menos pasos para construir una lista ordenada a partir de dos listas también ordenadas, que a partir de dos listas desordenadas. Por ejemplo, sólo será necesario entrelazar cada lista una vez que están ordenadas.

#Pseudocodigo#

	1. n1 = q - p + 1
	2. n2 = r - q
	3. Sean L[1...n1+1] y R[1...n2+1] 2 arreglos
	4. Para i=1 hasta n1
	5.      L[i] = A[p+i-1]
	6. Para j=1 hasta n2
	7.      R[j] = A[q+j]
	8. L[n1+1] = infinito
	9. R[n2+1] = infinito
	10. i=1
	11. j=1
	12. Para k=p hasta r
	13.      Si(L[i] <= R[j]
	14.           A[k] = L[i]
	15.           i = i+1
	16.      Sino A[k] = R[j]
	17.           j = j+1

##Tiempo de ejecución##

Ci con i para linea del código, n el número de veces a ejecutarse

![ima](http://i.imgur.com/PBfFr4u.png)

en la cual la ecuación general queda de la siguiente forma: 

![ima2](http://i.imgur.com/ouHChJB.png)

##Reduccion de la ecuacion##

![ima3](http://i.imgur.com/YfQZZ1z.png)

##Orden##
![ima4](http://i.imgur.com/Gt0v58e.png)

##Código en Scala##

	object MergeSort {

	  def main(args: Array[String])
	  {
	    var a = Array(20,11,3,6,2,1,58,4,23,17)
	    print("Arreglo original: ")
		for(i<-0 to a.length-1)
	      print(a(i)+" ")
	
	    var b = mergeSort(a,0,a.length-1)
	    print("\nArreglo ordenado: ")
	    for(i<-0 to b.length-1)
	      print(b(i)+" ")
	  }
	  
	  def mergeSort(a2: Array[Int], p: Int, r: Int): Array[Int] = 
	  {
	    if (p < r)
	    {
	      var q = (p+r)/2
	      mergeSort(a2,p,q)
	      mergeSort(a2,q+1,r)
	      Mergesort(a2,p,q,r)
	    }
	    return a2
	  }
	  
	  def Mergesort(a3: Array[Int], p: Int, q: Int, r: Int): Array[Int] =
	  {
	    val n1 = q - p + 1
	    val n2 = r - q
	
	
	    var Izq = Array.ofDim[Int](n1+1)
	    var Der = Array.ofDim[Int](n2+1)
	    
	    for(i<-0 to n1-1)
	      Izq(i) = a3(p + i)
	    for(j<-0 to n2-1)
	      Der(j) = a3(q + j + 1)    
	    Izq(n1) = 100000000
	    Der(n2) = 100000000
	    var i=0
	    var j=0
	    for(k<-p to r)
	    {
	      if(Izq(i) <= Der(j))
	      {
	        a3(k) = Izq(i)
	        i = i+1
	      }
	      else{
	        a3(k) = Der(j)
	        j = j+1
	      }
	    }
	    return a3
	  }
	}
