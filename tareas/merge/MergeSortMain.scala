package merge

object MergeSortMain {

  def main(args: Array[String]){
    
    var A= Array(38, 27, 43, 100,3, 9, 82, 10)
    
    
    var merge = new MergeSort()
    
    
    merge.sort(A, 0, (A.length-1))
    
    for (number <- A) {
     
      println(number)
  
    }
    
}
}