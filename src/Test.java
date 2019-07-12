public class Test {
    static int count = 10;
    public static void main(String args[])
    {

        String []array= {"nothing"} ;
        count--;
        if(count==0)
            return;
        System.out.println(array[0]);

        main(array);

    }

}
