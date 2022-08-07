package com.company;

public class RR_Sched {
    Process proc = new Process();
    Processor myCpu = new Processor();
    int proc_id;
    Memory_Manager mem_man;

    public void run(ProcQueue queue){
        boolean keep_running=true;
        int queue_counter = 0;
        int cycle = 0;
        while(keep_running){
            this.proc = queue.pop_proc(queue_counter);
            if(this.proc.status.equals("ready")){
                myCpu.run_proc(this.proc,0);
                if(this.proc.status.equals("done")){
                    queue.remove_proc(this.proc_id);
                    //this is also where we want to free memory.
                    mem_man.free_process_mem(this.proc);
                }
                cycle +=1;
                if(cycle == 2){
                    queue_counter +=1;
                    cycle=0;
                }
                if(queue_counter == queue.getQueue().size() && !queue.queue_empty()){
                    queue_counter=0;
                    cycle=0;
                }else if(queue.queue_empty()){
                    keep_running=false;
                }
            }
        }

    }

    public RR_Sched() {

    }

    public RR_Sched(Memory_Manager mem_man) {
        this.mem_man = mem_man;
    }
}
