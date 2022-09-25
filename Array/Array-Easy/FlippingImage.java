import java.util.Arrays;
public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        // System.out.println(Arrays.toString(flipAndInvertImage(image)));
        image = flipAndInvertImage(image);
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++){
                System.out.print(image[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int count = 0, lengthOfArray = image.length;
        int[][] resArray = new int[lengthOfArray][lengthOfArray];

        for(int i = 0; i < lengthOfArray; i++){
            //traversing through the array to reverse the array elements
            for(int j = image[i].length-1; j >= 0; j--){
                resArray[i][count++] = image[i][j];
            }
            count = 0;
            //TRAVERSING THROUGH THE ARRAY TO INVERT THE ARRAY.
            for(int k = 0; k < image[i].length; k++){
                if(resArray[i][k] == 0){
                    resArray[i][k] = 1;
                }else{
                    resArray[i][k] = 0;
                }
            }
        }
        return resArray;
    }
}