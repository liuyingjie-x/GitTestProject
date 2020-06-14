package com.lyj.effective.part1;

public class Test {

    public static Test valueOf(String s, int i) {
        if (i == 1) {
            return new Test(s);
        } else if (i == 2) {
            return new Test(s, i);
        }
        return new Test();
    }

    public static int intValue() {
        return 0;
    }

   public Test() {

    }

    public Test(String s) {

    }

    public Test(String s, int i) {

    }

}
