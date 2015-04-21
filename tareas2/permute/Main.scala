package permute

object Main {

  def main(args: Array[String]){
    
    var A= Array(38, 27, 43, 100,3, 9, 82, 10)
    var per = new Permute_by_sorting()
    
    var p=per.permute(A)
    //var p3=Array[Int](perpermute(A))
    
   // per.sort(A,p)
   
     per.sort(A,p)
    
    println("Costos del arreglo")
    for (number <- p) {
     
      println(number)
  
    }
    
     println("arreglo ordenado")
    for (number <- A) {
     
      println(number)
  
    }
    
}
}