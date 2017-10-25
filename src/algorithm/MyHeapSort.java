package algorithm;

import java.util.Arrays;

public class MyHeapSort {
     static int count = 0;
     public static void main(String[] args) {
          int[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
          System.out.println( Arrays.toString(array) );
          MyHeapSort heapSort = new MyHeapSort();
          heapSort.heapSort(array, array.length);
          System.out.println( Arrays.toString(array) );
     }




     public void heapSort(int[] array, int n) {

          if (array == null) {
               throw new NullPointerException();
          }
          if (n > array.length) {
               throw new ArrayIndexOutOfBoundsException();
          }

          buildMaxHeap(array, n);

          for (int i = n-1; i >= 1; i--) {
               swap(array, 0, i);
               maxHeapify(array, 0, i);
          }
     }

     public void buildMaxHeap(int[] a, int n) {

          for (int i = n/2-1 ; i >= 0; i--) {
               maxHeapify(a, i, n);
          }

     }

     private void maxHeapify(int[] a, int i, int n) {
          count++;

          int largest;
          int leftIndex = 2 * i + 1;
          int rightIndex = leftIndex + 1;

          if (leftIndex < n && a[leftIndex] > a[i]) {
               largest = leftIndex;
          }else {
               largest = i;
          }
          if (rightIndex < n && a[rightIndex] > a[largest]) {
               largest = rightIndex;
          }
          if (largest != i){
               swap(a,i,largest);
               maxHeapify(a,largest,n);
          }
     }
     private void swap(int[] pArray, int pX, int pY) {
          int temp = pArray[pX];
          pArray[pX] = pArray[pY];
          pArray[pY] = temp;
     }
}