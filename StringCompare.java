public class StringCompare {
    public static void main(String[] args) {
        // -  ->false
        // +  ->true
        // 0  ->equal
        String str1="dhyana";
        String str2="samaga";
        System.out.println(str1.compareTo(str2));
        String str3="dhyana";
        System.out.println(str1.compareTo(str3));
        String str4="to the down hill of the house";
        System.out.println(str4.compareTo(str1));
    }
}
