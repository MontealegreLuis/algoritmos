//Codigo de Merge con recursividad

//class MergeSort//En vez de class usar object para un solo archivo//ORIGINAL
object MergeSort
{
  def main(args: Array[String])
  {
    var i=0
    var A=Array(120,13,4,99,18,6,4,300,2)
    //var merge = new MergeSort()//Quitar este para un solo archivo
    //merge.sort(A,0,A.length-1)//Quitar el merge. para que jale

    //for(i<-0 to A.length-1)
    println("Arreglo original: ")
    for(i <-0 to 8)
    {
      print(A(i)+" ")
    }
    println()


  }


/*
  def sort(A: Array[Int], p:Int, r:Int)
  {
    if(p < r)
    {
      var q = (p+r)/2
      sort(A, p, q)
      sort(A, q+1, r)
      merge(A, p, q, r)

      return A
    }
  }//Hasta aqui la función recursiva

  //Función que mezcla los dos subarreglos ordenados
  def merge(A: Array[Int], p:Int, q:Int, r:Int)
  {
    val n1 = q-p+1
    val n2 = r-q
    var L = new Array[Int](n1+1)//Nuevo subarreglo del lado Izquierdo
    var R = new Array[Int](n2+1)//Nuevo subarreglo del lado Derecho

    //Llena el subarreglo L con los elementos de la izquierda del arreglo A
    for(i <-0 to n1-2)
    {
      L(i) = A(p + i -1)
    }
    
    for(j<-0 to n2-2)
    {
      R(j) = A(q + j)
    }

    //Agrega un elemento muy grande al último de cada subarreglo
    L(L.length + 1)=99999
    R(R.length + 1)=99999

    var i=0
    var j=0

    for(k <- p to r)
    {
      if ( L(i) < R(j) )
      {
        A(k) = L(i)
        i=i+1
      }
      else
      {
        A(k) = R(j)
        j=j+1
      }
    }//Llave del for

    return A
  }//Llave de la función merge

*/


}//Llave de object MergeSort
