package com.company;

import java.util.ArrayList;

/*the memory class will represent a Memory stick. Which will be composed of memory cells.
When we want to add something to memory data (an integer) will be passed down. We don't
want to specify start and end or size. That's something to do at a higher layer. At this
layer we want to just allocate a single memory cell for a single data point. A memory
manager will actually get the request to allocate space for a process
*/
public class Memory {

    MemoryCell[] memory_cells = new MemoryCell[1000];
    int crnt_address=0;
    int next_address=this.crnt_address+1;
    int prev_address=0;

    public int get_data(int phys_addr){
        return this.memory_cells[phys_addr].getData();
    }

    public int write_data(int data){
        //once we've written data to memory we want to return that address
        int return_addr;
        //this will write data to the memory cell at the currently avaiable address
        this.memory_cells[this.crnt_address].write_to_cell(data,this.crnt_address);
        //once we've written to the memory cell we can return that address
        return_addr = this.crnt_address;
        //the previous address becomes the current address
        this.prev_address = this.crnt_address;
        //the next address is the current address + 2
        this.next_address = this.crnt_address + 2;
        //the current address is incremented by 1
        this.crnt_address++;
        //we return the memory address the data was written to.
        return return_addr;
    }


    public Memory() {
        for (int y = 0; y < 1000; y++) {
            this.memory_cells[y] = new MemoryCell();
        }
        this.crnt_address = 0;
        this.next_address = this.crnt_address + 1;
        this.prev_address = 0;
    }
}
