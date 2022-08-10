import java.util.Arrays;

public class InsertionSort {

    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];

            /* Find the index to insert at. */
            int index = i;
            for (int j = 0; j < i; j++) {
                /* The current element needs to be greater than all the previously sorted elements.
                 * The index where the above condition fails, that's where the element should be inserted.
                 */
                if (array[j] > current) {
                    index = j;
                    break;
                }
            }

            if (index != i) {
                /* Move all the elements by one position to the right
                 * of the index where we are inserting.
                 */
                for (int k = i; k > index; k--) {
                    array[k] = array[k - 1];
                }
                /* Insert the element at the index. */
                array[index] = current;
            }
        }
    }

    public static void main(String... arguments) {
        int array[] = {
            10, 5, 1, 32
        };
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}