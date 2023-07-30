public class Employee {
    private String fio;
    private String grade;
    private String email;
    private double phoneNumber;
    private double salary;
    private int age;

    public Employee(String fio, String grade, String email, double phoneNumber, double salary, int age) {
        this.fio = fio;
        this.grade = grade;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", grade='" + grade + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
