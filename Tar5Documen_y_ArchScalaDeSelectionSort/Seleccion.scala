object Seleccion
{
  def SelectionSort(A:Array[Int], Tam:Int)
  {
    var indice = 0
    var aux = 0
    var menor = 0
    for(i <- 0 to (Tam - 1))
    {
      indice = i
      menor = A(i)
      for(j <- (i + 1) to (Tam - 1))
      {
        if(menor > A(j))
        {
          menor = A(j)
          indice = j
        }
      }
      if(indice != i)
      {
        aux = A(indice)
        A(indice) = A(i)
        A(i) = aux
      }
    }
  }

  def main(args:Array[String])
  {
    var A = Array(5, 10, 40, 0, 17, 32, 6, 34, 23, -12)
    println("Arreglo Original:")
    for(i <- A)
    {
      print(i + ", ") 
    }
    println()
    SelectionSort(A, A.length)
    println("El Arreglo Ordenado es:")
    for(i <- A)
    {
      print(i + ", ") 
    }
    println()
  }
}//Llave del object
