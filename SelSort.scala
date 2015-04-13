
object SelSort {

  def main(args: Array[String]){
        var A = Array(8,4,1,10,9,2,11,13,0,15);

        print("Arreglo: ");
            for(i<-0 to A.length-1)
                print(A(i)+" ");

        var tam = A.length;

        for(i<-0 to tam-2){
          var menor = i;
            for(j<-i+1 to tam-1)
              {
              if(A(j) < A(menor))
                  menor = j;
              }

              if( i != menor){
                var aux = A(i);
                A(i) = A(menor);
                A(menor) = aux;
              }
            }
        print("\n");
        print("\nAplicando Selecion Sort... \n");
        print("\nArreglo ordenado: ");
            for(i<-0 to A.length-1)
                print(A(i)+" ");
  }
}
