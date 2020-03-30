package first;

public class User {
    private long id;
    private Vacancy vacancy;

    public User(long id, Vacancy vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    public String getVacancy() {
        return vacancy.getVacancy();
    }
    public long getId() {
        return id;
    }
}