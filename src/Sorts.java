import java.util.Arrays;

public class Sorts
{
    public static void ascendingSort(int[] arr)
    {
        for (int i=0; i<arr.length-1; i++)
        {
            int lowPosition = i;
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[lowPosition])
                    lowPosition = j;
            }
            swap(i, lowPosition, arr);
        }
    }

    private static void swap(int indexA, int indexB, int[] arr)
    {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
