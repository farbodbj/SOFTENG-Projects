package functions;

import model.SalaryReport;
import model.Worker;

import java.util.HashMap;

public class ReportGenerator {
    private final HashMap<Integer, Worker> workers = new HashMap<>();
    private final WageCalculator wageCalculator;

    public ReportGenerator(WageCalculator wageCalculator) {
        this.wageCalculator = wageCalculator;
    }

    void RegisterWorker(Worker worker) {
        if (workers.containsKey(worker.getIdnumber())) {
            throw new RuntimeException("Worker already exists");
        }
        workers.put(worker.getIdnumber(), worker);
    }
    void UnregisterWorker(Worker worker) {
        workers.remove(worker.getIdnumber());
    }


    SalaryReport GetSalaryReport() {
        float fullSum = 0;
        int baseSum = 0;
        for (int key : this.workers.keySet()) {
            Worker worker = this.workers.get(key);
            fullSum += this.wageCalculator.CalculateMonthlyWage(worker.getBaseSalary(), worker.getComplements());
            baseSum += worker.getBaseSalary();

        }

        return new SalaryReport(fullSum, baseSum, ((float) fullSum / this.workers.size()));
    }


    void PrintSalaryReport() {
        for (int key : this.workers.keySet()) {
            Worker worker = this.workers.get(key);

            System.out.print("\n----------\n");
            System.out.printf("worker %d:\nName: %s\nBase Salary: %d\nComplements: %d\nYearly Wage: %f", worker.getIdnumber(), worker.getName(), worker.getBaseSalary(), worker.getComplements(), wageCalculator.CalculateYearlyWage(worker.getBaseSalary(), worker.getComplements()));
            System.out.print("\n----------\n");

        }
    }
}
