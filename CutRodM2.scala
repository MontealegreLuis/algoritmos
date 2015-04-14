object CutRodM2{
    def max(x:Int, y:Int):Int={
        if(x >= y) return x
        else return y
    }
    
    def BottomUpCutRod(P:Array[Int], n:Int) : Int = {
        var r = new Array[Int](P.length)
        var q = 0
        r(0) = 0
        for(i <- 1 to n){
            q = -99
            for(j <- 1 to i){
                q = max(q, P(j - 1) + r(i - j))
            }
            r(i) = q
        }
        return r(n)
    }
    
    def main(args:Array[String]){
        var P = Array(1,5,8,9,10,17,17,20,24,30)
        var n = 4
        println(BottomUpCutRod(P, n))

    }
}