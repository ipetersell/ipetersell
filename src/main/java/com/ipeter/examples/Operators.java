package com.ipeter.examples;


public class Operators {

    public static void main(String[] args) {

        System.out.println("-------------------");
        System.out.println("test1");
        test1();

        System.out.println("-------------------");
        System.out.println("test2");
        test2();

    }

    private static void test1() {
        int v = 127;
        if (v++ > 128 && ++v == 128 & ++v == 129 && ++v == 129) {
            System.out.println("127");
        }
        System.out.println(v);
        if (v++ < 128 || ++v == 128 | v-- == 129) {
            System.out.println("128");
        }
        System.out.println("v = " + v);
    }

    public static void test2() {
        int v = 127;
        if (v++ < 128 && v++ == 128 | ++v == 129 | ++v == 129 & ++v == 129) {
            System.out.println("127");
        }
        System.out.println(v);
        if (v++ < 128 || ++v == 128 | v-- == 129) {
            System.out.println("128");
        }
        System.out.println("v = " + v);
    }
}
