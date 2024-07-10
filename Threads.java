class mythread extends Threads
{
    public void start()
    {
        super.start();
        System.out.println("star method");
    }
    public void run()
    {
        System.out.println("run method");
    }
}
public class Threads {
    public static void main(String[] args) {
        mythread t = new mythread();
        t.start();
        System.out.println("main method");
    }

    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
    
}
