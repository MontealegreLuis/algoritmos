#Algoritmo de Ordenamiento "_Merge-Sort_"

<pr>
##Descripción
Los algoritmos divide y vencerás se dividen en 
tres pasos en cada nivel de la recursión

+ **Dividen** el problema en subproblemas que son 
instancias más pequeñas del problema original
+ **Conquistan** el subproblema resolviéndolo 
recursivamente de la forma más simple posible
+ **Combinan** las soluciones de los subproblemas para 
llegar a la solución para el problema original.

El algoritmo **merge sort** sigue 
el paradigma divide y vencerás.

● El algoritmo opera de la siguiente forma:

+ Divide: Divide la secuencia de  n  elementos que se 
ordenarán en dos sub-secuencias de  n/2  elementos
+  Conquista: Ordena las dos subsecuencias usando el 
algoritmo de combinación
+  Combina: Combina las dos subsecuencias para 
producir un resultado

Consiste en dividir el problema a resolver en subproblemas del mismo tipo que a su vez se dividirán, mientras no sean suficientemente pequeños o triviales.

Pasos:

+ Ordenar una secuencia S de elementos:
   + Si S tiene uno o ningún elemento, está ordenada
   + Si S tiene al menos dos elementos se divide en dos secuencias S1 y S2, S1 conteniendo los primeros n/2, y S2 los restantes.
   + Ordenar S1 y S2, aplicando recursivamente este procedimiento.
   + Mezclar S1 y S2 ordenadamente en S
+ Mezclar dos secuencias ordenadas S1 y S2 en S:
   + Se tienen referencias al principio de cada una de las secuencias a mezclar (S1 y S2).
   + Mientras en alguna secuencia queden elementos, se inserta en la secuencia resultante (S) el menor de los elementos referenciados y se avanza esa referencia una posición.
 
          ![GitHub Logo](/mer/ejem.gif)

Ventajas del algoritmo:

+ Método estable de ordenamiento mientras la operacion de mezcla sea bien implementada.
+ El algoritmo es efectivo para conjuntos de datos que se puedan acceder secuencialmente como arreglos.

Su principal desventaja es que se encuentra definido recursivamente y su implementación no recursivaemplea una pila, por lo que quiere un espacio adicional de memoria para almacenarla.

##Pseudocódigo##
![GitHub Logo](/mer/mer.jpg)

    #Código en scala
        
        //Clase
        class MergeSort {
        
        def sort(A: Array[Int], p: Int, r:Int):Unit={
          if(p < r){
            val q= ((p+r)/2)
            sort(A,p,q)
            sort(A,q+1,r)
            merge(A,p,q,r)
          }
        }
    
        def merge(A:Array[Int],p:Int,q:Int,r:Int):Unit=
        {
        var (i,j,k)=(0,0,0)
        val n1= (q-p)+1
        val n2= r-q
        var L= new Array[Int](n1+1)
        var R= new Array[Int](n2+1)
       
        for(i<- 1 to n1){

         L(i-1)=A((p + i)-1)
        }
        for(j<- 1 to n2){
          R(j-1)=A(q + j)
        }
      
        L(n1)= 90000
        R(n2)= 90000      
      
        i= 0 
        j= 0
      
         for(k<- p to r){
          if(L(i) <= R(j) ){
            A(k)=L(i)
            i=i+1
         }
         else{
           A(k)=R(j)
           j=j+1
         }     
        }
        }
        }
             

        //Main
        object MergeSortMain {

        def main(args: Array[String]){
    
         var A= Array(38, 27, 43, 100,3, 9, 82, 10)
        
         var merge = new MergeSort()
    
         merge.sort(A, 0, (A.length-1))
    
        for (number <- A) {
     
        println(number)
  
        }
        }
        }

##Tiempo de ejecución
Basandonos en el algoritmo del pseudocódigo calcularemos el tiempo de ejecución 


###Paso 1:
Como la secuencia de *n* elementos se divide en en dos subsecuencias de n/2 elementos, y nos para los costos de los ciclos nos quedan:

![GitHub Logo](/mer/n.png)

y

![GitHub Logo](/mer/n2.png)


###Entonces:

![GitHub Logo](/mer/ss1.png)

###Paso 2:

![GitHub Logo](/mer/ss2.png)
###Paso 3:

![GitHub Logo](/mer/ss3.png)

Considerando únicamente el término principal de la fórmula el orden de crecimiento del algoritmo es:

![GitHub Logo](/mer/ss4.png)




