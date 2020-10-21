public class TestsClass1 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite test in " + this.getClass().getCanonicalName());
    }

    @Test (priority = 4)
    public void test1() {
        System.out.println("Test_1 in " + this.getClass().getCanonicalName());
    }
    @Test (priority = 2)
    public void test2() {
        System.out.println("Test_2 in " + this.getClass().getCanonicalName());
    }
    @Test (priority = 3)
    public void test3() {
        System.out.println("Test_3 in " + this.getClass().getCanonicalName());
    }
    @Test (priority = 1)
    public void test4() {
        System.out.println("Test_4 in " + this.getClass().getCanonicalName());
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite test in " + this.getClass().getCanonicalName());
    }
}
