
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("thread 111111 runned...");
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("thread 22222 runned...");
        }

    }

}

class karthick {
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();

        a.start();
        b.start();

    }
}


