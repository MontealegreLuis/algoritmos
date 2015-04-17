#Algoritmo de Ordenamiento "_Selection-Sort_"

<pr>
##Descripción

El algoritmo de ordenación por el método de selección directa es un algoritmo relativamente sencillo y uno de los más fáciles de recordar e implementar.

Se basa en realizar varias pasadas, intentando encontrar en cada una de ellas el elemento de ordenación mínimo y colocándolo posteriormente en su sitio.

El algoritmo consiste en realizar varias pasadas sobre el array, logrando que en cada pasada el elemento de menor valor se coloque al principio del array en un solo intercambio. En cada pasada se recorre la parte no ordenada del array realizando comparaciones con objeto de buscar el elemento de menor valor. Una vez localizado, se intercambia por el primer elemento de la parte no ordenada, y entonces ya está ordenado.

Desventajas del algoritmo:

+ no suele dar resultados buenos si se compara con otros métodos de ordenación.
+ Realiza una enorme cantidad de comparaciones.

Es un algoritmo no estable de ordenación interna y su complejidad temporal en el peor caso es del orden de **O(n2)** y en el mejor caso, que el array ya esté totalmente ordenado pues también es **0(n2)** siendo n el tamaño del array a ordenar,el caso es que éste algoritmo siempre hace el mismo número de comparaciones e intercambios para un n dado

#Seudocódigo
![GitHub Logo](/select/ss.png)

##Código en scala
        
        object SelentionSort {
    def main(args: Array[String]){
    
      var A= Array(18, 7, 20, 15)
    
      var aux=0
      var tem=0
      var t=0
      var f=0
      
      for(i <- 0 to (A.length-1)){
        tem=0
        t=A(i)
      
       for(j <- (i+1) to (A.length-1)){
        if(t > A(j)){
          f=1
          aux=j
          t=A(j)
          
        }
       }
        if(f==1){
          tem=A(i)
          A(i)=A(aux)
          A(aux)=tem
          f=0
          
        }                 
      }
        
      for (number <- A) {
     
      println(number)  
    }
    }
    }


##Tiempo de ejecución
Basandonos en el algoritmo del pseudocódigo, calcularemos el tiempo de ejecucion

###Paso 1:

![GitHub Logo](/select/3.png)



![GitHub Logo](/select/12.png)

Con lo anterior, queda


###Paso 2:
![GitHub Logo](/select/4.png)


###Paso 4:
![GitHub Logo](/select/5.png)

![GitHub Logo](/select/6.png)

###Paso 5:

![GitHub Logo](/select/7.png)

###Paso 6:

![GitHub Logo](/select/8.png)

###Paso 7:

Considerando únicamente el término principal de la fórmula el orden de crecimiento del algoritmo es:

![GitHub Logo](/select/9.png)



