object FizzBuzz{

def main(args:Array[String]){
	
for(i<-1 to 30){

if(i%3==0 && i%5==0)	
print("FizzBuzz,")
else
if(i%3==0 && i%5!=0)
print("Fizz,")
else
if(i%5 == 0 && i%3 != 0)
print("Buzz,")
else
print(i+",")
}

}	
}