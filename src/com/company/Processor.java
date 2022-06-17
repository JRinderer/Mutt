package com.company;

public class Processor {
    int counter;
    Process running_proc = new Process();

    public void run_proc(Process proc, int start){
        this.running_proc = proc;
        this.counter = proc.counter;
        if(proc.status.equals("ready")){
            //this is the execution of code
            System.out.println(this.running_proc.data.get(start));
            proc.data.remove(start);
        }
        if(proc.data.isEmpty()){
            proc.status = "done";
        }
    }

    public Processor(){

    }

}
