package src.sort;


import java.util.HashMap;
import java.util.List;

public class quickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);   // 排第一次
            quickSort(arr, left, pivotIndex - 1);   // 递归排左半边
            quickSort(arr, pivotIndex + 1, right);    // 递归排右半边
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left]; // 基准元素选择为左边界元素
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {     // 左半边找>,因此<=都略过
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, left, j); // 因为从i+1开始，最后要把最开始的基准元素放到j
        return j; // 返回基准元素的最终位置
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

