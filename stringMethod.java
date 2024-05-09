public class stringMethod {
    //usefull string method in java
    public static void main(String[] args) {
        String a="man";
        boolean result=a.equals("man");
        System.out.println(result);

        String b="MAN";
        boolean result1=b.equalsIgnoreCase("man");
        System.out.println(result1);

        String c="DHYANA SAMAGA";
        int result2=c.length();
        //String result3=c.charAt();
        System.out.println(result2);
        //System.out.println(result3);
        boolean result4=c.isEmpty();
        System.out.println(result4);
        String result5=c.toLowerCase();
        System.out.println(result5);
        String result6=result5.toUpperCase();
        System.out.println(result6);
        String result7=result6.trim();
        System.out.println(result7);

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

         int n=str1.indexOf("a");
        System.out.println(n);
        int n1=str1.lastIndexOf("a");
        System.out.println(n1);

        String str5=str1.substring(3);
        System.out.println(str5);
        String str6=str1.substring(0,6);
        System.out.println(str6);
        

        
        
    }
}
