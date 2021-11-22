package TreePractice;

public class BharatBank {
     private final String accountType;
     private double bankBalance;
     private final float interestForCurrent=0;
     private final float interestForSavings=3;
     BharatBank(String accountType,double bankBalance){
         this.accountType=accountType;
         this.bankBalance=bankBalance;
     }
     public void addAmount(double amount){
         this.bankBalance+=amount;
     }
    public void withdrawAmount(double amount){
         if(this.bankBalance>=amount){
             this.bankBalance-=amount;
         }
         else{
             double additionalAmount=this.bankBalance+(this.bankBalance/5);
             if(accountType.equals("Current Account") && this.bankBalance+additionalAmount>=amount){
                 this.bankBalance=-(amount-this.bankBalance);
             }
             else{
                 System.out.println("Insufficient Balance");
             }
         }
    }
     public double calculateInterest(){
         double interest=0.0;
         if(this.accountType.equals("Savings Account")) {
             interest=(this.bankBalance*interestForSavings)/400;
         }
         else if(this.accountType.equals("Current Account")){
             interest=(this.bankBalance*interestForCurrent)/400;
         }
         return interest;
     }
     public void printFinalAmount(){
         System.out.println(this.bankBalance);
     }
}
