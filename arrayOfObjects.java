class Student{
   int roll;
   String name;
}

class ArrayOfObjects{
  public static void main(String []args){
    Student s1 = new Student();
    Student s2 = new Student();
    // Student s3 = new Student();

    s1.roll = 1;
    s2.roll = 2;
    // s3.roll = 3;
    s1.name = "Manishankar";
    s2.name = "Dishankar";

    Student studs[] = new Student[2];
    studs[0]=s1;
    studs[1]=s2;
    for(int i=0;i<studs.length;i++){
      System.out.print(studs[i].name +" : "+studs[i].roll);
      System.out.println();
    }

    
  }
}