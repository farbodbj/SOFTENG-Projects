package functions;

public class WageCalculator {
    float CalculateMonthlyWage(int baseSalary, int complements) {
        return baseSalary + complements;
    }
    float CalculateYearlyWage(int baseSalary, int complements) {
        //reduce taxes later
        return (baseSalary + complements) * 12;
    }
}
