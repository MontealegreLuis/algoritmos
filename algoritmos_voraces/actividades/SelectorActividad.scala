object SelectorActividad {
  
    var A: Array[Intervalo] = new Array[Intervalo](12)
    
    def main(args: Array[String]){
      llenaA()
      //A.foreach { x => println(x.returnIntervalo) }
            
      var resultado = Recursive_Activity_Selector(0,11)
      println("El conjunto resultado es: ")
      resultado.foreach { x => println(x.returnIntervalo) }
    }
    
    def Recursive_Activity_Selector(k: Int,n: Int): Array[Intervalo] = {
      var m = k+1
      var ban = true
      while(m<=n && ban)
      {
        if(A(m).getS()<A(k).getF())
          m = m+1        
        else
          ban = false
      }
      
      if (m <= n)
        return Array(A(m)) ++ Recursive_Activity_Selector(m,n)
      else
        return Array()
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