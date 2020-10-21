import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TestingClass {
    public static void start(Class testsClass) throws Exception {
        Object testing = testsClass.newInstance();
        Method[] methods = testsClass.getDeclaredMethods();
        List<Method> beforeSuiteMethods = new ArrayList<>();
        List<Method> afterSuiteMethods = new ArrayList<>();
        TreeMap<Integer, Method> testMethods= new TreeMap<>();
        Integer priority;

        for(Method method : methods) {
            if(method.isAnnotationPresent(BeforeSuite.class)) {
                beforeSuiteMethods.add(method);
                if(beforeSuiteMethods.size() > 1) {
                    throw new RuntimeException("Exceeded number of @BeforeSuite methods in: " + testsClass.getName());
                }
            }
            if(method.isAnnotationPresent(AfterSuite.class)) {
                afterSuiteMethods.add(method);
                if(afterSuiteMethods.size() > 1) {
                    throw new RuntimeException("Exceeded number of @AfterSuite methods in: " + testsClass.getName());
                }
            }
            if(method.isAnnotationPresent(Test.class)) {
                priority = method.getAnnotation(Test.class).priority();
                testMethods.put(priority,method);
            }
        }
        for (Method m : beforeSuiteMethods) {
            m.invoke(testing);
        }
        for (Method m : testMethods.values()) {
            m.invoke(testing);
        }
        for (Method m : afterSuiteMethods) {
            m.invoke(testing);
        }
    }
}
