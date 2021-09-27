package com.company;

public class Main {

    public static void main(String[] args) {
        PSC egov =new PSC();
        dataPerson persons =new dataPerson("Samat Aitbekov");
        egov.getQueue(persons);
        egov.getTalon("You are 1st");
        egov.Passed("You are passed");

        
    }
}
