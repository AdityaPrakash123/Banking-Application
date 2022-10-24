public class Main {
    public static void main(String[] args) {
        CheckingAccount c1= new CheckingAccount("Max", 250, 10);


        Check ch1= new Check(1, "Wells Fargo", 25);
        c1.processCheck(ch1);
        c1.withdraw(5550);
        System.out.println(c1);



        SavingsAccount s1= new SavingsAccount("Mike", 1000,7);

        s1.deposit(2000);
        s1.depositMonthlyInterest();
        System.out.println(s1);
    }
}
