public class Flowchart1 {
    static void voting (int age) {
        if(age>=18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible");
        }
    }
    static void loan (int age, int salary){
        if(age>=21){
            if (salary >= 20000){
                System.out.println("Loan Approved");
            } else {
                System.out.println("Salary Low");
            }
        } else {
            System.out.println("Under Age");
        }
    }

    static void traffic(String signal){
        signal = signal.trim();

        if(signal=="red"){
            System.out.println("STOP");
        } else if (signal=="yellow") {
            System.out.println("Wait");
        } else {
            System.out.println("Go");
        }
    }
    public static void main(String[] args) {
        int age = 19;
        int salary = 30000;
        String signal = "red";

        voting(age);
        loan(age, salary);
        traffic(signal);
    }
}