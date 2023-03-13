
class A extends Object {
    public A() {
        System.out.println("defa A");
    }

    public A(int m) {
        System.out.println("int param A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("int b");
    }

    public B(int n) {
        this();
        System.out.println("int b int");
    }
}

class Demo {
    public static void main(String[] args) {
        B s1 = new B(5);
    }
}