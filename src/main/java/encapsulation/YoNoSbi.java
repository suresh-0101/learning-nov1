package encapsulation;

public class YoNoSbi {
    public static void main(String[] args) throws Exception {

       BankAccount account = new BankAccount();
       try {
           Double balance = account.getAccountBalance(123456789l, 1234);
           System.out.println("Your Savings balance for the account : " +balance );
       }catch (Exception e){
           System.out.println(e.toString());
           throw e;
       }
    }
}
