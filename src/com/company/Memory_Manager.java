package com.company;

import java.util.ArrayList;

public class Memory_Manager {
    //the RAM is what we'll expose to write data
    Memory RAM = new Memory();

    ArrayList<Process> procs = new ArrayList<>();
    ArrayList<ProcTableEntry> tables = new ArrayList<>();
    int physical_address;

    /*when we write a process to memory the proess is simply going to request from the memory manager
    A process will be passed down, it's size will be determined by the memory manager
    */

    public void free_process_mem(Process proc){
        for(ProcTableEntry p : tables){
            System.out.println("The process is " + p.getProc().id);
            System.out.println("Physical address is: " + (this.RAM.get_data(p.getPhysical_addr().get(0))));
            if (p.getProc().id == proc.id){
                this.RAM.free_memory(this.RAM.get_data(p.getPhysical_addr().get(0)));
                System.out.println("Ram is free for the physical address: " + this.RAM.get_data(p.getPhysical_addr().get(0)));
            }
        }
        for(ProcTableEntry p : tables){
            Process pr;
            pr = p.getProc();
            //System.out.println(pr.id);
            //System.out.println(pr.data);
            System.out.println("The ram at physical address: " + this.RAM.get_data(p.getPhysical_addr().get(0)) + "is: " + this.RAM.get_free(p.getPhysical_addr().get(0)));

        }

    }

    public void write_process(Process proc){
        /*first we need to write the process to memory
        to do this we need to get the size of the data for the process
        to write. Keep in mind Memory only write one cell at a time.
        As such we need to iterate and write data 1 by 1
         */
        for(int i : proc.data){
            /*we'll write each data point to ram and
            return a physical address to store
             */
           physical_address =  this.RAM.write_data(i);
           //create a temp proc to write to the proc table
           ProcTableEntry temp_proc = new ProcTableEntry();
           //add the process to this temp list
           temp_proc.setProc(proc);
           //add the physical address that's returned
           temp_proc.add_to_addr(physical_address);
           //add the process to the table
           this.tables.add(temp_proc);
        }

        for(ProcTableEntry p : tables){
            Process pr;
            pr = p.getProc();
            //System.out.println(pr.id);
            //System.out.println(pr.data);
            System.out.println("The physical address is: " + p.getPhysical_addr() + " and the data at this address is: " + this.RAM.get_data(p.getPhysical_addr().get(0)) + " for process: " + proc.getId());
        }
    }

    public Memory_Manager(){
        this.RAM = new Memory();
    }

}
