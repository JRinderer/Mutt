package com.company;

public class MemoryCell {
    int id;
    int data;
    boolean free;

    public void free_memory(){
        this.free = true;
    }

    public boolean isFree() {
        return free;
    }

    public int getData(){
        return this.data;
    }
    public void write_to_cell(int data, int adr){
        this.id = adr;
        this.data = data;
        this.free = false;
    }

    public MemoryCell(){
        this.data = -1;
        this.id = -1;
    }
}
