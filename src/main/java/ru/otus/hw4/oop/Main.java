package ru.otus.hw4.oop;

public class Main {

    public static void main(String[] args) {

        int date = 2025;
        User[] users = {
            new User("Канторович", "Леонид", "Витальевич", 1914, "L.K.V.@mail.ru"),
            new User("Колмогоров", "Андрей", "Николаевич", 1903, "A.K.N.@mail.ru"),
            new User("Перельман", "Григорий", "Яковлевич", 1966, "G.Y.P.@mail.ru"),
            new User("Ковалевская", "Наташа", "Леонидовна", 1978, "N.K.L.@mail.ru"),
            new User("Чебышёв", "Пафнутий", "Львович", 1821, "CH.P.L.@mail.ru"),
            new User("Достоевский", "Федор", "Михайлович", 1821, "F.M.D.@mail.ru"),
            new User("Гоголь", "Николай", "Васильевич", 1809, "N.V.G.@mail.ru"),
            new User("Пушкин", "Александр", "Сергеевич", 1799, "A.S.P.@mail.ru"),
            new User("Толстой", "Лев", "Николаевич", 1828, "L.N.T.@mail.ru"),
            new User("Булгаков", "Михаил", "Афанасьевич", 1891, "M.B.A.@mail.ru")
        };

        for (int i = 0; i < users.length; i++) {
            if (date - users[i].getBirthYear() > 40) {
                users[i].info();
            }
        }
        Box box = new Box(1000, "Коричневый");
        box.info();
        box.open();
        box.put("book");
    }
}
