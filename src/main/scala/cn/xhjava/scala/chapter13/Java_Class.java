package cn.xhjava.scala.chapter13;

/**
 * @author Xiahu
 * @create 2020/6/16
 */
public class Java_Class {
    //java中泛型的使用
    public static void main(String[] args) {
        test(Person.class);
        test2(Person.class);
        test(Student.class);
        test2(Student.class);
        test(Dog.class);
        //test2(Dog.class);此时这里报错,因为dog跟person没有关系
        test3(Person.class);
//        test3(Student.class);
//        test3(Dog.class);
        test3(Monky.class);
    }


    public static void test(Class c) {
        System.out.println(c);
    }

    //但是我现在只想传入与Person有关的类,怎么办呢
    public static void test2(Class<? extends Person> c) {
        System.out.println(c);
    }

    public static void test3(Class<? super Person> c) {
        System.out.println(c);
    }

}

class Monky {

}


class Person extends Monky {

}

class Student extends Person {

}

class Dog {

}
