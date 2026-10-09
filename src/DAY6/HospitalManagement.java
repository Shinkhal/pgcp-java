package DAY6;

import java.util.Scanner;

class Patient{
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age){
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void calculateTreatmentCost(){
        System.out.println("Calculating treatment cost");
    }
}
class InPatient extends Patient{
    int numberOfDays;
    double roomCharge;
    InPatient(int patientId, String patientName, int age,int numberOfDays, double roomCharge){
        super(patientId, patientName, age);

        this.numberOfDays = numberOfDays;
        this.roomCharge = roomCharge;
    }

    @Override
    void calculateTreatmentCost(){
        double totalCost = roomCharge * numberOfDays;
        System.out.println("Total Treatment Cost: " + totalCost);
    }
}

class OutPatient extends Patient{
    double consultationFree;
    double medicineCost;
    OutPatient(int patientId, String patientName, int age, double consultationFree, double medicineCost){
        super(patientId, patientName, age);
        this.consultationFree = consultationFree;
        this.medicineCost = medicineCost;
    }
    @Override
    void calculateTreatmentCost(){
        double totalCost = consultationFree + medicineCost;
        System.out.println("Total Treatment Cost: " + totalCost);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id  = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        int numberOfDays = sc.nextInt();
        double roomCharge = sc.nextDouble();
        InPatient ip = new InPatient(id, name, age, numberOfDays, roomCharge);
        ip.calculateTreatmentCost();

        double consultationFee = sc.nextDouble();
        double medicineFee = sc.nextDouble();

        OutPatient op = new OutPatient(id, name, age, consultationFee, medicineFee);
        op.calculateTreatmentCost();

        sc.close();
    }
}
