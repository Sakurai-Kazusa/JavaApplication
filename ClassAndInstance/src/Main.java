public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Yamada", 10);
        Person person2 = new Person("Suzuki", 20);
        Person person3 = new Person("Satou", 30);
        // インスタンス変数はnewをしなければ使えない
        System.out.println(person1.getAge());
        // クラス変数は、newをしなくとも使える
        System.out.println(Person.getNumber());
    }
}