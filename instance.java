public class instance {

    int x=10;
    private int y=20;

    static int z=30;

    void fun(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
}

class Demo{
    public static void main(String[] args) {
        instance obj1 =new instance();
        instance obj2 =new instance();

        obj1.fun();

        obj1.x=100;
        obj1.z=300;

        obj1.fun();
        obj2.fun();
    }
}