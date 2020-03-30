package first;

public class Main {
    public static final String VACANCY_DEVELOPER = "Developer";

    public static void main(String[] args) {
        User tester = new User(7L, new Vacancy("Developer"));
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}
