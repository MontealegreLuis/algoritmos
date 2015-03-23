//Daniel Elias Vazquez Lobato
//Implematacion del Algoritmo InsertionSort
//Analisis y Diseño de Algoritmos

object InsertionSort{

def main(args: Array[String]){

        var A = Array(5,11,3,9,5,2,4,28,1)

        println("Arreglo original: ")
            for(i<-0 to A.length-1)
                print(A(i)+" ")

	Insertiosort(A,true)

	 println("\nArreglo ordenado: ")
            for(i<-0 to A.length-1)
                print(A(i)+" ")

}

def Insertiosort(A: Array[Int], asc: Boolean){
var key = 0
var i = 0
for (j <- 1 to A.length - 1) {
	key = A(j)
	i = j - 1
	while (i >= 0 && comparar(A(i), key, asc)) {
		A(i + 1) = A(i)
		i = i - 1
	}
	A(i + 1) = key
}


}
def comparar(a: Int, b: Int, asc: Boolean): Boolean = {
	if (true == asc) {
	return a > b
}

return a <= b

}

}
