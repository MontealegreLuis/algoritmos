# Algoritmo de SelectionSort

## Descripción:
El **ordenamiento por seleccion** es un algotimo que de un arreglo de numeros hace:

    Buscar el número mas pequeño en el arreglo.
    Hace intercambio si es que encuentra uno mas pequeño y después vuelve al siguiente número más pequeño en el resto del arreglo y lo intercambia.

##Pseudocódigo
```     
1 Para i <- 1 Hasta n Hacer							c1	
2     indice <- i					 				c2
3     menor <- A[i]					 				c3
4     Para j <- (i + 1) Hasta n Hacer				c4
5         Si menor > A[j] Entonces			        c5
6             menor <- A[j]				 			c6
7             indice <- j				 			c7
8         FinSi						 
9     FinPara						 
10    Si indice <> i Entonces				 		c8
11        auxiliar <- A[indice]				 		c9
12        A[indice] <- A[i]				 			c10
13        A[i] <- auxiliar				 			c11
14    FinSi						 
15 FinPara						 
```

## Cálculo de ejecución
Primero hacemos nuestra tabla localizando a cada c su tiempo de ejecución


Costo-Tiempo
 c1        	n
 c2        n-1
 c3        n-1
 c4        [c4](http://latex.codecogs.com/gif.latex?\inline&space;\sum_{j=i&plus;1}^{n-1}&space;j)
 c5        [c5](http://latex.codecogs.com/gif.latex?\inline&space;\sum_{j=i&plus;1}^{n-1}&space;j-1)
    c6        [c6](http://latex.codecogs.com/gif.latex?\inline&space;\sum_{j=i&plus;1}^{n-1}&space;j-1)
      c7        [c7](http://latex.codecogs.com/gif.latex?\inline&space;\sum_{j=i&plus;1}^{n-1}&space;j-1)
 c8        n-1
      c9        n-1
      c10       n-1
      c11       n-1

Ahora realizaremos el cálculo

T(n) = c1n + c2(n-1) + c3(n-1) +[c4](http://latex.codecogs.com/gif.latex?\inline&space;\sum_{j=i&plus;1}^{n-1}&space;j) + [c5](http://latex.codecogs.com/gif.latex?\inline&space;\sum_{j=i&plus;1}^{n-1}&space;j-1) + [c6](http://latex.codecogs.com/gif.latex?\inline&space;\sum_{j=i&plus;1}^{n-1}&space;j-1) + [c7](http://latex.codecogs.com/gif.latex?\inline&space;\sum_{j=i&plus;1}^{n-1}&space;j-1) + c8(n-1) + c9(n-1) + c10(n-1) + c11(n-1)


= c1n + c2n - c2 + c3n -c3 + [c4](http://latex.codecogs.com/gif.latex?\inline&space;c4\left&space;(&space;\frac{n\left&space;(&space;n-1&space;\right&space;)}{2}&space;\right&space;)) + [c5](http://latex.codecogs.com/gif.latex?\inline&space;\left&space;(&space;\frac{n\left&space;(&space;n-1&space;\right&space;)}{2}&space;\right&space;)) + [c6](http://latex.codecogs.com/gif.latex?\inline&space;\left&space;(&space;\frac{n\left&space;(&space;n-1&space;\right&space;)}{2}&space;\right&space;)) + [c7](http://latex.codecogs.com/gif.latex?\inline&space;\left&space;(&space;\frac{n\left&space;(&space;n-1&space;\right&space;)}{2}&space;\right&space;)) + c8n - c8 + c9n - c9 + c10n - c10 + c11n - c11

= c1n + c2n - c2 + c3n - c3 + [c4](http://latex.codecogs.com/gif.latex?\inline&space;c4\left&space;(&space;\frac{n\left&space;(&space;n-1&space;\right&space;)}{2}&space;\right&space;)) + [c5]() + [c6]() + [c7]() + c8n - c8 + c9n- c9 + c10n -c10 + c11n - c11

= c1n +c2n - c2 + c3n -c3 + [c4-7](http://latex.codecogs.com/gif.latex?\inline&space;c4\frac{n^{2}}{2}&space;&plus;&space;c4\frac{n}{2}&space;-c4&space;&plus;c5\frac{n^{2}}{2}&space;-&space;c5\frac{n}{2}&space;&plus;c6\frac{n^{2}}{2}&space;-&space;c6\frac{n}{2}&space;&plus;c7\frac{n^{2}}{2}&space;-&space;c7\frac{n}{2})                         + c8n - c8 + c9n- c9 + c10n -c10 + c11n - c11

 [=](http://latex.codecogs.com/gif.latex?\inline&space;\left&space;(&space;\frac{c4}{2}&space;&plus;&space;\frac{c5}{2}&space;&plus;&space;\frac{c6}{2}&space;&plus;&space;\frac{c7}{2&space;}\right&space;)n^{2}&space;&plus;\left&space;(&space;c1&plus;c2&plus;c3&plus;&space;\frac{c4}{2}&space;&plus;&space;\frac{c5}{2}&space;&plus;&space;\frac{c6}{2}&space;&plus;&space;\frac{c7}{&space;2}&space;&plus;&space;c8&plus;c9&plus;c10&plus;c11\right&space;)n&space;-\left&space;(&space;c2&plus;c3&plus;c4&plus;c8&plus;c9&plus;c10&plus;c11&space;\right&space;))
 
[= ](http://latex.codecogs.com/gif.latex?\inline&space;an^{2}&space;&plus;bn&space;-&space;c)

Por lo tanto llegamos a la conclusión de que El algoritmo de Selection es de [orden](http://latex.codecogs.com/gif.latex?\inline&space;\dpi{200}&space;\huge&space;n^{2})
