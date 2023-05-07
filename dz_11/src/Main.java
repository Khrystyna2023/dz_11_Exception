public class Main {

    public static void main(String[] args){
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (Exception wrongAccountException) {
            System.out.println("Sorry. No such account exists.");
        }
        try {
            bankApplication.process( " ",250, "HRV");
        } catch (Exception wrongProcessingException_myException) {
            System.out.println("Sorry. A processing error occurred, please try again.");
        }
        try {
            bankApplication.process( "accountId001",50, "EUR");
        } catch (Exception wrongCurrencyException) {
            System.out.println("The account has other currency format.");
        }
        try {
            bankApplication.process( "accountId001",50, "USD");
        } catch (Exception wrongOperationException) {
            System.out.println("The account does not have enough funds.");
        }finally {
            System.out.println("Thank you for using our service!");
        }

    }
}
