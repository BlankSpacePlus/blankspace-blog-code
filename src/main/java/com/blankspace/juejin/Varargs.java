package com.blankspace.juejin;

/**
 * <a href="https://juejin.cn/post/7084262255079981064">文章链接</a>
 */
public class Varargs {

    public static void function(int var1, int... var2) {
        System.out.println(var1);
        System.out.println(var2.getClass());
        int[] array = new int[] {1, 2, 3, 4};
        System.out.println(array.getClass());
    }

    public static void main(String[] args) {
        function(100, 1, 2, 3, 4);
    }

}
