package selection_sort

object selection {
  
  def main(args: Array[String]){
    var A = Array(9,3,6,4,1,7,10,8,2)
    
    println("Este es tu arreglo original: ")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
      
    select(A);
    println("\nEste es tu arreglo ordenado: ")
    for(i<-0 to A.length-1)
      print(A(i)+" ")
  }
  
  def select(A: Array[Int]){
    var total = A.length;
    
    for(i<-0 to total-2){
      var menor = i;
      for(j<-i+1 to total-1)
      {
        if(A(j) < A(menor))
          menor = j
      }
      
      if( i != menor){
        var aux = A(i)
        A(i) = A(menor)
        A(menor) = aux
      }
    }
  }

}