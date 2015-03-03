#SELECTION SORT
Su función de este algoritmo es la **_ordenación_**, este algoritmo consiste en solicitar un conjunto de números los cuales son guardados en un arreglo, posteriormente con un _for_ recorre el arreglo desde 0 hasta n-1(n es el tamaño del arreglo), en este for se  asigna una variable llamada **key** la cual guarda el valor del numero en donde se sitúa el for y otra variable **x** la cual se inicializa en 0 y esta guardara la posición del valor mas pequeño del arreglo,dentro del for  con la ayuda de un _while_ que va desde la casilla donde se sitúa el for hasta n , continua un _if_  el cual compara si la variable key es mayor que el valor de casilla del arreglo en la que se sitúa el while, si entrara al **if** significa que ha encontrado en el resto del arreglo un valor mas pequeño, lo que hace el algoritmo es asignarle el valor que se a encontrado a la variable **key** y a la variable x se le asigna la posición de esta variable.

Cuando termina el recorrido del **while** con un **if** se compara el valor de la variable **key** con el valor del arreglo donde se sitúa el **for** si estas dos variables son diferentes, significaría que en el arreglo encontró otro numero mas pequeño; entonces se hace el intercambio (el numero menor se cambia a la posición donde se sitúa el for y el otro valor se manda a la posición donde se encontró el valor menor). 


Al finalizar el **for ** el arreglo queda ordenado de menor a mayor.
##Pseudocódigo
~~~
													  Costo    Tiempo
        Arreglo A=(20,254,36,18,4)    					c1		  1	
        key=0   										c2		  1
	    j=0    											c3  	  1
     	para i=0 a n-1 /*n= longitud del arreglo A*/    c4		  n
      		key = A(i)   								c5		  n-1
      		j = i   									c6 		  n-1
		    x = 0   									c7        n-1
      		Mientras(j<n)    							c8        sumatoria de j=i hasta n (tj)
	   	      Si (key>A(j))   							c9        sumatoria de j=i hasta n (tj -1)
		          key=A(j)   							c10       sumatoria de j=i hasta n (tj)
		          x=j									c11       sumatoria de j=i hasta n (tj)
	          j=j+1     								c12       sumatoria de j=i hasta n (tj)
            Si (key!=A(i))    							c13		  n-1
		       A(x)=A(i)    							c14	      n-1
		       A(i)=key									c15   	  n-1
~~~


##Tiempo de ejecución
El tiempo de ejecución es la suma de los tiempos de cada línea ejecutada.
Si una línea toma ci para ejecutarse y se ejecuta n veces su tiempo total de ejecución es: c_i n

T(n)=![Ecuación 1](http://www.sciweavers.org/tex2img.php?eq=%20c_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2Bc_%7B4%7Dn%2Bc_%7B5%7D%28n-1%29%2Bc_%7B6%7D%28n-1%29%2Bc_%7B7%7D%28n-1%29%2Bc_%7B8%7D%28%5Csum_%7Bj%3Di%7D%5En%20tj%29%2Bc_%7B9%7D%28%5Csum_%7Bj%3Di%7D%5En%20tj-1%29%2Bc_%7B10%7D%28%5Csum_%7Bj%3Di%7D%5En%20tj-1%29%2Bc_%7B11%7D%28%5Csum_%7Bj%3Di%7D%5En%20tj%29%2Bc_%7B12%7D%28%5Csum_%7Bj%3Di%7D%5En%20tj%29%2Bc_%7B13%7D%28n-1%29%2Bc_%7B14%7D%28n-1%29%2Bc_%7B15%7D%28n-1%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![Ecuacion 2](http://www.sciweavers.org/tex2img.php?eq=%20c_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2Bc_%7B4%7Dn%2Bc_%7B5%7Dn-c_%7B5%7D%2Bc_%7B6%7Dn-%20c_%7B6%7D%2Bc_%7B7%7Dn-%20c_%7B7%7D%2Bc_%7B8%7D%28%20%5Cfrac%7Bn%28n%2B1%29%7D%7Bi%7D-1%29%2Bc_%7B9%7D%28%20%5Cfrac%7Bn%28n-1%29%7D%7Bi%7D%20%29%2Bc_%7B10%7D%28%5Cfrac%7Bn%28n-1%29%7D%7Bi%7D%29%2Bc_%7B11%7D%28%5Cfrac%7Bn%28n-1%29%7D%7Bi%7D%29%2Bc_%7B12%7D%28%5Cfrac%7Bn%28n-1%29%7D%7Bi%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![Ecuación 3](http://www.sciweavers.org/tex2img.php?eq=%20c_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2Bc_%7B4%7Dn%2Bc_%7B5%7Dn-c_%7B5%7D%2Bc_%7B6%7Dn-%20c_%7B6%7D%2Bc_%7B7%7Dn-%20c_%7B7%7D%2Bc_%7B8%7D%28%20%5Cfrac%7Bn%5E%7B2%7D%2Bn-i%7D%7Bi%7D%29%2Bc_%7B9%7D%28%20%5Cfrac%7Bn%5E%7B2%7D-n%7D%7Bi%7D%20%29%2Bc_%7B10%7D%28%5Cfrac%7Bn%5E%7B2%7D-n%7D%7Bi%7D%29%2Bc_%7B11%7D%28%5Cfrac%7Bn%5E%7B2%7D-n%7D%7Bi%7D%29%2Bc_%7B12%7D%28%5Cfrac%7Bn%5E%7B2%7D-n%7D%7Bi%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![Ecuación 4](http://www.sciweavers.org/tex2img.php?eq=%20c_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2Bc_%7B4%7Dn%2Bc_%7B5%7Dn-c_%7B5%7D%2Bc_%7B6%7Dn-%20c_%7B6%7D%2Bc_%7B7%7Dn-%20c_%7B7%7D%2B%28%5Cfrac%7Bc_%7B8%7D%20n%5E%7B2%7D%20%7D%7Bi%7D%29%2B%28%5Cfrac%7Bc_%7B8%7D%20n%20%7D%7Bi%7D%29-%28%5Cfrac%7Bc_%7B8%7D%20i%7D%7Bi%7D%29%2B%28%5Cfrac%7Bc_%7B9%7D%20%20%20n%5E%7B2%7D%20%7D%7Bi%7D%29-%28%5Cfrac%7Bc_%7B9%7D%20n%7D%7Bi%7D%29%2B%28%5Cfrac%7Bc_%7B10%7D%20%20n%5E%7B2%7D%20%7D%7Bi%7D%29-%28%5Cfrac%7Bc_%7B10%7D%20%20n%7D%7Bi%7D%29%2B%28%5Cfrac%7Bc_%7B11%7D%20%20n%5E%7B2%7D%20%7D%7Bi%7D%29-%28%5Cfrac%7Bc_%7B11%7D%20n%7D%7Bi%7D%29%2B%28%5Cfrac%7Bc_%7B12%7D%20%20n%5E%7B2%7D%20%7D%7Bi%7D%29-%28%5Cfrac%7Bc_%7B8%7Dn%7D%7Bi%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![Ecuación 5](http://www.sciweavers.org/tex2img.php?eq=%20%28%20%5Cfrac%7B%20c_%7B8%7D%20%7D%7Bi%7D%2B%5Cfrac%7B%20c_%7B9%7D%20%7D%7Bi%7D%2B%5Cfrac%7B%20c_%7B10%7D%20%7D%7Bi%7D%2B%5Cfrac%7B%20c_%7B11%7D%20%7D%7Bi%7D%2B%5Cfrac%7B%20c_%7B12%7D%20%7D%7Bi%7D%29%20n%5E%7B2%7D%20%2B%20%28%20c_%7B4%7D%2B%20c_%7B5%7D%2B%20c_%7B6%7D%2B%20c_%7B7%7D%2B%20%5Cfrac%7B%20c_%7B8%7D%20%7D%7Bi%7D-%5Cfrac%7B%20c_%7B9%7D%20%7D%7Bi%7D-%5Cfrac%7B%20c_%7B10%7D%20%7D%7Bi%7D-%5Cfrac%7B%20c_%7B11%7D%20%7D%7Bi%7D-%5Cfrac%7B%20c_%7B12%7D%20%7D%7Bi%7D%29n%20%2B%20%28%20c_%7B1%7D%2B%20c_%7B2%7D%2B%20c_%7B3%7D-%20c_%7B5%7D-%20c%7B6%7D-%20c_%7B7%7D-%20c_%7B8%7D%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

![Ecuación 6](http://www.sciweavers.org/tex2img.php?eq=%20%28a%29%20n%5E%7B2%7D%20%2B%20%28b%29n%20%2B%20c&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

Podemos expresar el tiempo de ejecución como:
![Ecuación 7](http://www.sciweavers.org/tex2img.php?eq=%28a%29n%5E%7B2%7D%20%2B%28b%29n%2Bc&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0) para constantes a, b y c que dependan del costo de cada sentencia ci

Por lo tanto el tiempo de ejecución es una función cuadrática de n.
Por lo tanto es de  ![Ecuación 8](http://www.sciweavers.org/tex2img.php?eq=%5CTheta%20%20n%5E%7B2%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)


##Código en scala
~~~
object SelectionSort{
     def main (args: Array [String]){
     	val A = Array(20,254,36,18,4)
        var key=0
	    var j=0
	    var x=0   
     	for (i <- 0 to A.length-1) {
      		key = A(i)
      		j = i
		    x = 0
      		while (j<A.length) {
	   	      if(key>A(j)){
		          key=A(j)
		          x=j	
	          }
	          j=j+1 
            }
		    if(key!=A(i)){
		       A(x)=A(i)
		       A(i)=key	
 		    }
        }
     	for (number <- A) {
       	     println(number)
        }
     }
}
~~~

**Autor: ** *Guadalupe Nayeli Martínez Castillo*
