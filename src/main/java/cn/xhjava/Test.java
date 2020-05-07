package cn.xhjava;

public class Test {
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.getResult());//30

        /**
         *
         * 动态绑定机制:
         *     1.成员方法在执行过程中,JVM会将方法和当前调用对象的实际内存进行绑定
         *     2.属性没有绑定机制,在哪里声明,就在哪里使用
         * 运行流程:
         *    Father father = new Son();
         *    在这里,子类先与父类初始化,此处声明了两个I值都存在于内存之中
         *    father.getResult()
         *    因为成员方法有动态绑定机制,在JVM执行的过程中,首先会声明的实际内存(Son)
         *    中有没有getResult(),结果没有,转而向上,走父类的getResult()
         *    属性是没有动态绑定机制的,所以直接在Father内返回10
         *    最终数据:20
         *
         */

    }
}


class Father {
    private Integer i = 10;

    public Integer getResult() {
        return getI() + 10;
    }

    public Integer getI() {
        return i;
    }
}

class Son extends Father {
    private Integer i = 20;

//    public Integer getResult() {
//        return i + 20;
//    }

    public Integer getI() {
        return i;
    }
}