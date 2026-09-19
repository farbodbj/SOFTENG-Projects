# Short Exercise: Salaries of a Company

The `Worker` class at [this file](src/model/Worker.java) extends the `Person` class and 
holds attributes related to the worker including name, id, base salary and complements. This
class is NOT responsible for handling tasks such as report generation, summing up salaries, calculating fees and 
other reports, this task is delegated to another class named [`Report Generator`](src/functions/ReportGenerator.java) which 
handles generating reports and most calculations regarding salary, and wage. 

The design is completely read to accept addition of financial calculations such as fee, tax etc.
and such calculations should be added to the `WageCalculator` class at [this file](src/functions/WageCalculator.java) which currently
does not reduce any fees or taxes but can do in the future. 

The number of workers in our current implementation has no effect on how the code
is written, as they are stored in a single `ArrayList` object which does not care about the 
count of objects it stores. 

## **This project is shared [on my github](https://github.com/farbodbj/SOFTENG-Projects)**