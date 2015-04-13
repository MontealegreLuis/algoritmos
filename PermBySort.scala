import scala.util.Random

object PBS {

  def main(args: Array[String]){

    var A = Array(4,6,1,9,5,0,11,15,10,7)
    var P = Array.ofDim[Int](A.length)
    var r = new Random()

    for(i<-0 to A.length-1)
      P(i) = r.nextInt(A.length*A.length*A.length - 1) + 1

    print("Arreglo A: ");
    for(i<-0 to A.length-1)
      print(A(i)+" ");

    print("\n\nArreglo de prioridad: ");
    for(i<-0 to P.length-1)
      print(P(i)+" ");
      print("\n\nAplicando permutacion aleatoria...");

    ord(A,P);
    print("\n\nArreglo B: ");

    for(i<-0 to A.length-1)
      print(A(i)+" ");
  }

  def ord(A: Array[Int],P: Array[Int]){

    var total = P.length;

    for(i<-0 to total-2){
      var menor = i;
      for(j<-i+1 to total-1)
     {
        if(P(j) < P(menor))
          menor = j
      }

      if( i != menor){
        var aux = A(i)
        var cam = P(i)
        A(i) = A(menor)
        P(i) = P(menor)
        A(menor) = aux
        P(menor) = cam

      }

    }

  }

}
