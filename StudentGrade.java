import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of subject");
            int numberofSubject=sc.nextInt();
            int[]marks=new int[numberofSubject];
            int TotalMarks=0;
            for(int i=0;i<numberofSubject;i++){
                System.out.println("enter the marks obtained"+i+" ");
               int result=sc.nextInt();
                if(result<=100){
                    marks[i]=result;
                TotalMarks+=marks[i];          
                  }
                  
            else{
                System.out.println("enter the valid marks");
                i--;
            }

            }
            sc.close();
            float averagePercentage = (float) TotalMarks / numberofSubject;
        String grade;

        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else if (averagePercentage >= 50) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        System.out.println("\nTotal Marks: " + TotalMarks + "/" + (numberofSubject * 100));
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}