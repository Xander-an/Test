import java.util.Scanner;
public class StudentServiceApp {
    public static void main(String[] args) {
        final double MIN_ATTENDANCE = 75.0;
        String name= "";
        int rollNumber =0;
        double attendancePercentage=0.0;
        boolean feePaidStatus=false;
        double totalMarks=0.0;
        double averageMarks=0.0;
        Scanner sca=new Scanner(System.in);
        int choice;
        do{
            System.out.println("==== STUDENT SERVICE MENU ====\n" +
                    "1. Enter student basic information\n" +
                    "2. Calculate total & average marks\n" +
                    "3. Check exam eligibility\n" +
                    "4. Print number list\n" +
                    "5. Exit Program\n" +
                    "Please input your menu choice:");
            choice=sca.nextInt();
            sca.nextLine();
            switch (choice){
                case 1:
                    System.out.println("------Enter student basic information------");
                    System.out.println("Please enter name:");
                    name=sca.nextLine();
                    System.out.println("Please enter roll number:");
                    rollNumber =sca.nextInt();
                    System.out.println("Please enter attendance percentage:");
                    attendancePercentage=sca.nextDouble();
                    System.out.println("Please enter fee paid status:");
                    feePaidStatus=sca.nextBoolean();
                    System.out.println("||||||student information||||||");
                    System.out.println("name:"+name);
                    System.out.println("roll number:"+rollNumber);
                    System.out.println("attendance percentage:"+attendancePercentage);
                    System.out.println("fee paid status:"+feePaidStatus);
                    System.out.println("|||||||||||||||||||||||||||||||");
                    break;
                case 2:
                    System.out.println("------Calculate total & average marks------");
                    System.out.println("Please enter the number of subjects:");
                    int number;
                    number=sca.nextInt();
                    while(number<=0){
                        System.out.println("Invalid number,please re-enter");
                        number=sca.nextInt();
                    }
                    double[] marks=new double[number];
                    totalMarks=0.0;
                    for(int i=0;i<number;i++){
                        System.out.println("Please enter the mark of "+(i+1)+":");
                        marks[i]=sca.nextDouble();
                        totalMarks+=marks[i];
                    }
                    Double doubleMark=marks[number-1];
                    averageMarks=totalMarks/number;
                    System.out.println("average marks:"+(int)averageMarks);
                    System.out.println("total marks:"+totalMarks);
                    System.out.println("|||||||||||||||||||||||||||||||");
                    break;
                case 3:
                    System.out.println("------Check exam eligibility------");
                    if(averageMarks>=50&&attendancePercentage>=MIN_ATTENDANCE&& feePaidStatus){
                        System.out.println("Student is eligible for exam.");
                        System.out.println("|||||||||||||||||||||||||||||||");
                    }
                    else{
                        System.out.println("Student is NOT eligible for exam.");
                        System.out.println("|||||||||||||||||||||||||||||||");
                    }
                    break;
                case 4:
                    System.out.println("------Print number list------");
                    System.out.println("Please enter n:");
                    int n=sca.nextInt();
                    for(int i=1;i<=n;i++){
                        System.out.print(i+" ");
                    }
                    System.out.println("\n|||||||||||||||||||||||||||||||");
                    break;
                case 5:
                    System.out.println("------Exit Program------");
                    System.out.println("Program terminated,Goodbye!!!!");
                    break;
                default:
                    System.out.println("------Invalid input,please re-enter------");
                    break;
            }
        }while(choice!=5);
    }
}
