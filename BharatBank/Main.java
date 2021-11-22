package TreePractice;

public class Main {

    public static void main(String[] args) {
        BharatBank gopal=new BharatBank("Current Account",50000);
        BharatBank amrita=new BharatBank("Savings Account",100000);
        gopal.addAmount(10000);
        amrita.withdrawAmount(45000);
        //calculating interest
        double gopalInterest=gopal.calculateInterest();
        System.out.println("Gopal's interest: " + gopalInterest+"%");
        double amritaInterest=amrita.calculateInterest();
        System.out.println("Amrita's interest: " + amritaInterest+"%");
        gopal.withdrawAmount(70000);
        //final amount
        System.out.print("Gopal's Bank Balance is: ");
        gopal.printFinalAmount();
        System.out.print("Amrita's Bank Balance is: ");
        amrita.printFinalAmount();
    }
}
