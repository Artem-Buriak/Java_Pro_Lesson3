package com.company;
//2. Створити клас "Співробітник" з полями: ПІБ, посада, email, телефон, вік.

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;

//3. Конструктор класу повинен заповнювати ці поля під час створення об'єкта. Забезпечити інкапсуляцію внутрішніх властивостей класу.
    public Employee(String name, String position, String email, String phone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

}
