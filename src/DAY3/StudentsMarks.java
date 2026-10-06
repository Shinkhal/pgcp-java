package DAY3;

public class StudentsMarks {

    public static void main(String[] args) {
        String name = args[0];
        double marks1 = Double.parseDouble(args[1]);
        double  marks2 = Double.parseDouble(args[2]);
        double marks3 = Double.parseDouble(args[3]);

        double total = marks1+marks2+marks3;
        double avg = (marks1+marks2+marks3)/3;
        String res = "";
        if(marks1> 40 && marks2 > 40 && marks3 > 40){
            res = "PASS";
        }
        else{
            res = "FAIL";
        }

        System.out.println("Student Name : "+name);
        System.out.println("Marks 1: "+ marks1);
        System.out.println("Marks 2: "+ marks2);
        System.out.println("Marks 3: "+ marks3);
        System.out.println("Total Marks : "+total);
        System.out.println("Avg Marks : "+avg);
        System.out.println("Result : "+res);

    }
}
