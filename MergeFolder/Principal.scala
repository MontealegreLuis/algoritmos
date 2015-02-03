object Principal 
{
  def main(args: Array[String])
  {
     var instanceMerge=new MergeClass();
     //Desordenado
     var A=Array(10,123,321,11,0,-1,32,-321,1,2,32,4,4);
     println("Desordenado");
     for(i <- 0 to (A.length - 1))
     {
      print(A(i)+"\t");
     }
     instanceMerge.Sort(A, 0, A.length-1);
     //Ordenado
     println("\nOrdenado");
     for(i <- 0 to (A.length - 1))
     {
      print(A(i)+"\t");
     }
  }
}