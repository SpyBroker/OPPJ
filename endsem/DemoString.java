class DemoString {

    int height = 10, width = 20;

    // Overriding toString()
    public String toString() {
        return "Dimensions: " + height + ", " + width;
    }

    public static void main(String[] args) {

        // =========================
        // STRING CONSTRUCTORS
        // =========================

        String s1 = new String(); // empty string

        char[] arr = {'J', 'a', 'v', 'a'};
        String s2 = new String(arr); // from char array

        String s3 = new String(arr, 1, 2); // subarray -> "av"

        String s4 = new String(s2); // copy constructor

        String s5 = "Hello"; // string literal

        // =========================
        // STRING OPERATIONS
        // =========================

        String concat = s5 + " World"; // concatenation

        // =========================
        // STRING FUNCTIONS
        // =========================

        String str = "Welcome to Java";

        System.out.println("Length: " + str.length()); // length()

        System.out.println("charAt(2): " + str.charAt(2)); // charAt()

        char[] buffer = new char[5];
        str.getChars(0, 5, buffer, 0); // getChars()
        System.out.println("getChars: " + new String(buffer));

        System.out.println("equals: " + str.equals("Welcome to Java"));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase("welcome TO java"));

        System.out.println("compareTo: " + "abc".compareTo("abd"));

        System.out.println("indexOf: " + str.indexOf('o'));
        System.out.println("lastIndexOf: " + str.lastIndexOf('o'));

        System.out.println("indexOf from pos: " + str.indexOf('o', 5));

        System.out.println("substring: " + str.substring(2, 7));

        System.out.println("concat(): " + "Ram".concat("Hari"));

        System.out.println("replace: " + str.replace('a', 'x'));

        System.out.println("trim: " + " Hello ".trim());  // Removes leading and trailing spaces

        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("toLowerCase: " + str.toLowerCase());

        // =========================
        // toString() METHOD
        // =========================

        DemoString d = new DemoString();
        System.out.println("toString(): " + d); // automatically calls toString()

        // =========================
        // valueOf() METHOD
        // =========================

        int num = 100;
        String numStr = String.valueOf(num); // int → String
        System.out.println("valueOf: " + numStr + 50);

        // =========================
        // STRINGBUFFER CONSTRUCTORS
        // =========================

        StringBuffer sb1 = new StringBuffer(); // empty

        StringBuffer sb2 = new StringBuffer(50); // capacity

        StringBuffer sb3 = new StringBuffer("Hello"); // from string

        // =========================
        // STRINGBUFFER FUNCTIONS
        // =========================

        System.out.println("Length: " + sb3.length());

        System.out.println("Capacity: " + sb3.capacity());

        sb3.ensureCapacity(100); // increase capacity

        sb3.setLength(4); // set length
        System.out.println("After setLength: " + sb3);

        sb3.setCharAt(1, 'a'); // modify character
        System.out.println("setCharAt: " + sb3);

        System.out.println("charAt: " + sb3.charAt(2));

        char[] buf2 = new char[2];
        sb3.getChars(0, 2, buf2, 0);
        System.out.println("getChars: " + new String(buf2));

        // append()
        StringBuffer sb4 = new StringBuffer("Value = ");
        sb4.append(100).append("!");
        System.out.println("append: " + sb4);

        // insert()
        sb4.insert(6, "Inserted ");
        System.out.println("insert: " + sb4);

        // reverse()
        System.out.println("reverse: " + new StringBuffer("Hello").reverse());

        // replace()
        StringBuffer sb5 = new StringBuffer("Bhubaneswar");
        sb5.replace(3, 5, "XX");
        System.out.println("replace: " + sb5);

        // substring()
        System.out.println("substring: " + sb5.substring(2, 6));

        // delete()
        sb5.delete(2, 4);
        System.out.println("delete: " + sb5);

        // deleteCharAt()
        sb5.deleteCharAt(0);
        System.out.println("deleteCharAt: " + sb5);

        // indexOf()
        StringBuffer sb6 = new StringBuffer("Hello Hello");
        System.out.println("indexOf: " + sb6.indexOf("lo"));

        System.out.println("indexOf from: " + sb6.indexOf("lo", 5));

        System.out.println("lastIndexOf: " + sb6.lastIndexOf("lo"));

        System.out.println("lastIndexOf from: " + sb6.lastIndexOf("lo", 8));

        System.out.println("Capacity: " + sb6.capacity());
        // trimToSize()
        sb6.trimToSize();
        System.out.println("trimToSize capacity: " + sb6.capacity());
    }
}