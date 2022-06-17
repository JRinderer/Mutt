package com.company;

public class FCFC_Sched {
    Process proc = new Process();
    Processor myCpu = new Processor();

    public void run(ProcQueue queue){
        for(Process p : queue.getQueue()){
            int size = p.getData().size();
            this.proc = p;
            for(int i = 0; i < size; i++){
                myCpu.run_proc(this.proc,0);
            }
        }
    }
}
