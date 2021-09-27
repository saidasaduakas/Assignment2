package com.company;

import java.util.ArrayList;
import java.util.List;
public class PSC implements Subject{

    private List<String> queues = new ArrayList<>();
    private List<Observer> user = new ArrayList<>();

    public void getTalon(String queue){
        this.queues.add(queue);
    }
    public void Passed(String queue){
        this.queues.remove(queue);
        notifyAllPerson();
    }


    @Override
    public void getQueue(Observer person){
        this.user.add(person);
    }
    @Override
    public void  nextPerson(Observer person){
        this.user.remove(person);
    }
    @Override
    public void notifyAllPerson(){
        for (Observer person:user){
            person.update(this.queues);
        }
    }

    public void getTalon() {
    }
}
