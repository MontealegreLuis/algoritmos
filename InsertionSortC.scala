object InsertionSort 
{

  def main(args:Array[String])
  {
    var A=Array(4,32,312,52,743,423,7)
    var x=0
    var j=0
    
    for(i <-0 to A.length-1)
    {
      x=A(i); //Key
      j=i;
      while(j>0 && A(j-1)>x)
      {
        A(j)=A(j-1);
        j=j-1;
      }
      A(j)=x;
      println("X: "+x+" j: "+j+" A(j): "+A(j));
    }
    //Imprimimos el vector
    println("\nResultado");
    for(i<-0 to A.length-1)
    {
      print(A(i)+" ")
    }
  }
}
