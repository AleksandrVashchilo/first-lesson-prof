public class Main {
    public static void main(String[] args) {

        Person person = new Person("Mark", 35, 170, 65);
        Person secondPerson = new Person();
        Money money = new Money();


       person.info();
       secondPerson.info();

       person.work();
       secondPerson.work();

      int m = money.getMoney();
        System.out.println(m);

    }


}