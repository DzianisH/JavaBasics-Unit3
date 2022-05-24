package com.absoft.javabasic.part3.mess;

public abstract class AbstractClass1 implements Interface3 {

    public AbstractClass1() {
        System.out.println("AbstractClass1");
    }

    @Override
    public void firstMethodFromInterface2() {
        System.out.println("firstMethodFromInterface2");
    }

    public abstract void methodFromAbstractClass1();

    protected abstract void protectedAbstractMethodFromAbstractClass1();

    protected void protectedMethodFromAbstractClass1() {
        System.out.println("protectedMethodFromAbstractClass1");
    }
    void defaultMethodFromAbstractClass1() {
        System.out.println("defaultMethodFromAbstractClass1");
    }

    private void privateMethodFromAbstractClass1() {
        System.out.println("privateMethodFromAbstractClass1");
    }
}
