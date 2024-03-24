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
        

        
        
    }
}
