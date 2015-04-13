#Algoritmo de Ordenamiento "_Insertion-Sort_"

<pr>
##Descripción

En este algoritmo de ordenación consiste en ir insertando un elemento de la lista, en su parte ordenada, **suponiendo que el primer elemento es la parte ordenada**, el algoritmo ira comparando un elemento de la parte desordenada de la lista con los elementos de la parte ordenada, insertando el elemento en la posición correcta dentro de la parte ordenada, y así sucesivamente hasta obtener la lista ordenada.
Ventajas del algoritmo:

+ Es sencillo de entender y codificar.
+ Si el tamaño de la entrada es **N**, entonces el orden del tiempo de ejecución, para el peor caso es O(N2).
+ Si la entrada esta "casi ordenada", el algoritmo se ejecuta mucho más rápidamente.Esta velocidad tiende a un tiempo O(N), peor caso que se cumple cuando la entrada está totalmente ordenada.
+ A pesar de no ser el más rápido para entradas grandes, suele usarse de la siguiente manera: Se pone semi-ordena la entrada con algún otro algoritmo más rápido y más adecuado para entradas grandes. Y cuando tenemos la entrada "casi ordenada" utilizamos este algoritmo.

#Seudocódigo
![GitHub Logo](/images/IS.jpg)

##Código en scala
        
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
           if(true == asc) {
            return a > b
          }
            return a <= b }
          }

##Calcular tiempo de ejecución
Basandonos en el algoritmo,realizaremos los cálculos del tiempo de ejecución.

###Paso 1:
![GitHub Logo](/images/insrt_cost.jpg)

**Recordemos que:  

+ Si una línea toma  c i   para ejecutarse   y se ejecuta  n  
veces su tiempo total de ejecución es  c i n 

###Paso 2:
![GitHub Logo](/images/1.png)

![GitHub Logo](/images/2.png)
###Paso 3:
Ahora sustituiremos C5, C6 Y C7 con 

![GitHub Logo](/images/z.jpg)



Sustituyendo queda

##Paso 4 Resolver:

![GitHub Logo](/images/3.jpg)



![GitHub Logo](/images/4.png)

![GitHub Logo](/images/6.jpg)

![GitHub Logo](/images/7.jpg)

 El orden de crecimiento del algoritmo es:

![GitHub Logo](/images/ress.jpg)


