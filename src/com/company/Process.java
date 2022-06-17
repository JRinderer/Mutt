package com.company;

import java.util.ArrayList;

public class Process {
    int id;
    ArrayList<Integer> data = new ArrayList<>();
    int counter;
    String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Process() {
    }

    public Process(int id, ArrayList<Integer> data, int counter, String status) {
        this.id = id;
        this.data = data;
        this.counter = counter;
        this.status = status;
    }
}
