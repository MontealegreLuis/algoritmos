
import scala.util.Random
object RandomizeInPlace {

  def main(args: Array[String]){
  
    var A= Array(18, 7, 20, 15,90,54,8,76)
    
  var n = A.length
    var p = new Array[Int](n)
  
  var aux=new Array[Int](n)
  var r=new Random  
  
  
  for( i<-0 to n-1){
    
    aux(i) = A(i)
    p(i)=r.nextInt(n)
    
    A(i)=A(p(i))
    A(p(i))=aux(i)
    
    
  } 
    for (number <- A) {     
      println(number)  
    }
  
}
}