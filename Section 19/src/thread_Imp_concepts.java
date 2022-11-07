class MyThreadd extends Thread {
    public MyThreadd(String name)
    {
//        super(name); // This is how we can give name to super class constructor.
//        setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++ + "My Thread");
//                try {
//                    Thread.sleep(1000); // It will make the process sleep for some time.
//                } catch (InterruptedException e) {
//                    System.out.println(e);
//                }
//            }
        }
    }
}
    class thread_imp_concepts {
        public static void main(String[] args) throws Exception {
//        Thread t = new Thread(); // Non parameterized constructor
//        Thread t = new Thread("My Name"); // parameterized constructor
//        Thread th = new Thread(new MyRun(),"My Name"); // This is constructor
//        Thread t = new Thread(new MyRun()); // This is constructor


            MyThreadd mt = new MyThreadd("My Thread 1");


//            mt.setDaemon(true); // means code will run for only the time we have provided.


            mt.start();

            int count = 1;
            while (true) {
                System.out.println(count++ + "Main");
                Thread.yield(); // This will give more time to other thread to print. like here My Thread
//                is getting more time to print.
            }



//            Thread mainThread = Thread.currentThread();
//            mainThread.join(); // It means now daemon thread will continue.
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//
//            }
//            mt.interrupt();
//        System.out.println("ID: " + mt.getId());
//        System.out.println("Name: " + mt.getName());
//        System.out.println("Priority: " + mt.getPriority());
//        System.out.println("State: " + mt.getState());
//        System.out.println("Alive: " + mt.isAlive());
        }
    }


// Higher priority will get more time.
// Lower priority will get less time.
// Priority is between 1 and 10.

//THREAD CLASS
// Constructors.
// getter and setter methods.
// Enquiry methods.
// Instance methods.
// static methods.


