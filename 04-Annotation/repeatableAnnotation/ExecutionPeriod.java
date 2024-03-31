package repeatableAnnotation;

public class ExecutionPeriod {
    @Schedule(dayOfMonth = "last")
    @Schedule(dayOfWeek = "Sunday", hour = 24)
    public void doPeriodicCleanup() {
        System.out.println("cleanup");
    }
}
