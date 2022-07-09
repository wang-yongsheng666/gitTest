package com.wysheng.git;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello,Git");
        System.out.println("Hello");
        System.out.println("master test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        int res = max(1, 2);
        swap(1, 2);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }
}
