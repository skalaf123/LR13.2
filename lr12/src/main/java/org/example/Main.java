package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Имя1", "Фамилия1", 3, "Native", 1120.0);
        Tester tester2 = new Tester("Имя2", "Фамилия2", 5, "C");
        Tester tester3 = new Tester("Имя3", "Фамилия3", 1, "B", 2450.0);

        tester1.introduce();
        tester2.introduce("Компания2");
        tester3.introduce("Здравтсвуйте", "Компания1");
        Tester.iInfo(tester1);
        Tester.iInfo(tester2);
        Tester.iInfo(tester3);
    }
}