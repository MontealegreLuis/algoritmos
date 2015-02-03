object Seleccion 
{
  def main(args: Array[String])
  {
   
    var aux=0;
    var temp=0;
    var t=0;
    var A=Array(1,2,20,15,10);
    var j=0;
    var i=0;
     var min=0;
     
    for ( i<-0 to A.length-1)
    {
      min=i;
      for(j<-i+1 to A.length-1)
      {
        if(A(j)<A(min))
        {
          min=j;
        }
      }
      aux= A(i);
      A(i) = A(min);
      A(min) = aux;
    }
  }
  
}