package org.example;


public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passSerial = 444 ;
        post.passNumber  = 4444444 ;
        post.patronymic = "Иванович";
        post.phone = "+7(999) 999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 2001;

        if (post.subscription == true) {
            System.out.println("Согласие получено");
        } else {
            System.out.println("Согласие не получено");
        }


        System.out.println("Имя      - " + post.name);
        System.out.println("Отчество - " + post.patronymic);
        System.out.println("Фамилия  - " + post.surname);
        System.out.println("Телефон  - " + post.phone);
        System.out.println("Дата рождения: " + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year + "г");
        System.out.println("Паспорт:  серия " + post.passSerial + " номер " + post.passNumber);
    }
}
