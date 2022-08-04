# Mutt
Hey, kid! Help computer!

The Mutt computer is an initial design of a very simple virtual machine I plan on writing. The idea is to create a highly abstracted system that students
can more easily interact with at a higher level. The current system contains the following classes:
1. A CPU
2. A Process
3. A Queue

A process is a simple class whose primary purpose is to contain an array list of integers. This array list simulates actual instructions the CPU would run.

A queue will hold all the processes we create; our scheduling algorithms will extract a process from this queue to run for some time based on the algorithm.

The processor will then "run" the process. Running a process is really nothing more than printing 1 element from the array list of that process. Currently,
to keep things simple, the CPU removes from the array list the operation it just executed. This allows us to simplify the scheduling process. 

The idea is to create a simple interface to allow students to schedule processes to run on a very simple CPU. A process is little more than a data type
that holds an array list of data. Each "cycle" on the CPU prints 1 number from a Process. Simulating how a CPU executes instructions. The queue just holds
our processes. The students will write scheduler classes to pull a process from the queue. Put it on the CPU, and make the switches as necessary. 

I'm currently adding a Memory class that will be used to store the data a 
Process has. A process will be stored in memory, and will take up a 
certain amount of memory cells. 
