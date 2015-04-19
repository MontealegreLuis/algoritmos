/**
 * Created by Clarissa on 19/04/2015.
 */
object RecursiveActivitySelector {
    var s=Array(0,1,3,0,5,3,5,6,8,8,2,12)
    var f=Array(0,4,5,6,7,9,9,10,11,12,14,16)
    var k=0
    var n=s.length-1
    var Conjunto=" "

    def RecursiveActivitySelector(s:Array[Int],f:Array[Int],k:Int,n:Int): String ={
        var m=k+1
        while(m <= n && s(m) < f(k))
            m=m+1
            if(m<=n){
                Conjunto =" (" + s(m) + "," + f(m) + ") " + RecursiveActivitySelector(s,f,m,n)
                return Conjunto
            }
            else
            return " "
    }

    def main(args:Array[String]){
         print("Los conjuntos compatibles son:" +RecursiveActivitySelector(s,f,k,n))
    }
}

