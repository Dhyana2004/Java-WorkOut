public class array2d {
    //2D array manipulation
    public static void main(String[] args) {
        String [][] cars=new String[2][3];
        cars[0][0]="bmw";
        cars[0][1]="polo";
        cars[0][2]="tata";
        cars[1][0]="bmw";
        cars[1][1]="polo";
        cars[1][2]="tata";
       for(int i=0;i<cars.length;i++){
        System.out.println();
        for(int j=0;j<cars[i].length;j++){
            System.out.println(cars[i][j] +" ");
        }
       }
    }
    
}
