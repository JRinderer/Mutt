package com.company;

import java.util.ArrayList;

public class Memory {
    ArrayList<MemoryCell> mappedMemory = new ArrayList<>();
    int logical_address_start;
    int logical_address_end;

    public int getLogical_address_start() {
        return logical_address_start;
    }

    public void setLogical_address_start(int logical_address_start) {
        this.logical_address_start = logical_address_start;
    }

    public int getLogical_address_end() {
        return logical_address_end;
    }

    public void setLogical_address_end(int logical_address_end) {
        this.logical_address_end = logical_address_end;
    }

    public ArrayList<MemoryCell> getMappedMemory() {
        return mappedMemory;
    }

    public void setMappedMemory(ArrayList<MemoryCell> mappedMemory) {
        this.mappedMemory = mappedMemory;
    }

    public Memory(int start, int end) {
        this.logical_address_start = start;
        this.logical_address_end = end;
    }
}
