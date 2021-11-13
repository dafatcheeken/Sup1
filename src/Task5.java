public class Task5 {

    public static void main(String[] args) {
        float[][] matrix = creatematrix(10);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
    }
    public static float[][] creatematrix(int n){
        return new float[n][n];
    }
}
