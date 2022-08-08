package com.company;

import java.util.ArrayList;

public class ProcTableEntry {
    Process proc;
    ArrayList<Integer> physical_addr;

    public Process getProc() {
        return proc;
    }

    public void setProc(Process proc) {
        this.proc = proc;
    }

    public ArrayList<Integer> getPhysical_addr() {
        return physical_addr;
    }

    public void add_to_addr(int phys_addr){
        this.physical_addr.add(phys_addr);
    }

    public void setPhysical_addr(ArrayList<Integer> physical_addr) {
        this.physical_addr = physical_addr;
    }

    public ProcTableEntry(){
        this.physical_addr = new ArrayList<>();
    }

    public ProcTableEntry(Process proc, ArrayList<Integer> physical_addr) {
        this.proc = proc;
        this.physical_addr = physical_addr;
    }
}
