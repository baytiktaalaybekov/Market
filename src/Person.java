public class Person {
    private String name;
    private long id;
    private int age;
    private BankAccount bankAccount;

    public Person(String name, long id, String password, int age, BankAccount bankAccount) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
