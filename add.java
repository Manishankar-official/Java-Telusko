

class Add{
int result;
public int add(int n1,int n2){
  result = n1+n2;
  return result;
}

}


class Main{
public static void main(String [] args){
   int num1=10;
   int num2=11;

   Add res = new Add();

   int result = res.add(num1,num2);

   System.out.println("The result is : "+result);

  }
}