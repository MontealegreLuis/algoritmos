//Codigo de Merge con recursividad

//class MergeSort//En vez de class usar object para un solo archivo//ORIGINAL
object MergeSort
{
  def sort(A: Array[Int], p:Int, r:Int): Array[Int] =
  {
    if(p < r)
    {
      var q = (p+r)/2
      sort(A, p, q)
      sort(A, q+1, r)
      merge(A, p, q, r)
    }
    return A
  }//Hasta aqui la función recursiva

  //Función que mezcla los dos subarreglos ordenados
  def merge(A: Array[Int], p:Int, q:Int, r:Int): Array[Int] =
  {
    val n1 = q-p+1
    val n2 = r-q
    var L = new Array[Int](n1+1)//Nuevo subarreglo del lado Izquierdo
    var R = new Array[Int](n2+1)//Nuevo subarreglo del lado Derecho

    //Llena el subarreglo L con los elementos de la izquierda del arreglo A
    for(i <-0 to n1-1)
    {
      L(i) = A(p + i)
    }
    
    for(j<-0 to n2-1)
    {
      R(j) = A(q + j+1)
    }

    //Agrega un elemento muy grande al último de cada subarreglo
    L(L.length-1)=99999
    R(R.length-1)=99999

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

  def main(args: Array[String])
  {
    var A=Array(120,13,4,99,18,6,4,300,2)

    //Se imprime arreglo original
    println("Arreglo original: ")
    for(i <-0 to (A.length - 1))
    {
      print(A(i)+" ")
    }
    println()

    //Llamamos a la función con el arreglo A, p=0, r=tamaño del arreglo
    var B = new Array[Int](9)
    B = sort(A, 0, A.length-1)//Quitar el merge. para que jale

    println("Arreglo ordenado:")
    for(x <- B)
    {
      print(x+" ")
    }
    println()
  }

}//Llave de object MergeSort
