class Insercion {
  
def Ordena(myList: Array[Int]) {
      
    
    var aux=0
    var j=0

     
    
    for(i<-0 to myList.length-1)
    {
      aux=myList(i)
      j=i
      while(j>0 && myList(j-1) > aux)
      {
        myList(j)=myList(j-1)
        j=j-1
        
      }
      myList(j)=aux
    }
  }
}