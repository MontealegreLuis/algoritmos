class MergeSort
{
 def Merge(A: Array[Int],p: Int,q: Int,r: Int) =
 {
   var n1:Int=q-p+1;
   var n2:Int=r-q;
   var L = new Array[Int](n1+1);
   var R = new Array[Int](n2+1);
   for (i<-0 to n1-1)
   {
    L(i)=A(p+i);
   }
    for (j<-0 to n2-1)
    {
      R(j) = A(q+j+1);
    }
    L(n1)=99999999;
    R(n2)=99999999;
    var i=0;
    var j=0;
    for (k <- p to r)
    {
      if(L(i)<=R(j))
      {
        A(k)=L(i);
        i=i+1;
      }
      else
      {
        A(k)=R(j);
        j=j+1;
      }
    }
 }
 def Sort(A: Array[Int],p:Int,r:Int)
 {
   if(p<r)
   {
     var q=((p+r)/2);
     Sort(A,p,q);
     Sort(A,q+1,r);
     Merge(A,p,q,r);
   }
 }
}
