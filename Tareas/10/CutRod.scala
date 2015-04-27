//TAREA 10
//Rayen Ari Ramos Rocha
//201126031



object CutRod {

  var p = Array(1,2,3,6,9,12,15,20,21,25,29,30,31,33,50)
  
  def main(args: Array[String]){
    var tubos = 15
    println("El valor maximo obtenido es: "+CutRod(tubos))
  }
  
  def CutRod(n: Int): Int = {
    if(n==0)
       return 0
  
    var q = -100000
    for(i<-0 to n-1)
      q = maximo(q,p(i) +  CutRod(n-1-i))
    return q
  }
    def maximo(a: Int, b: Int): Int = {
    
    if( a >= b)
      return a
    else
      return b
    
  }
  
  
}
