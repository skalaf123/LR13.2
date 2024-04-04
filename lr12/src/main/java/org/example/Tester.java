package org.example;

public class Tester {
    private String name;
    private String surname;
    private int staj;
    private String engLvl;
    private double sal;

    public Tester(String name, String surname, int staj, String engLvl, double sal) {
        this.name = name;
        this.surname = surname;
        this.staj = staj;
        this.engLvl = engLvl;
        this.sal = sal;
    }

    public Tester(String name, String surname, int staj, String engLvl) {
        this(name, surname, staj, engLvl, 1600.0);
    }

    public void introduce() {
        System.out.println("Я - " + name + " " + surname);
        System.out.println();
    }

    public void introduce(String companyName) {
        System.out.println("Сейчас работаю в " + companyName + ", а моё имя - " + name + " " + surname);
        System.out.println();
    }

    public void introduce(String greeting, String companyName) {
        System.out.println(greeting + ", работаю в  " + companyName + " , меня зовут " + name + " " + surname);
        System.out.println();
    }


    public static void iInfo(Tester tester) {
        System.out.println("Имя: " + tester.name);
        System.out.println("Фамилия: " + tester.surname);
        System.out.println("Стаж работы: " + tester.staj);
        System.out.println("Уровень знания английского: " + tester.engLvl);
        System.out.println("Зарплата: " + tester.sal);
        System.out.println();
    }
}
