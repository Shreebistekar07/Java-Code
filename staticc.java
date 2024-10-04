public class staticc {
    int x=10;
    static int y=20;
    staticc(){
        System.out.println("In Constructor");
    }
    static{
        System.out.println("In static block 1");
    }
    {
        System.out.println("instance block 1");

    }
    public static void main(String[] args) {
        System.out.println("main");
        staticc obj=new staticc();

        
    }
    static{
         System.out.println("In statics block 2");
    }
        {
            System.out.println("In instance block 2");
        }
}
    

