package com.absoft.javabasic.part3;

import com.absoft.javabasic.part3.bank.BankAccount;
import com.absoft.javabasic.part3.bank.BankNameResolver;
import com.absoft.javabasic.part3.bank.PrivatBankAccount;
import com.absoft.javabasic.part3.books.Book;
import com.absoft.javabasic.part3.cars.BigRedCar;
import com.absoft.javabasic.part3.cars.BmwX5Car;
import com.absoft.javabasic.part3.cars.Car;
import com.absoft.javabasic.part3.cars.TeslaCar;
import com.absoft.javabasic.part3.ducks.Duck;
import com.absoft.javabasic.part3.ducks.WildDuck;
import com.absoft.javabasic.part3.ducks.RubberDuck;
import com.absoft.javabasic.part3.mess.TrickyInheritanceClass;

public class Main {
    public static void main(String[] args) {
        showBooks(); // simple class

        showCars(); // abstract class

        showDucks(); // interface

        showDucksAgain(); // anonymous class, lambda, method ref

        showTrickyInheritance();

        showBankAccount(); // private/public/protected/final/static
    }

    public static void showBooks() {
        System.out.println("======<BOOKS>======");

        Book book1 = new Book("Nineteen Eighty-Four", "George Orwell");
        Book book2 = new Book("Fahrenheit 451", "Ray Bradbury");
        Book book3 = new Book();

        System.out.println(book1.getBookTitle());
        System.out.println(book2.getBookTitle());
        System.out.println(book3.getBookTitle());

        book1.setName("1984");
        System.out.println(book1.getBookTitle());


        System.out.println("=====</BOOKS>======\n");
    }

    private static void showCars() {
        System.out.println("======<CARS>======");

        Car car1 = new BigRedCar();
        Car car2 = new BmwX5Car();
        Car car3 = new TeslaCar();

        showCar(car1);
        showCar(car2);
        showCar(car3);
        System.out.println("=====</CARS>=====\n");
    }

    private static void showCar(Car car) {
        System.out.println("Got " + car.getCarType());
        System.out.println(car.say());
    }

    private static void showDucks() {
        System.out.println("======<DUCKS>======");

        Duck duck1 = new RubberDuck();
        Duck duck2 = new WildDuck();

        System.out.println("Duck1 say: " + duck1.say());
        System.out.println("Duck2 say: " + duck2.say());

        System.out.println("=====</DUCKS>======\n");
    }

    private static void showDucksAgain() {
        System.out.println("======<DUCKS AGAIN>======");

        showDuck(new WildDuck());
        showDuck(new RubberDuck());

        showDuck(new Duck() {
            @Override
            public String say() {
                return "hello from anonymous duck";
            }
        });

        showDuck(() -> "hello from lambda duck");
        showDuck(Main::helloFromMethodReferenceDuck);

        System.out.println("=====</DUCKS AGAIN>======\n");
    }

    public static String helloFromMethodReferenceDuck() {
        return "hello from method reference duck";
    }

    private static void showDuck(Duck duck) {
        System.out.println("This duck say: " + duck.say());
    }

    private static void showTrickyInheritance() {
        System.out.println("======<TRICKY INHERITANCE>======");

        var obj = new TrickyInheritanceClass("hello world");

        obj.methodFromInterface1(1.1);
        obj.secondMethodFromInterface2();
        obj.methodFromAbstractClass2();
        obj.callProtectedMethodsFromAbstractClass1();
        obj.methodFromAbstractClass2ThatYouCanNotExtend();

//        obj.defaultMethodFromAbstractClass1(); // error
//        obj.protectedMethodFromAbstractClass1(); // error
//        obj.protectedAbstractMethodFromAbstractClass1(); // error
//        obj.privateMethodFromAbstractClass1(); // error

        System.out.println("=====</TRICKY INHERITANCE>======\n");
    }

    private static void showBankAccount() {
        System.out.println("======<BANK ACCOUNT>======");

        BankAccount myBankAccount = new PrivatBankAccount("UAH");
//        System.out.println(myBankAccount.getBankName()); // error
        System.out.println(BankNameResolver.getBankNameOf(myBankAccount));

        System.out.println(myBankAccount);
        myBankAccount.receive(100500.01);
        System.out.println(myBankAccount);
        myBankAccount.withdraw(500.01);
        System.out.println(myBankAccount);


        System.out.println("=====</BANK ACCOUNT>======\n");

    }

}
