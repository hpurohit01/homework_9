package marksheet_2;

import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name=scanner.nextLine();
        System.out.println("Enter Student Roll Number");
        String roll = scanner.nextLine();
        System.out.println("Enter maths Subject marks");
        int s1=scanner.nextInt();

        while (!(0<=s1&& s1<=100)){
            System.out.println("Enter marks between 1 to 100");
            System.out.println("Enter valid marks");
            s1=scanner.nextInt();
        }
        System.out.println("Enter Science Subject marks");
          int s2 =scanner.nextInt();
        while (!(0<=s2 && s2<=100)) {
            System.out.println("Enter marks between 1 to 100");
            System.out.println("Enter valid Marks");
            s2 =scanner.nextInt();
        }
        System.out.println("Enter English Subject marks");
          int s3 =scanner.nextInt();
        while (!(0<=s3 && s3<=100)) {
            System.out.println("Enter marks between 1 to 100");
            System.out.println("Enter valid marks");
            s3 =scanner.nextInt();
        }

        int total;
        float p ;
        total =s1+s2+s3;
        p = total /3;

        System.out.println("|----------------------------------------------|");
        System.out.println("|               MarkSheet                      |");
        System.out.println("|______________________________________________|");
        System.out.println("|      t name               "+name+"            |");
        System.out.println("|      t RollNumber          "+roll+"           |");
        System.out.println("|_______________________________________________|");
        System.out.println("|              Subject                          |");
        System.out.println("|_______________________________________________|");
        System.out.println("|     maths               "+s1+ "               |");
        System.out.println("|      science              "+s2+"               |");
        System.out.println("|       English              "+s3+"               |");
        System.out.println("|_________________________________________________|");
        System.out.println("|       t total                 "+total+"         |");
        System.out.println("|_________________________________________________|");
        System.out.println("|   t percentage                "+p+"              |");
        System.out.println("|__________________________________________________|");

        if(p>35 && s1>=35 && s2>=35 && s3>=35){
            System.out.println("Result Pass");
        }else
        {
        System.out.println("Result Fail");
        }
    }
}

