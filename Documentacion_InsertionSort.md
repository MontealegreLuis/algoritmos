#Insertion Sort
La ordenación por inserción es un sencillo algoritmo de ordenación que se basa en ordenar un elemento a la vez. 
Es una manera muy natural de ordenar, y puede usarse fácilmente para ordenar un mazo de cartas numeradas en forma arbitraria.
Inicialmente se tiene un solo elemento, obviamente es un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a mayor, se toma el elemento k+1 y se compara con todos los elementos ya ordenados, deteniéndose cuando se encuentra un elemento menor (todos los elementos mayores han sido desplazados una posición a la derecha) o cuando ya no se encuentran elementos (todos los elementos fueron desplazados y este es el más pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los demás elementos.

##Pseudocódigo
~~~
INSERTION-SORT(A)                                          Costo   Tiempo
1 para j =2 a n //n = longitud del arreglo A 		 		c1        n
2     key = A(j)                                            c2        n-1
3      i = j -1								 				c3        n-1
4      Mientras i > 0 y A(i) > key                          c4        sumatoria de j=2 a n (tj)
5             A(i + 1) = A(i)					 		    c5        sumatoria de j=2 a n (tj-1)
6 		i = i -1                                            c6        sumatoria de j=2 a n (tj-1)
7    A(i +1) = key                                          c7	      n-1
~~~

##Tiempo de ejecución
El tiempo de ejecución es la suma de los tiempos de cada línea ejecutada.
Si una línea toma ci para ejecutarse y se ejecuta n veces su tiempo total de ejecución es: c_i n
![1](http://www.sciweavers.org/tex2img.php?eq=t%28n%29%20%3D%20%20c_%7B1%7D%2Bc_%7B2%7D%28n-1%29%2Bc_%7B3%7D%28n-1%29%2Bc_%7B4%7D%28%20%5Csum_%7Bj%3D2%7D%5En%20tj%20%29%2Bc_%7B5%7D%28%20%5Csum_%7Bj%3D2%7D%5En%20%28tj-1%29%20%29%2Bc_%7B6%7D%28%20%5Csum_%7Bj%3D2%7D%5En%20%28tj-1%29%20%29%2Bc_%7B7%7D%28n-1%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
Ecuación 2

![2](http://www.sciweavers.org/tex2img.php?eq=%20c_%7B1%7Dn%2B%20c_%7B2%7D%28n-1%29%2Bc_%7B3%7D%28n-1%29%2Bc_%7B4%7D%28%20%5Cfrac%7Bn%28n%2B1%29%7D%7B2%7D-1%20%29%2Bc_%7B5%7D%28%20%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29%2Bc_%7B6%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29%2Bc_%7B7%7D%28n-1%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
Ecuación 3 
![3](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%3D%28%20%5Cfrac%7B%20c_%7B4%7D%20%7D%7B2%7D%2B%5Cfrac%7B%20c_%7B5%7D%20%7D%7B2%7D%2B%5Cfrac%7B%20c_%7B6%7D%20%7D%7B2%7D%20%29%20n%5E%7B2%7D%2B%28%20c_%7B1%7D%2Bc_%7B2%7D%2Bc_%7B3%7D%2B%5Cfrac%7B%20c_%7B4%7D%20%7D%7B2%7D%2B%5Cfrac%7B%20c_%7B5%7D%20%7D%7B2%7D%2B%5Cfrac%7B%20c_%7B6%7D%20%7D%7B2%7D%2B%20c_%7B7%7D%20%29n%20%2B%28c_%7B2%7D-c_%7B3%7D-c_%7B4%7D-c_%7B7%7D%29%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
Podemos expresar el tiempo de ejecución como:
![4](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%3D%28a%29%20n%5E%7B2%7D%2B%28%20b%29n%20%2Bc&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)  para constantes a, b, c que depende del costo de cada sentencia de ci

Por lo tanto el tiempo de ejecución es una funcion cuadrática de n
![5](http://www.sciweavers.org/tex2img.php?eq=%20%5CTheta%20%3D%20%20n%5E%7B2%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

##Codigó en Scala
~~~
object Insertion{
  def main(args: Array[String]) {
    val A = Array(2, 300, 45, 18, 29)
    var insertion = new InsertionSort()

    insertion.sort(A, true)

    for (number <- A) {
      println(number)
    }
  }
}


class InsertionSort{
  def sort(A: Array[Int], asc: Boolean){
    var key = 0
    var i = 0

    for (j <- 1 to A.length - 1) {
        key = A(j)
        i = j - 1
        while (i >= 0 && compare(A(i), key, asc)) {
           A(i + 1) = A(i)
           i = i - 1
        }
        A(i + 1) = key
    }
  }

  def compare(a: Int, b: Int, asc: Boolean): Boolean = {
    if (true == asc) {
      return a > b
    }
    return a <= b
  }
}
~~~

**Autor: ** *Guadalupe Nayeli Martínez Castillo*

