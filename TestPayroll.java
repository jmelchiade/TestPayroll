
import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;

class TestPayroll {
    public static void main(String[] arg) {
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("\nPayroll For Week Ending " + df.format(d));
        System.out.println("-------------------------------------");

        Payroll employee1 = new Payroll("444-4445", 30, 25);
        employee1.calculateSalary();
        displaySalary(employee1, nf);

        Payroll employee2 = new Payroll("555-5556", 20, 50);
        employee2.calculateSalary();
        displaySalary(employee2, nf);

        System.out.println("\tIncrease " + employee1.getId() + " by 10 hours");
        employee1.increaseHours(10);
        displaySalary(employee1, nf);

        double totalPayout = Payroll.totalPayout(employee1) + Payroll.totalPayout(employee2);
        System.out.println("Total payout amount.. " + nf.format(totalPayout));
        System.out.println("------------ End of report ----------");
    }

    public static void displaySalary(Payroll e, NumberFormat nf) {
        System.out.println("\tEmployee # ...... " + e.getId());
        System.out.println("\tHours worked.... " + e.getHoursWorked() + " hours");
        System.out.println("\tHourly rate..... $" + e.getHourlyRate() + "/hour");
        System.out.println("\tYour salary is.. " + nf.format(e.calculateSalary()));
        System.out.println("\t---------------------------------\n");
    }
}
