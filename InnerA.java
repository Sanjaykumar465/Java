
// non static variable shared differnt copies to different objects
class Test {
     int x = 10;
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.x);
        System.out.println(t2.x);

        t1.x = 20;
        System.out.println(t1.x);
        System.out.println(t2.x);
    }
}

// static variable is shares same copy to different objects
 class A {
  static int x = 10;
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        System.out.println(t1.x);
        System.out.println(t2.x);

        t1.x = 20;
        System.out.println(t1.x);
        System.out.println(t2.x);
    }
}

// local variable
class B {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x);
        System.out.println(y);
    }
}

class D {
    int x = 10;
    public static void main(String[] args) {
         int x = 20;
               x=30;
    System.out.println(x);

    }
}
// Local VAriable
class E {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);


    }
}
// if there is static variable declared in the class area and a local variable with same name with static variable and we call that variable in static
// area then the local variable will execute.

class F {
    static int x = 10;
    public static void main(String[] args) {
        int x = 20;
         System.out.println(F.x);
        System.out.println(x);
       
    }
}
// Local variable get destroyed after the method loading.
class G {
    static int x = 20;
    public static void main(String[] args) {
        if(true) {
            int x = 10;
            System.out.println(x);
     }
        System.out.println(x);
    }
}

// static variable up casting
 class H {
  static double d ;
//    static int x = (int)l;
    public static void main(String[] args) {
        System.out.println(H.d);
    }
 }


 // calling of static variable and local variable inside static area.


    
 class S {
    static int x = 10;
    public static void main(String[] args) {
        int x  = 20;
        System.out.println(x);
        System.out.println(S.x);
    }
 }
