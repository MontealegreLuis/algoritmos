object SeleSo{
def selectionSort(list: Array[Int]): Unit {
  def swap(list: Array[Int], i: Int, j: Int) {
    var tmp = list(i)
    list(i) = list(j)
    list(j) = tmp
  }
  
  var i = 0
  while(i < (list.length - 1)) {
    var min = i
    var j = i + 1
    
    while (j < list.length) {
      if(list(j) < list(min)) {
        min = j
      }
      j += 1
    }
    
    swap(list, i, min)
    i += 1
  }
}
 
 

def selectionSort2(list: List[Int]): List[Int] = {
  
  if(list.length == 1) list
  else {
    
  }
}
}