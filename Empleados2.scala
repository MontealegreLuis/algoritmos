object Empleados2{
    def RIP(A:Array[Int]){
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
        var NumContr = 1 // Numero de contrataciones
        var A = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        RIP(A)
        var EmpleadoAdecuado = A(0)
        for(i <- 1 to A.length - 1){
            if(A(i) > EmpleadoAdecuado){
                NumContr += 1
                EmpleadoAdecuado = A(i)
            }
        }
        println("Se ha hecho " + NumContr + " contratacion(es)\n")
        println("El empledo mas adecuado es: " + EmpleadoAdecuado)
    }
}