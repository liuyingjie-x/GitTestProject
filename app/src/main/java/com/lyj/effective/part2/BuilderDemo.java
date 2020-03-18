package com.lyj.effective.part2;

public class BuilderDemo {
    private String name;
    private String career;
    private double height;
    private double weight;
    private String type;
    private int number;
    private boolean male;
    private long date;
    private int age;

    public static class Builder {
        //必要参数
        private String name;
        private int age;

        //可选参数
        private String career;
        private double height;
        private double weight;
        private String type;
        private int number;
        private boolean male;
        private long date;


        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }


        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setMale(boolean male) {
            this.male = male;
            return this;
        }

        public Builder setDate(long date) {
            this.date = date;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCareer(String career) {
            this.career = career;
            return this;
        }

        public BuilderDemo build() {
            return new BuilderDemo(this);
        }
    }

    private BuilderDemo(Builder builder) {
        name = builder.name;
        career = builder.career;
        age = builder.age;
        date = builder.date;
        male = builder.male;
        number = builder.number;
        height = builder.height;
        weight = builder.weight;
    }
}
