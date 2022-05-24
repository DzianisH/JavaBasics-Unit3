package com.absoft.javabasic.part3.mess;

public class TrickyInheritanceClass extends AbstractClass2 implements Interface4, Interface5{

    public TrickyInheritanceClass(String str) {
        super(str);
    }

//    @Override
//    public void methodFromAbstractClass2ThatYouCanNotExtend() { // error
//        System.out.println("methodFromAbstractClass2ThatYouCanNotExtend");
//    }

    @Override
    public void methodFromAbstractClass1() {
        System.out.println("methodFromAbstractClass1");
    }

    @Override
    protected void protectedAbstractMethodFromAbstractClass1() {
        System.out.println("protectedAbstractMethodFromAbstractClass1");
    }

    @Override
    public int methodFromInterface1(double x) {
        System.out.println("methodFromInterface1");
        return 0;
    }

    @Override
    public String secondMethodFromInterface2() {
        System.out.println("secondMethodFromInterface2");
        return "karamba";
    }

    @Override
    public double methodFromInterface3() {
        System.out.println("methodFromInterface3");
        return 0;
    }

    @Override
    public void methodFromInterface4() {
        System.out.println("methodFromInterface4");
    }

    @Override
    public int firstMethodFromInterface5() {
        System.out.println("firstMethodFromInterface5");
        return 0;
    }

    @Override
    public double secondMethodFromInterface5() {
        System.out.println("secondMethodFromInterface5");
        return 0;
    }
}
