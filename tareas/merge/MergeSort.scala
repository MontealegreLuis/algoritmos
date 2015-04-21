package merge

class MergeSort {

    def sort(A: Array[Int], p: Int, r:Int):Unit={
      if(p < r){
        val q= ((p+r)/2)
        sort(A,p,q)
        sort(A,q+1,r)
        merge(A,p,q,r)
        
      }
    }
    
     def merge(A: Array[Int], p: Int, q:Int, r:Int):Unit=
     {
     
       var (i,j,k)=(0,0,0)
       val n1= (q-p)+1
       val n2= r-q
       var L= new Array[Int](n1+1)
       var R= new Array[Int](n2+1)
       
       for(i<- 1 to n1){
         L(i-1)=A((p + i)-1)
       }
      for(j<- 1 to n2){
         R(j-1)=A(q + j)
       }
      
       L(n1)= 90000
       R(n2)= 90000      
      
      
      i= 0 
      j= 0
      
      for(k<- p to r){
        if(L(i) <= R(j) ){
          A(k)=L(i)
          i=i+1
        }
        else{
          A(k)=R(j)
          j=j+1
        }
        
       
      }
      
      }
     
     
}