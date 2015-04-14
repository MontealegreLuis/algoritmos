/**
 * Created by Clarissa on 12/04/2015.
 */
object RandomizeInPlace{
   def RandomizeinPlace(A:Array[Int]){
      var azar = new scala.util.Random
      var aux = 0
      var indice = 0
      for(i <- 0 to A.length - 1){
          aux = A(i)
          indice = azar.nextInt(A.length - 1)
          A(i) = A(indice)
          A(indice) = aux
      }
   }

   def main(args:Array[String]){
       var A = Array(10, 250, 35, 67, 90, 609, 56, 88, 900, 110)
       println("El arreglo normal es:\n")
       var indice = 0
       for(i <- A) {
         indice += 1
         print(indice + "->")
         print(i + "  ")
       }
       println("\n")

       RandomizeinPlace(A)
       println("El arreglo con sus nuevos indices es:\n")
       var indice1 = 0
       for(i <- A){
         indice1 += 1
         print(indice1 + "->")
         print(i + "  ")
       }
       println("\n")
   }
}