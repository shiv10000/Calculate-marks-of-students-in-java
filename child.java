import java.util.Scanner;
 class Marks {
    String Name;
     Scanner scanmarks=new Scanner(System.in);

    int Maths;
    int numcheck(int num){while (num>100)
    {System.out.println("Alert! you are typing a number greater than 100 pls renter it");
        num=scanmarks.nextInt();
        return num;
    }
    return num;


    }

   void setMaths(int maths){
        Maths=numcheck(maths);
    System.out.println("Maths done");}
    int Chemistry;
    void setChemsitry(int chemsitry){
        Chemistry=numcheck(chemsitry);
        System.out.println("chemistry done");
    }
    int English;
     void setEnglish(int english){
         English=numcheck(english);
         System.out.println("english done");
     }
    int Physics;
     void setPhysics(int physics){
         Physics=numcheck(physics);
         System.out.println("Physics done");
     }
    int Computer;
     void setComputer(int computer){
         Computer=numcheck(computer);
         System.out.println("Computer Done done");
     }
    void markspercentage(){
        double total=Maths+Chemistry+English+Physics+Computer;
        total=total/500*100;//if either operand is double the other is converted in double
        System.out.println(Name+""+"has scored "+""+total+"%"+""+"in final exams");

    }
}
class child{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Marks childmarks=new Marks();
        System.out.println("please enter name of a child ");
        childmarks.Name=scan.nextLine();
        System.out.println("please enter Maths marks ");
        childmarks.setMaths(scan.nextInt());
        System.out.println("please enter Chemistry marks ");
        childmarks.setChemsitry(scan.nextInt());
        System.out.println("please enter Englsih marks ");
        childmarks.setEnglish(scan.nextInt());
        System.out.println("please enter Physics marks ");
        childmarks.setPhysics(scan.nextInt());
        System.out.println("please enter Computer marks ");
        childmarks.setComputer(scan.nextInt());
        childmarks.markspercentage();









    }
}
