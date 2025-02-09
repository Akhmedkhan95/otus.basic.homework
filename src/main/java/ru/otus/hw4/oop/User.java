package ru.otus.hw4.oop;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int birthYear;
    private String email;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User (String surname, String name, String patronymic, int BirthDate, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = BirthDate;
        this.email = email;
    }


    public void info() {
        System.out.println(( "ФИО: " + surname + " " + name + " " + patronymic + "\nГод рождения: "  + birthYear + "\nemail: " + email));
    }
}
