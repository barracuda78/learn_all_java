package core.array;

public class Array {

    public static void main(String[] args) {
        int[][] array = new int[9][9];
        System.out.println(array[0][0]);
        array[0][0] = 9;
        System.out.println(array[0][0]);
    }
}
