public class Payroll {
    private String id;
    private double hoursWorked;
    private double hourlyRate;

    public Payroll(String id, double hoursWorked, double hourlyRate) {
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }

    public String getId() {
        return id;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void increaseHours(double additionalHours) {
        hoursWorked += additionalHours;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public static double totalPayout(Payroll payroll) {
        return payroll.calculateSalary();
    }
}
