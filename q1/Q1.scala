package sasi2

object Q1 {
  def main(args:Array [String])
  {
     print("enter your number:")
    var c=scala.io.StdIn.readInt()
    prime(c)
  }
  
  def prime(x:Int,y:Int=2):Any=x match{
    case 0 =>  printf("false")
    case 1 =>  printf("false")
    case 2 =>  printf("true")
    case x if y<x =>{
      
      if(x%y==0){
       printf("false")
      
     }
     else
     {
       prime(x,y+1)
     }
      
      
    }
    case _ =>  printf("true")
  }
}