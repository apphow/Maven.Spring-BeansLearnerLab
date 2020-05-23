package com.example.demo.models;

import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

    private List<PersonType> personList;


    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType person) {
        this.personList.add(person);
    }

    public void remove(PersonType person) {
        this.personList.remove(person);
    }

    public void size(PersonType person) {
        this.personList.size();
    }

    public void clear(PersonType personList) {
        this.personList.clear();
    }

    public void addAll(List<PersonType> people) {
        this.personList.addAll(people);
    }

    public PersonType findById(long id) {
        for(PersonType name : personList) {
            if(name.getId() == id) {
                return name;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
