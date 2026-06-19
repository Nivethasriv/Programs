public class SalaryCalculator{
    public static double calculateGrossSalary(double baseSalary, double allowances, double bonuses, double overtimePay) {
        return baseSalary + allowances + bonuses + overtimePay;
    }
    public static double calculateDeductions(double grossSalary, double taxRate, double pfRate) {
        double taxDeductions = grossSalary * taxRate;
        double pfDeductions = grossSalary * pfRate;
        return taxDeductions + pfDeductions;
    }
    public static double calculateNetSalary(double grossSalary, double totalDeductions) {
        return grossSalary - totalDeductions;
    }

    public static void main(String[] args) {
        double baseSalary = 50000.0;
        double allowances = 15000.0;
        double bonuses = 5000.0;
        double overtimePay = 2000.0;
        double taxRate = 0.20; // 20% tax
        double pfRate = 0.12;  // 12% PF

        double grossSalary = SalaryCalculator.calculateGrossSalary(baseSalary, allowances, bonuses, overtimePay);
        double totalDeductions = SalaryCalculator.calculateDeductions(grossSalary, taxRate, pfRate);
        double netSalary =SalaryCalculator.calculateNetSalary(grossSalary, totalDeductions);

        System.out.printf("Gross Salary: $%.2f%n", grossSalary);
        System.out.printf("Total Deductions: $%.2f%n", totalDeductions);
        System.out.printf("Net Take-Home Salary: $%.2f%n", netSalary);
    }
}
