// import java.util.*;

public class OPPS {
    public static void main(String[] args) {

        // Classes & Objects
        // Pen p1 = new Pen(); // Created a pen object called p1
        // p1.setColor("red");
        // p1.setTip(5);
        // System.out.println("Color of Pen p1 : " + p1.color);
        // System.out.println("Tip of Pen p1 : " + p1.tip);
        // p1.setColor("blue");
        // System.out.println("Color of Pen p1 : " + p1.color);
        // p1.color = "yellow";
        // System.out.println("Color of Pen p1 : " + p1.color);

        // Access Modifiers
        // BankAccount myAccount = new BankAccount();
        // myAccount.userName = "Sajalduttbansal";
        // // myAccount.password = "abcd";
        // myAccount.setPassword("abcdefghi");

        // Getters & Setters
        // Pen p2 = new Pen();
        // p2.setColor("blue");
        // p2.setTip(5);
        // System.out.println(p2.getColor());
        // System.out.println(p2.getTip());

        // Constructor
        // Student s1 = new Student();
        // Student s2 = new Student("Sajal");
        // System.out.println(s2.name);
        // Student s3 = new Student(45);
        // System.out.println(s3.roll);
        // Student s4 = new Student("Sajal", 56);
        // System.out.println(s4.name);
        // System.out.println(s4.roll);

        // Copy Constructor
        // Student s1 = new Student();
        // s1.name = "Sajal";
        // s1.roll = 45;
        // s1.password = "abcd";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;
        //
        // Student s2 = new Student(s1);
        // s2.password = "xyz";
        // s1.marks[2] = 100;
        // for (int i = 0; i < 3; i++) {
        // System.out.println(s2.marks[i]);
        // }

        // Inheritance
        // // Single level inheritance
        // Fish shark = new Fish();
        // shark.eat();
        // shark.color = "blue";
        // shark.swin();
        // // Multi level inheritance
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // dobby.bark();

        // Polymorphism
        // Method overloading (Complie time polymorphism)
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(2, 4));
        // System.out.println(calc.sum(2.8f, 4.2f));
        // System.out.println(calc.sum(2, 4, 6));
        // Method overiding
        // Dear d1 = new Dear();
        // d1.eat();

        // Packages in Java
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

        // Abstraction
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // // Constructor Heirarchy
        // Mustang myHorse = new Mustang();
        // myHorse.walk();

        // Interface
        // // Single level
        // Queen q = new Queen();
        // q.moves();
        // Multiple level
        // Dear d = new Dear();
        // d.eatFlash();
        // d.eatPlant();

        // Static keyword
        // Student s1 = new Student();
        // s1.schoolName = "St. John's School";
        // Student s2 = new Student();
        // System.out.println(s2.schoolName);
        // Student s3 = new Student();
        // s3.schoolName = "ABC";
        // System.out.println(s1.schoolName);

        // Super Keyword
        // Horse h = new Horse();
        // System.out.println(h.color);

    }
}

// Classes & Objects
// class Pen {
// // Properties
// String color;
// int tip;
//
// // Functions
// void setColor(String newColor) {
// color = newColor;
// }
//
// void setTip(int newTip) {
// tip = newTip;
// }
// }
//
// class Student {
// String name;
// int age;
// float percentage;
//
// void calcPercentage(int sub1, int sub2, int sub3) {
// percentage = (sub1 + sub2 + sub3) / 3;
// }
// }

// Access Modifiers
// class BankAccount {
// public String userName;
// private String password;
//
// public void setPassword(String pwd) {
// password = pwd;
// }
// }

// Getters & Setters
// class Pen {
// // Properties
// private String color;
// private int tip;
//
// // Functions
// void setColor(String color) {
// this.color = color;
// }
//
// void setTip(int tip) {
// this.tip = tip;
// }
//
// String getColor() {
// return this.color;
// }
//
// int getTip() {
// return this.tip;
// }
// }

// Constructor
// class Student {
// String name;
// int roll;
// String password;
// int marks[];
//
// // Non-parameterized constructor
// Student() {
// marks = new int[3];
// System.out.println("Constructor is called");
// }
//
// // Parameterized constructor
// Student(String name) {
// marks = new int[3];
// this.name = name;
// }
//
// Student(int roll) {
// marks = new int[3];
// this.roll = roll;
// }
//
// // Multipparameterized constructor
// Student(String name, int roll) {
// marks = new int[3];
// this.name = name;
// this.roll = roll;
// }
//
// // Copy Constructor
//
// // Shallow Copy constructor
// // Student(Student s1) {
// // marks = new int[3];
// // this.name = s1.name;
// // this.roll = s1.roll;
// // this.marks = s1.marks; //refernce copy (Shallow)
// // }
//
// // Deep copy constructor
// Student(Student s1) {
// marks = new int[3];
// this.name = s1.name;
// this.roll = s1.roll;
// // Deep copy
// for (int i = 0; i < marks.length; i++) {
// this.marks[i] = s1.marks[i];
// }
// }
// }

// Inheritance
// class Animal { // base class
// String color;
//
// void eat() {
// System.out.println("Eats");
// }
//
// void breath() {
// System.out.println("Breaths");
// }
// }
//
// class Bird extends Animal { // Derived from animal
// void fly() {
// System.out.println("Fly");
// }
// }
//
// class Fish extends Animal { // Derived class form animal
// int fins;
//
// void swin() {
// System.out.println("Swims in water");
// }
// }
//
// class Mammal extends Animal { // Derived from animal
// int legs;
//
// void walk() {
// System.out.println("walks");
// }
// }
//
// class Dog extends Mammal { // Derived from mammal
// String breed;
//
// void bark() {
// System.out.println("Dogs Bark");
// }
// }

// Polymorphism
//
// // Method Overloading
// class Calculator {
// int sum(int a, int b) {
// return a + b;
// }
//
// int sum(int a, int b, int c) {
// return a + b + c;
// }
//
// float sum(float a, float b) {
// return (a + b);
// }
// }
//
// // Method Overiding
// class Animal {
// void eat() {
// System.out.println("Eats Anything");
// }
// }
//
// class Dear extends Animal {
// void eat() {
// System.out.println("Eats Grass");
// }
// }

// Abstraction
// abstract class Animal {
// String color;
//
// Animal() {
// this.color = "brown";
// System.out.println("Hellow Animal");
// }
//
// void eat() {
// System.out.println("Animal Eat's");
// }
//
// abstract void walk();
// }
//
// class Horse extends Animal {
// Horse() {
// System.out.println("Hellow Horse");
// }
//
// void changeColor() {
// color = "Dark brown";
// }
//
// void walk() {
// System.out.println("Walks on 4 legs");
// }
// }
//
// class Chicken extends Animal {
// void changeColor() {
// color = "White";
// }
//
// void walk() {
// System.out.println("Walks on 2 legs");
// }
// }
//
// class Mustang extends Horse {
// Mustang() {
// System.out.println("Hellow Mustang");
// }
// }

// Interface
//
// // Single level Inheritance with interface
// interface ChessPlayer {
// void moves();
// }
//
// class Queen implements ChessPlayer {
// public void moves() {
// System.out.println("up, down, left, right, daigonal (in all 4 directions)");
// }
// }
//
// class Rook implements ChessPlayer {
// public void moves() {
// System.out.println("up, down, left, right");
// }
// }
//
// class King implements ChessPlayer {
// public void moves() {
// System.out.println("up, down, left, right, daigonal (by one step only)");
// }
// }
//
// // Multiple inheritance with interface
// interface Herbi {
// void eatPlant();
// }
//
// interface Carni {
// void eatFlash();
// }
//
// class Dear implements Herbi, Carni {
// public void eatPlant() {
// System.out.println("Eat's Plants");
// }
//
// public void eatFlash() {
// System.out.println("Eat's Flash");
// }
// }

// Static Keyword
// class Student {
// static int returnPercentage(int maths, int phy, int chem) {
// return (maths + phy + chem) / 3;
// }
//
// String name;
// int roll;
//
// static String schoolName;
//
// void setName(String name) {
// this.name = name;
// }
//
// String getName() {
// return this.name;
// }
//
// String getSchoolName() {
// return this.schoolName;
// }
// }

// Super Keyword
// class Animal {
// String color = "brown";
//
// Animal() {
// System.out.println("Animal Construtor Called");
// }
// }
//
// class Horse extends Animal {
// Horse() {
// System.out.println(super.color);
// System.out.println("Horse Construtor Called");
// }
// }