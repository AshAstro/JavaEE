//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        //if i mark a class as static it holds single memory for single object.
        Employee  employee = new Employee();
        //employee.setName("Ash");
        System.out.println("Employee Name: " + employee.getName());
        employee.setName("Avinash");
        System.out.println("Employee Name: " + employee.getName());
        Employee employee2 = new Employee();
        System.out.println("Employee Name: " + employee2.getName());
        employee2.setName("Astro");
        System.out.println("Employee Name: " + employee2.getName());
    }
}