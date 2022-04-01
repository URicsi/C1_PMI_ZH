public class Matrix {
    public static void main(String[] args) {
        // create a 2d array
        int[][] two_dimensional_matrix = {
                {8, 2, 3},
                {4, 5, 6, 9},
                {7, 4},
                {3, 8, 0},
                {23},
                {17, 6, 1},
                {0, 7, 1},
        };
        //
        System.out.print("A null sorainak sorszámai:\n");
        rowsWithZero(two_dimensional_matrix);
        //System.out.print("A páros számok összege: \n");
        //sumOfEvenNumbers(two_dimensional_matrix);
    }
    public static void rowsWithZero(int[][] two_dimensional_matrix){
        for (int[] data : two_dimensional_matrix) {
            int counter = 0;
            for (int element : data){
                counter++;
                if(element == 0) {
                    System.out.println(counter+".sor");
                }
            }
        }
    }
    /*
    public static void sumOfEvenNumbers(int[][] two_dimensional_matrix){
        int i;
        if (two_dimensional_matrix  2){
            i++;
        }
    }

     */
}
