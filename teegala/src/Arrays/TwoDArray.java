package Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int rows = 3;  
        int cols = 4; 
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = (int)(Math.random() * 100); 
            }
        }
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

