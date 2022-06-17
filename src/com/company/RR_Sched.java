package com.company;

public class RR_Sched {
    Process proc = new Process();
    Processor myCpu = new Processor();
    int proc_id;

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

}
