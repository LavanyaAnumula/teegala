package String;
public class StringOperations {
    public static void main(String[] args) {
      
        String str = "Hello";
        System.out.println("Original String: " + str);
        str = str + " World"; 
        System.out.println("After concatenation: " + str);
        System.out.println("Length of String: " + str.length());
        System.out.println("Substring (0-5): " + str.substring(0, 5));

        System.out.println();

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);
        sb.append(" World"); 
        System.out.println("After append: " + sb);
        sb.insert(6, "Java "); 
        System.out.println("After insert: " + sb);
        sb.reverse(); 
        System.out.println("After reverse: " + sb);

        System.out.println();

      
        StringBuilder sbd = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sbd);
        sbd.append(" World");
        System.out.println("After append: " + sbd);
        sbd.replace(6, 11, "Java"); 
        System.out.println("After replace: " + sbd);
        sbd.delete(0, 6); 
        System.out.println("After delete: " + sbd);
    }
}
