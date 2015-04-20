package permute
import scala.util.Random
class Permute_by_sorting {
  
  def permute(A:Array[Int]):Array[Int]={
  
  var n= A.length
  var u=(n^3)
  var P= new Array[Int](n)
    
   for(i <- 0 to n-1)
   {
     P(i)=Random.nextInt(u);
     
   }
   return P
  }
   
  def sort(A: Array[Int],P: Array[Int]):Unit={    
    
     var aux=0
      var tem=0
      var t=0
      var f=0
      
      for(i <- 0 to (A.length-1)){
        tem=0
        t=P(i)
      
       for(j <- (i+1) to (A.length-1)){
        if(t > P(j)){
          f=1
          aux=j
          t=P(j)
          
        }
        }
        if(f==1){
          tem=A(i)
          A(i)=A(aux)
          A(aux)=tem
          f=0
          
        }
                         
      }
    
    
  }

}