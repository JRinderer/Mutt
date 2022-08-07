package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    //create a process
        ArrayList<Integer> dat1 = new ArrayList<>();
        dat1.add(1);
        dat1.add(2);
        dat1.add(3);
        dat1.add(4);
        Process proc1 = new Process(0,dat1,0,"ready");
        Memory core_memory = new Memory();
        Memory_Manager mem_man = new Memory_Manager();
        mem_man.write_process(proc1);

        ArrayList<Integer> dat2 = new ArrayList<>();
        dat2.add(5);
        dat2.add(6);
        dat2.add(7);
        dat2.add(8);
        Process proc2 = new Process(1,dat2,0,"ready");
        mem_man.write_process(proc2);

        ArrayList<Integer> dat3 = new ArrayList<>();
        dat3.add(9);
        dat3.add(10);
        dat3.add(11);
        dat3.add(12);
        dat3.add(13);
        Process proc3 = new Process(2,dat3,0,"ready");
        mem_man.write_process(proc3);

        ProcQueue queue = new ProcQueue();
        queue.add_to_queue(proc1);
        queue.add_to_queue(proc2);
        queue.add_to_queue(proc3);

        FCFC_Sched sched1 = new FCFC_Sched();

        //sched1.run(queue);

        RR_Sched sched2 = new RR_Sched();
        sched2.run(queue);

        //create core memory to populate



    }
}
