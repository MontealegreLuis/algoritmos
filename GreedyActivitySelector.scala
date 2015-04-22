/**
 * Created by Clarissa on 19/04/2015.
 */
object GreedyActivitySelector{
    var s=Array(1,3,0,5,3,5,6,8,8,2,12)
    var f=Array(4,5,6,7,9,9,10,11,12,14,16)
    var n=s.length-1
    var A="(" + s(0) + "," + f(0) + ")" + " "

    def GreedyActivitySelector(s:Array[Int],f:Array[Int]): String ={
        var k=0
        for (m <-1 to n){
            if(s(m) >= f(k)){
                A= A + "(" + s(m)+"," + f(m) + ")" + " "
                k=m
            }
        }
        return A
    }

    def main(args:Array[String]){
      print("Los conjuntos compatibles son:"+GreedyActivitySelector(s,f))
    }
}
