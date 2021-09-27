package com.company;

import java.util.List;

public class dataPerson implements Observer {
    private String name;

    public dataPerson(String name){
        this.name=name;
    }
    @Override
    public void update(List<String> queue){
        System.out.println("Dear" + this.name + "\n your queue is: \n" + queue +"\n");
    }
}
