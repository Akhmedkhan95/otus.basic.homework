package ru.otus.hw11;

import java.util.*;

public class PersonDataBase {
    private static Map<Long, Person> persons = new HashMap<>();
    private static Set<Position> positionManagers = Set.of(
            Position.MANAGER,
            Position.DIRECTOR,
            Position.BRANCH_DIRECTOR,
            Position.SENIOR_MANAGER
    );



    public Person findById(Long id) {
        return persons.get(id);
    }

    public void add(Person person) {
        persons.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        return positionManagers.contains(person.getPosition());
    }

    public boolean isEmployee(Long id) {
        Position personPosition = findById(id).getPosition();
        return !positionManagers.contains(personPosition);
    }
}
