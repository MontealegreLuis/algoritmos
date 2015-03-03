# Ordenamiento por mezcla #

Fue desarrollado en 1945 por John Von Neumann .[cita requerida]

Conceptualmente, el ordenamiento por mezcla funciona de la siguiente manera:

1. Si la longitud de la lista es 0 ó 1, entonces ya está ordenada. En otro caso:
2. Dividir la lista desordenada en dos sublistas de aproximadamente la mitad del tamaño.
3. Ordenar cada sublista recursivamente aplicando el ordenamiento por mezcla.
4. Mezclar las dos sublistas en una sola lista ordenada.

El ordenamiento por mezcla incorpora dos ideas principales para mejorar su tiempo de ejecución:

1. Una lista pequeña necesitará menos pasos para ordenarse que una lista grande.
2. Se necesitan menos pasos para construir una lista ordenada a partir de dos listas también ordenadas, que a partir de dos listas desordenadas. Por ejemplo, sólo será necesario entrelazar cada lista una vez que están ordenadas.

### Pseudocodigo ###


	function mergesort(m)
  		var list left, right, result
  		if length(m) ≤ 1
      		return m
  		else
      		var middle = length(m) / 2
      		for each x in m up to middle - 1
          		add x to left
      		for each x in m at and after middle
          		add x to right
      		left = mergesort(left)
      		right = mergesort(right)
      		if last(left) ≤ first(right) 
         		append right to left
         		return left
      		result = merge(left, right)
      		return result

	function merge(left,right)
  		var list result
  		while length(left) > 0 and length(right) > 0
      		if first(left) ≤ first(right)
          		append first(left) to result
          		left = rest(left)
      		else
          		append first(right) to result
          		right = rest(right)
  		if length(left) > 0 
      			append rest(left) to result
  		if length(right) > 0 
      			append rest(right) to result
  		return result

## Implementacion en Scala ##

	object mergeSort {

  	def sort(A: Array[Int], p: Int, r: Int) {
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

    for (i <- 0 to n1 - 1) { L(i) = A(p + i)}
    L(L.length - 1) = 999999
    
    for (i <- 0 to n2 - 1) { R(i) = A(q + i + 1)}
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
  

    def main(args: Array[String]) {
    	var A = Array(10, 13, 94, 9, 180, 8, 99, 30, 2)
    	print("Original: ")
        for(Cont <- A){print(Cont + " ")}
        print("\n")

    	sort(A, 0, A.length - 1)
        print("Ordenado: ")
        for(Cont <- A){print(Cont + " ")}
     }
    }

