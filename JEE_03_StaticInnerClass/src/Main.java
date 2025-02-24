//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //Employee emp = new Employee();
        Employee.bankDetails bankDetails = new Employee.bankDetails();
        bankDetails.setBankName("HDFC");
        bankDetails.setBankAccount(123456789);
        System.out.println(bankDetails.bankDetailsoFEmp(bankDetails.getBankName(), bankDetails.getBankAccount()));

    }
}