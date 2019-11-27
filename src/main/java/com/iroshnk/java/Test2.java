package com.iroshnk.java;

import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.print();

        A a2 = new  B();
        a2.print();

        C c = new C();
        System.out.println(c.date);

        c.date.setTime(222222222222222L);

        System.out.println(c.date);
    }

}
class A {
    public static void print() {
        System.out.println("Class A");
    }
}

class B extends A {
    public static void print() {
        System.out.println("Class B");
    }
}

final class C {
    final public Date date;

    public C(){
        date = new Date();
    }

    public Date getDate() {
        return date;
    }
}
