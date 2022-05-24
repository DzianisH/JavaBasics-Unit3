package com.absoft.javabasic.part3.mess;

public abstract class AbstractClass2 extends AbstractClass1 {

    public AbstractClass2(String str) {
        System.out.println(str + " AbstractClass2");
    }

    public void methodFromAbstractClass2() {
        System.out.println("methodFromAbstractClass2");
    }

    public final void methodFromAbstractClass2ThatYouCanNotExtend() {
        System.out.println("methodFromAbstractClass2ThatYouCanNotExtend");
    }

    public void callProtectedMethodsFromAbstractClass1() {
        System.out.println("callProtectedMethodsFromAbstractClass1");

        this.protectedMethodFromAbstractClass1();
        this.protectedAbstractMethodFromAbstractClass1();
    }
}
