import functions.ReportGenerator;
import functions.WageCalculator;
import model.Worker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    WageCalculator wageCalculator = new WageCalculator();
    ReportGenerator reportGenerator = new ReportGenerator(wageCalculator);

    // create a list of 100 workers
    for(int i = 0; i < 100; i++) {
        Worker worker = new Worker(1000 + i, "John " + i, 1000, 100);
        reportGenerator.RegisterWorker(worker);
    }

    reportGenerator.PrintSalaryReport();

    System.out.println("Sum of Salaries: " + reportGenerator.GetSalaryReport().fullSum());
}
