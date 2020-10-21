public class Main {

    public static void main(String[] args) throws Exception{
        TestingClass tClass = new TestingClass();
        tClass.start(TestsClass1.class);
        tClass.start(TestsClass2.class);
        tClass.start(TestsClass3.class);
    }
}
