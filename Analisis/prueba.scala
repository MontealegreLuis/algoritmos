object CutRodMemoized
{

    var P = Array(1,5,8,9,10,17,17,20,24,30)

    var r = new Array[Int](P.length)

    var s = new Array[Int](P.length)

    

    def max(x:Int, y:Int):Int={

        if(x >= y) return x

        else return y

    }

    

    def BottomUpCutRod(n:Int) : Int = {

        var q = 0

        r(0) = 0

        for(i <- 1 to n){

            q = -99

            for(j <- 1 to i){

                if(q < P(j - 1) + r(i - j)){

                    q = max(q, P(j - 1) + r(i - j))

                    s(i) = j

                }

            }

            r(i) = q

        }

        return r(n)

    }

    

    def PrintCutRodSolution(n:Int){

      var n2 = n

        println("Para Obtener " + BottomUpCutRod(n) + " de un tubo de tamaño " + n + " se debe de cortar en pedazos de: ")

        while(n2 > 0){

            print(s(n2) + ", ")

            n2 = n2 - s(n2)

        }

        print("\n")

    }

    def main(args:Array[String]){

        var n = 4

        PrintCutRodSolution(n)

    }

}