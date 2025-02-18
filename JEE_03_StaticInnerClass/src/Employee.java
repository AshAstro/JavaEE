public class Employee {

    public static class bankDetails {
        public String bankName;
        public int bankAccount;

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public int getBankAccount() {
            return bankAccount;
        }

        public void setBankAccount(int bankAccount) {
            this.bankAccount = bankAccount;
        }

        public boolean bankDetailsoFEmp(String bankName, int bankAccount) {
            System.out.println("Welcome to "+bankName+" with "+bankAccount);
            return false;
        }
    }

    public static class loanDetails {
        public static String loanName;
        public static int loanAmount;

        public static String getLoanName() {
            return loanName;
        }

        public static void setLoanName(String loanName) {
            loanDetails.loanName = loanName;
        }

        public static int getLoanAmount() {
            return loanAmount;
        }

        public static void setLoanAmount(int loanAmount) {
            loanDetails.loanAmount = loanAmount;
        }

        public loanDetails(String loanName, int loanAmount) {
            System.out.println("Welcome to "+loanName+" with "+loanAmount);
        }
    }
}
