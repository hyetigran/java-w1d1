package employeeApp;

public class Main {
    private static void workWithData() {
        HealthPlan h1 = new HealthPlan("Lambda Health");
        HealthPlan h2 = new HealthPlan("Lambda Health 2");
        Company c1 = new Company("Firm 1", 100);
        Company c2 = new Company("Firm 2", 100);

        Employee emp1 = new Employee("joe", "black", 10, true, c1.id, h1.getId());
        Employee emp2 = new Employee("jack", "white", 10, true, c1.id, h2.getId());
        Employee emp3 = new Employee("tim", "smith", 10, true, c1.id, h2.getId());
        Employee emp4 = new Employee("bob", "ryan", 10, true, c1.id, h2.getId());
        Employee emp5 = new Employee("will", "jones", 10, true, c1.id, h2.getId());

        System.out.println("*** Query Data");
        System.out.println(c1);
        System.out.println(c1.toString());
        System.out.println();
        System.out.println("Original: " + c1.debt);

        System.out.println("divide 5 " + (c1.debt / 5));
        System.out.println("mod 2 " + (c1.debt % 2));
        int theAns = c1.debt / 7;
        System.out.println("divide 7 " + theAns);
        double theAns2 = c1.debt / 7.0;
        System.out.println("divide 7 double " + theAns2);

    }

    public static void main(String[] args) {
        workWithData();
    }
}