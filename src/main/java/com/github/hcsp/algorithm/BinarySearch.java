package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        if (strings.length < 0) {
            return -1;
        } else {
            int start = 0;
            int end = strings.length - 1;
            if (strings[0].equals(target)) {
                return 0;
            } else if (strings[end].equals(target)) {
                return end;
            }

            while (start <= end) {
                int mid = (start + end) / 2;
                String midStr = strings[mid];
                if (strings[mid].equals(target)) {
                    return mid;
                } else if (target.compareTo(midStr) < 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }
}
