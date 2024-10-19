package assn2;

public class FooCorporation {

    public static void calculatePay(Employee employee) {
        System.out.printf("[Employee %d] ", employee.id);
        if (employee.basePay <= 8.00) {
            System.err.println("Error: base pay is lower than $8.00/hour!");
            return;
        }

        if (employee.hoursWorked > 60) {
            System.err.println("Error: working hours more than 60!");
            return;
        }

        double totalPay = 0.0;
        if (employee.hoursWorked <= 40) {
            totalPay = employee.hoursWorked * employee.basePay;
        } else {
            totalPay = 40 * employee.basePay + (employee.hoursWorked - 40) * employee.basePay * 1.5;
        }
        System.out.printf("Totoal Pay: $%f\n", totalPay);
    }

    public static void main(String[] args) {
        calculatePay(new Employee(1, 7.50, 35));
        calculatePay(new Employee(2, 8.20, 47));
        calculatePay(new Employee(3, 10.00, 73));
    }

}
