public class TestsClass2 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite test in " + this.getClass().getCanonicalName());
    }

    /*@BeforeSuite
    public void beforeSuite2() {
        System.out.println("BeforeSuite test_2 in " + this.getClass().getCanonicalName());
    }*/

    @Test (priority = 6)
    public void test2() {
        System.out.println("Test_2 in " + this.getClass().getCanonicalName());
    }

    @Test (priority = 5)
    public void test1() {
        System.out.println("Test_1 in " + this.getClass().getCanonicalName());
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite test in " + this.getClass().getCanonicalName());
    }
}
