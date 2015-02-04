object Selection {
  
  def main(args: Array[String]){
    
    val array=Array(9, 7, 1, 6, 5, 2, 8, 3, 0, 4)
    var  Sort= new Select()
    
    println("Array original:")
    for ( x <- array ) {
         println( x )
      }

    Sort.Ordena(array)
    
    
    println("Array ordenado:")
    for ( x <- array ) {
         println( x )
      }
    
  }

}