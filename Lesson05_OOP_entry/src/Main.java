public class Main {

    public static void main(String[] args) {
        doTask3();
    }

    //Создать массив из 5 сотрудников.
    private static void doTask3(){
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan Ivanovich", "Director", "ivan@acme.me", 79165427645d, 450000, 52);
        empArray[1] = new Employee("Ivanov Ivan Ivanovich", "CEO", "ivan@acme.me", 79105173243d, 450000, 21);
        empArray[2] = new Employee("Ivanov Ivan Ivanovich", "CFO", "ivan@acme.me", 79105173243d, 450000, 36);
        empArray[3] = new Employee("Ivanov Ivan Ivanovich", "Manager", "ivan@acme.me", 79105173243d, 450000, 45);
        empArray[4] = new Employee("Ivanov Ivan Ivanovich", "Support", "ivan@acme.me", 79105173243d, 450000, 27);
        doTask5(empArray);
     }

     //С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     private static void doTask5(Employee[] empArray){
         for (Employee emp:empArray) {
             if (emp.getAge()>=40) {
                 System.out.println(emp);
             }
         }
     }
}