package org.example;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{-6, -4, 0, 3, 6, 9, 22, 26};
        System.out.println(FindIndex(array));
    }

    public static Integer FindIndex(Integer[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == mid) {
                return mid;
            }
            if (array[mid] < mid) {
                left = mid + 1;
            } else if (array[mid] > mid) {
                right = mid - 1;
            }
        }
        return -1;
    }
}