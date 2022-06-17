package com.company;

import java.util.ArrayList;

public class ProcQueue {
    ArrayList<Process> queue = new ArrayList<>();

    public boolean queue_empty(){
        return queue.isEmpty();
    }

    public void add_to_queue(Process proc){
        this.queue.add(proc);
    }

    public Process pop_proc(int proc_id){
        return this.queue.get(proc_id);
    }

    public void remove_proc(int proc_id){
        this.queue.remove(proc_id);
    }


    public ArrayList<Process> getQueue() {
        return queue;
    }

    public void setQueue(ArrayList<Process> queue) {
        this.queue = queue;
    }

    public ProcQueue() {
    }
}
