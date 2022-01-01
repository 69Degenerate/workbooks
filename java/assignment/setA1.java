class Myclass
{
    int num;
    public Myclass()
    {
        num=0;

    }
    public Myclass(int num)
    {
        this.num=num;
    }
    public static void main(String[] args)
    {
        Myclass m1 = new Myclass();
        if(args.length>0)
        {
            int n=Integer.parseInt(args[0]);
            Myclass m2 = new Myclass(n);
            System.out.println(m1.num);
            System.out.println(m2.num);
        }
        else
        {
            System.out.println("insufficient argument");

        }
    }
}