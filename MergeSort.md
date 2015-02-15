#Merge sort 
El algoritmo de ordenamiento por mezcla (merge sort en inglés) es un algoritmo de ordenamiento externo estable basado en la técnica divide y vencerás. Es de complejidad O(n log n).


##Descripción
Fue desarrollado en 1945 por John Von Neumann.

Conceptualmente, el ordenamiento por mezcla funciona de la siguiente manera:

1. Si la longitud de la lista es 0 ó 1, entonces ya está ordenada. En otro caso:
2. Dividir la lista desordenada en dos sublistas de aproximadamente la mitad del tamaño.
3. Ordenar cada sublista recursivamente aplicando el ordenamiento por mezcla.
4. Mezclar las dos sublistas en una sola lista ordenada.


El ordenamiento por mezcla incorpora dos ideas principales para mejorar su tiempo de ejecución:

1. Una lista pequeña necesitará menos pasos para ordenarse que una lista grande.
2. Se necesitan menos pasos para construir una lista ordenada a partir de dos listas también ordenadas, que a partir de dos listas desordenadas. Por ejemplo, sólo será necesario entrelazar cada lista una vez que están ordenadas.
<br><br>

El algoritmo opera de la siguiente forma:

* **Divide**: Divide la secuencia de n elementos que se ordenarán en dos subsecuencias de n/2 elementos

* **Conquista**: Ordena las dos subsecuencias usando el algoritmo de combinación

* **Combina**: Combina las dos subsecuencias para producir un resultado

<br>
La condición de paro ocurre cuando la secuencia a ordernar es de longitud 1, en cuyo caso no hay nada que hacer, porque una secuencia de un elemento ya se encuentra ordenada


La operación clave del algoritmo de combinación es la mezcla de las dos secuencias ordenadas en el paso de combinación


##Algoritmo

```scala

	def sort(A: Array[Int], p: Int, r: Int): Unit = {
		if (p < r) {
			val q = (p + r) / 2
			sort(A, p, q)
			sort(A, q + 1, r)
			merge(A, p, q, r)
		}
	}

	def merge(A: Array[Int], p: Int, q: Int, r: Int) = {
		val n1 = q - p + 1
		val n2 = r - q
		val L = new Array[Int](n1 + 1)
		val R = new Array[Int](n2 + 1)

		for (i <- 0 to n1 - 1) { 
			L(i) = A(p + i)
		}
		L(L.length - 1) = 999999
		
		for (i <- 0 to n2 - 1) { 
			R(i) = A(q + i + 1)
		}
		R(R.length - 1) = 999999

		var i = 0
		var j = 0

		for (k <- p to r) {
			if (L(i) < R(j)) {
				A(k) = L(i)
				i = i + 1
			}
			else {
				A(k) = R(j)
				j = j + 1
			}
		}
	}
```

<br><br>
##Tiempo de Ejecución y Orden del algoritmo

![Demostración del orden de MergeSort](/imgs/Orden de MergeSort.png)