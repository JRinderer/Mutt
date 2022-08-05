package com.company;

public class MemoryCell {
    int id;
    int data;

    public int getData(){
        return this.data;
    }
    public void write_to_cell(int data, int adr){
        this.id = adr;
        this.data = data;
    }
}
