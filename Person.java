public class Person {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String name,String position,String email,String phone,int salary,int age) {
    this.name=name;
    this.position=position;
    this.email=email;
    this.phone=phone;
    this.salary=salary;
    this.age=age;
    }
    public static void consolePrint(String name,String position,String email,String phone,int salary,int age){
        System.out.println("Имя "+name);
        System.out.println("Должность "+position);
        System.out.println("Емайл "+email);
        System.out.println("Телефон "+phone);
        System.out.println("Зарплата "+ salary);
        System.out.println("Возраст " +age);
        System.out.println();
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Olegov Oleg", "Vahtman", "ololeg@mailbox.com", "895478541", 25000, 45);
        persArray[2] = new Person("Smirov Smir", "Director", "direct@mailbox.com", "898475142", 55000, 34);
        persArray[3] = new Person("Vasin Vasya", "Vassman", "vasvas@mailbox.com", "894574521", 15000, 43);
        persArray[4] = new Person("Ilin Ilya", "Shturman", "shturman@mailbox.com", "895414745", 45000, 42);

        for (int i = 0; i <persArray.length ; i++) {
            Person pers = persArray[i];
            if (pers.age>40)consolePrint(pers.name,pers.position,pers.email,pers.phone,pers.salary,pers.age);
        }

    }
}