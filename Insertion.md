# Insertion Sort #

__Ordenamiento por Inserción:__ Supóngase que se desea ordenar los siguientes claves del arreglo (A) utilizando el método de inserción directa el cual consiste en insertar un elemento del arreglo en la parte izquierda del mismo que ya se encuentra ordenada. Este proceso se repite desde el segundo hasta el n-esimo elemento.

### Implementacion en Scala ###

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

### Pseudocodigo ###


    Insertion-Sort(A)					Costo	Tiempo
	1 for j= 2 to A.length				c1		n
	2	key = A[j]						c2		n-1
	3	//Insert A[j] into the sorted 
		//sequence A[1..j-1].
	4	i=j-1							c4		n-1
	5 	while i>0 and A[i]>key			c5		Σ(j=2->n) tj
	6 		A[i+1]=A[i]					c6		Σ(j=2->n) tj-1
	7		i=i-1						c7		Σ(j=2->n) tj-1
	8	A[i+1]=key						c8		n-1


<img src="http://www.sciweavers.org/tex2img.php?eq=T%28n%29%3Dc1%28n%29%2Bc2%28n-1%29%2Bc4%28n-1%29%2Bc5%20%5Csum_j%5En%20tj%20%2B%20c6%20%5Csum_j%5En%20%28tj-1%29%2Bc7%20%5Csum_j%5En%20%28tj-1%29%2B%20c8%28n-1%29%3B%20j%3D2.%20%20%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0" align="center" border="0" alt="T(n)=c1(n)+c2(n-1)+c4(n-1)+c5 \sum_j^n tj + c6 \sum_j^n (tj-1)+c7 \sum_j^n (tj-1)+ c8(n-1); j=2.   " width="775" height="53" />

<img src="http://www.sciweavers.org/tex2img.php?eq=T%28n%29%3Dc1n%2Bc2n-c2%2Bc4n-c4%2Bc5%20%28%20%5Cfrac%7B%5C%20n%28n%2B1%29%7D%7B%5C%202%7D%20%29%20%2B%20c6%20%28%20%5Cfrac%7B%5C%20n%28n%2B1%29%7D%7B%5C%202%7D%20%29%2Bc7%20%20%28%20%5Cfrac%7B%5C%20n%28n%2B1%29%7D%7B%5C%202%7D%20%29%2B%20c8n-c8%29.%20%20%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0" align="center" border="0" alt="T(n)=c1n+c2n-c2+c4n-c4+c5 ( \frac{\ n(n+1)}{\ 2} ) + c6 ( \frac{\ n(n+1)}{\ 2} )+c7  ( \frac{\ n(n+1)}{\ 2} )+ c8n-c8).   " width="774" height="43" />

<img src="http://www.sciweavers.org/tex2img.php?eq=T%28n%29%3D%28%20%5Cfrac%7Bc5%7D%7B2%7D%20%2B%20%5Cfrac%7Bc6%7D%7B2%7D%20%2B%20%5Cfrac%7Bc7%7D%7B2%7D%29%20n%5E%7B2%7D%2B%28c1%2Bc2%2Bc4%2B%5Cfrac%7Bc5%7D%7B2%7D%20-%20%5Cfrac%7Bc6%7D%7B2%7D%20-%20%5Cfrac%7Bc7%7D%7B2%7D%20%2B%20c8%29n%20-%28c2%2Bc4%2Bc5%2Bc8%29.%20%20%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0" align="center" border="0" alt="T(n)=( \frac{c5}{2} + \frac{c6}{2} + \frac{c7}{2}) n^{2}+(c1+c2+c4+\frac{c5}{2} - \frac{c6}{2} - \frac{c7}{2} + c8)n -(c2+c4+c5+c8).   " width="707" height="43" />

<img src="http://www.sciweavers.org/tex2img.php?eq=T%28n%29%3Da%20n%5E%7B2%7D%20%2Bbn-c.&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0" align="center" border="0" alt="T(n)=a n^{2} +bn-c." width="169" height="21" />

Siendo de orden cuadratico.