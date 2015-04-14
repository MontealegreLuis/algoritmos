object SelectorActividadIterativo {

  var A: Array[Intervalo] = new Array[Intervalo](12)
    
    def main(args: Array[String]){
      llenaA()           
      var resultado = Greedy_Activity_Selector()
      println("El conjunto resultado es: ")
      resultado.foreach { x => println(x.returnIntervalo) }
    }
    
    def Greedy_Activity_Selector(): Array[Intervalo] = {
      
      val n = A.length - 1
      var res = Array(A(1))
      var k = 1
      for(m<-2 to n){
        if(A(m).getS() >= A(k).getF()){
          res = res ++ Array(A(m))
          k = m
        }
      }
      
      return res
    }
    
    def llenaA(){
      A(0) = new Intervalo(-1,-1,"a0")
      A(1) = new Intervalo(1,4,"a1")
      A(2) = new Intervalo(3,5,"a2")
      A(3) = new Intervalo(0,6,"a3")
      A(4) = new Intervalo(5,7,"a4")
      A(5) = new Intervalo(3,9,"a5")
      A(6) = new Intervalo(5,9,"a6")
      A(7) = new Intervalo(6,10,"a7")
      A(8) = new Intervalo(8,11,"a8")
      A(9) = new Intervalo(8,12,"a9")
      A(10) = new Intervalo(2,14,"a10")
      A(11) = new Intervalo(12,16,"a11")
    }
  
}