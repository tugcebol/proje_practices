public class deneme {
    public static void main(String[] args) {
        String str = "java mava reg time: 34:34:34";
        int last1 = str.lastIndexOf(" ");
        str = str.substring(0,last1);
        int last2 = str.lastIndexOf(" ");
        str = str.substring(0,last2);
        int last3 = str.lastIndexOf(" ");
        str = str.substring(0,last3);
        System.out.println(str);
    }
}
