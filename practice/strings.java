class Box{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width=w;
        height =h;
        depth=d;
    }

    public String toString()
    {
        return "Dimensions are " + width + " by " + depth + " by " + height + ".";
    }
}

public class strings {

    // Main Function
    public static void main(String args[])
    {

        // creating Java string using a new keyword
        String str = new String("Geeks");
        StringBuffer demoString = new StringBuffer("GeeksforGeeks\n");


        System.out.println(str);
        System.out.println(demoString);

        char[] chars = { 'a', 'b', 'c', 'd', 'e' };
        String s=new String(chars);
        System.out.println(s.length());

        Box b= new Box(10, 8, 6); 
        String s1 = "Box b: " +b; // Concatenate Box object

        System.out.println(b); //Convert box to string
        System.out.println(s1+"\n");

        char ch = "abc".charAt(1);
        System.out.println(ch);

        String text = "HelloWorld";
        char[] arr = new char[5];

        text.getChars(0, 5, arr, 0);

        System.out.println(arr);

         char[] arr1 = text.toCharArray();

        for(char c : arr1){
            System.out.print(c + " ");
        }
    }
}