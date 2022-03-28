import java.util.Arrays;

public class Hello {

    public static void main(String[] args){
        System.out.print("This is a test module\n");
        int[] arr = {9, 5, 7, 3, 4, 6, 7, 1, 8, 2, 0, -6, 12, };
        System.out.println("修改之前：" + Arrays.toString(arr));
        HeapSort.heapSort(arr);
        System.out.println("修改之后：" + Arrays.toString(arr));

    }
}
