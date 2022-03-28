public class HeapSort {
    /**
     * 产生大顶堆的堆调整算法
     * @param arr 数组
     * @param pointer 指针
     * @param length 遍历长度
     */
    public static void adjustHeap(int[] arr, int pointer, int length){
        int temp = arr[pointer];
        for(int newp = pointer * 2 + 1; newp < length; newp = newp * 2 + 1){
            if (newp +1 < length && arr[newp] < arr[newp + 1]) {
                newp ++;
            }
            if(arr[newp] > arr[pointer]){
                arr[pointer] = arr[newp];
                pointer = newp;
            } else {break;}
            arr[newp] = temp;
        }
    }

    /**
     * 将大顶堆调整为顺序数组
     * @param arr 数组
     */
    public static void heapSort(int[] arr){
        for(int i = arr.length / 2 - 1; i >= 0; i --){
            adjustHeap(arr, i, arr.length);
        }
        for(int j = arr.length - 1; j > 0; j --){
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;

            adjustHeap(arr, 0, j);
        }
    }
}
