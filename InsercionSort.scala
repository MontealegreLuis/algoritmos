object InsercionSort {
  
  def main(args: Array[String]){
    
    val myList = Array(9, 7, 1, 6, 5, 2, 8, 3, 0, 4)
    var  Sort= new Insercion()
    
    println("Array original:")
    for ( x <- myList ) {
         println( x )
      }

    Sort.Ordena(myList)
    
    
    println("Array ordenado:")
    for ( x <- myList ) {
         println( x )
      }
    
  }

}