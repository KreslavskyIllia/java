public class TestsClass3 {

    @Test (priority = 7)
    public void test1() {
        System.out.println("Test_1 in " + this.getClass().getCanonicalName());
    }
    @Test (priority = 8)
    public void test2() {
        System.out.println("Test_2 in " + this.getClass().getCanonicalName());
    }
    @Test (priority = 9)
    public void test3() {
        System.out.println("Test_3 in " + this.getClass().getCanonicalName());
    }
    @Test (priority = 10)
    public void test4() {
        System.out.println("Test_4 in " + this.getClass().getCanonicalName());
    }
}
