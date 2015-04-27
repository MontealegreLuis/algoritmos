#**Merge Sort**#

###Descripción del algoritmo###
 Es un algoritmo de ordenamiento externo estable basado en la técnica divide y vencerás.El ordenamiento por mezcla funciona de la siguiente manera:


- Si la longitud de la lista es 0 ó 1, entonces ya está ordenada.
-  En otro caso: Dividir la lista desordenada en dos sublistas de aproximadamente la mitad del tamaño. Ordenar cada sub lista recursivamente aplicando el ordenamiento por mezcla. Mezclar las dos sub listas en una sola lista ordenada.

###Pseudocódigo###

   
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

----------

####Complejidad###

![Texto alternativo](http://images.slideplayer.it/2/585223/slides/slide_3.jpg "Título de la imagen")



Lo que da una función de orden **O(n logn)** (una
vez aplicadas las reglas de la suma.
