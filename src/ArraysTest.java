import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] intArray = new int[3];

        int[] ints = {1, 22, 44, 44, 66};

        System.out.println("intArray.length = " + intArray.length);

        //запис змінної в масив
        intArray[0] = 9;
        intArray[1] = 55;
        intArray[2] = 66;
        intArray[0] = 44;

        System.out.println("intArray.length = " + intArray.length);
        System.out.println("intArray[0] = " + intArray[0]);

        System.out.println("intArray = " + intArray);

        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        int index = 1;

        ints[1] = intArray[1];
        ints[index] = intArray[index];
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        //System.out.println("intArray[6] = " + intArray[6]);

        int[][] itnsTwoDim = new int[3][2];
        itnsTwoDim[0][0] = 7;
        itnsTwoDim[0][1] = 8;
        itnsTwoDim[1][0] = 9;
        itnsTwoDim[1][1] = 10;
        itnsTwoDim[2][0] = 11;
        itnsTwoDim[2][1] = 12;

        System.out.println("Arrays.toString(itnsTwoDim) = " + Arrays.toString(itnsTwoDim));
        System.out.println("Arrays.toString(itnsTwoDim[0]) = " + Arrays.toString(itnsTwoDim[0]));
        System.out.println("Arrays.toString(itnsTwoDim[1]) = " + Arrays.toString(itnsTwoDim[1]));
        System.out.println("Arrays.toString(itnsTwoDim[2]) = " + Arrays.toString(itnsTwoDim[2]));

    }
}
