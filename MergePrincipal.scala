object MergePrincipal
{
 def main(args: Array[String])
 {
   var MS=new MergeSort();
   var A=Array(17,45,2,9,49,89,47,25,3,69);
   println("Arreglo:");
   for(i <- 0 to (A.length - 1))
   {
     print(" "+A(i));
   }
   println(" ");
   MS.Sort(A, 0, A.length-1);
   println("\nAplicando Merge Sort...");
   for(i <- 0 to (A.length - 1))
   {
     print(" "+A(i));
   }
 }
}
