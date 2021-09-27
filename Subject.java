package com.company;

public interface Subject {
    void getQueue(Observer person);
    void nextPerson(Observer person);
    void notifyAllPerson();
}
