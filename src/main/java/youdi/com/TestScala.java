package youdi.com;

public class TestScala {
    public static void main(String[] args) {
        TestScala$.MODULE$.main(args);
    }
}


final class TestScala$ {
    public static final TestScala$ MODULE$;

    static {
        MODULE$ = new TestScala$();
    }

    public void main(String[] args) {
        System.out.println("Hello,scala......");
    }
}