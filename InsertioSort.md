#Ordenacion por Insercion
##Descripcion del algoritmo
El ***ordenamiento por inserción*** es una manera muy natural de ordenar para un ser humano. Requiere O(n²) operaciones para ordenar una lista de n elementos.

Inicialmente se tiene un solo elemento, que obviamente es un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a mayor, se toma el elemento k+1 y se compara con todos los elementos ya ordenados, deteniéndose cuando se encuentra un elemento menor (todos los elementos mayores han sido desplazados una posición a la derecha) o cuando ya no se encuentran elementos (todos los elementos fueron desplazados y este es el más pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los demás elementos.

####Calculo de tiempo de ejecucion del algoritmo 

```scala
object InsertionSort 
{

  def main(args:Array[String])
  {
    var A=Array(4,32,312,52,743,423,7)
    var x=0
    var j=0
    for(i <-0 to A.length-1)    	 //c1
    {
      x=A(i); 					 	//c2
      j=i;							//c3
      while(j>0 && A(j-1)>x)    	//c4
      {
        A(j)=A(j-1);				//c5
        j=j-1;						//c6					
      }
      A(j)=x;						//c7
    }
    }
  }
}
```
-------------------------------------
####con j=2
![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422132539/render.png) 

###Tiempo de ejecucion peor de los casos

![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422132394/render.png)
#O(n2)
