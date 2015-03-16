object Cut_Rod {

  var p = Array(1,5,8,9,10,17,17,20,24,30)
  
  def main(args: Array[String]){
    var tubos = 10
    println("Maxima ganancia de cortar: "+tubos+" tubos");
    println("Ganancia: "+Cut_Rod(tubos))
  }
  
  def Cut_Rod(n: Int): Int = {
    if(n==0)
      return 0
  
    var q = -999999
    for(i<-0 to n-1)
      q = max(q,p(i) +  Cut_Rod(n-1-i))
    return q
  }
  
  def max(a: Int, b: Int): Int = {
    
    if( a <= b)
      return b
    else
      return a
    
  }
}