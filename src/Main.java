//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car();

//        System.out.println(myCar.color);
//        System.out.println(myCar.model);


        myCar1.drive();
        myCar1.brake();
        System.out.println("My car 2");
        myCar2.drive();
        myCar2.brake();


    }
}