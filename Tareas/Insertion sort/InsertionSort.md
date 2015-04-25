#Insertion Sort

Es un algoritmo que construye el arreglo ordenado final un item a la vez. Es mucho menos eficiente en listas grandes que algoritmos mas avanzados como quicksort, heapsort, o merge sort.

Inicialmente se tiene un solo elemento, que obviamente es un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a mayor, se toma el elemento k+1 y se compara con todos los elementos ya ordenados, deteniéndose cuando se encuentra un elemento menor (todos los elementos mayores han sido desplazados una posición a la derecha) o cuando ya no se encuentran elementos (todos los elementos fueron desplazados y este es el más pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los demás elementos.

###Pseudocodigo
	1 for j = 2 to A.length
	2 	key = A[j]
	3 	//Insert A[j] into the sorted sequence A[1...j-1]
	4 	i = j - 1
	5 	while i > 0 and A[i] > key
	6 		A[i + 1] = A[i]
	7	A[i + 1] = key

###Código
```Scala
object HelloWorld {
  def main(args: Array[String]) {
    val A = Array(2, 300, 45, 18, 29)
    var insertion = new InsertionSort()

    insertion.sort(A, true)

    for (number <- A) {
      println(number)
    }
  }
}
```

```Scala
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
    }n
  }

  def compare(a: Int, b: Int, asc: Boolean): Boolean = {
    if (true == asc) {
      return a > b
    }
    return a <= b
  }
}

```

-**Tiempo de ejecución**
-
-Ci con i para linea del código, n el número de veces a ejecutarse
-
-Ecuación general:
-
-![Ecuacion general](http://www.sciweavers.org/tex2img.php?eq=c_1n%20%20%2B%20c_2%5Cbig%28n%20-%201%5Cbig%29%20%20%2B%20c_3%5Cbig%28n%20-%201%5Cbig%29%20%2B%20c_4%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20t_%7Bj%7D%0A%20%2B%20c_5%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20%5Cbig%28t_%7Bj%7D%20-%201%5Cbig%29%20%2B%20c_6%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20%5Cbig%28t_%7Bj%7D%20-%201%5Cbig%29%20%2B%20c_7%5Cbig%28n%20-%201%5Cbig%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
-
-**Mejor caso: Arreglo ordenado**
-
-    Con tj = 1 
-
-![Ecuacion mejor caso](http://www.sciweavers.org/tex2img.php?eq=%0Ac_1n%20%2B%20c_2%5Cbig%28n%20-%201%5Cbig%29%20%2B%20c_3%5Cbig%28n%20-%201%5Cbig%29%20%2B%20c_4%5Cbig%28n%20-%201%5Cbig%29%20%2B%20c_7%5Cbig%28n%20-%201%5Cbig%29%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
-
-**Peor caso: Arreglo inversamente ordenado**
-
-    Con tj = j para j=2,....,n 
-
-![Ecuacion peor caso](http://www.sciweavers.org/tex2img.php?eq=%5Cbig%28%20%5Cfrac%7Bc_4%20%2B%20c_5%20%2B%20c_6%7D%7B2%7D%5Cbig%29n%5E%7B2%7D%20%20%2B%20%5Cbig%28c_1%20%2B%20c_2%20%2B%20c_3%20%2B%20%5Cbig%28%20%5Cfrac%7Bc_4%20-%20c_5%20-%20c_6%7D%7B2%7D%5Cbig%29%20%2B%20c_7%5Cbig%29n%20%20-%20%5Cbig%28c_2%20%2B%20c_3%20%2B%20c_4%20%2B%20c_7%5Cbig%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
-
-**Orden del algoritmo:**
-
-![Orden](http://www.sciweavers.org/tex2img.php?eq=O%5Cbig%28n%5E%7B2%7D%5Cbig%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
