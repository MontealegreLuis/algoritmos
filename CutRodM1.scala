object CutRodM1{
    def max(x:Int, y:Int):Int={
        if(x >= y) return x
        else return y
    }
    
    def Memoized_Cut_Rod_Aux(P:Array[Int], n:Int, r:Array[Int]):Int={
        var q = 0
        if(r(n) >= 0){
            return r(n)
        }
        else if(n == 0){
            return 0 
        }else{
            q = (-99)
            for(i <- 1 to n)
               q = max(q, P(i - 1) + Memoized_Cut_Rod_Aux(P, n - i, r))
        }
        r(n) = q  
        return q     
    }
    
    def MemoizedCutRod(P:Array[Int], n:Int): Int = {
        var r = new Array[Int](P.length)
        for(i <- 0 to P.length - 1)
            r(i) = -99
            
        return Memoized_Cut_Rod_Aux(P, n, r)
    }
    
    def main(args:Array[String]){
        var P = Array(1,5,8,9,10,17,17,20,24,30)
        var n = 4
        println(MemoizedCutRod(P, n))

    }
}