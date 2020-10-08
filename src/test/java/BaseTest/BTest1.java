package BaseTest;

import FirstBasePackage.FirstBaseClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BTest1  extends FirstBaseClass {

    @Test
    public void ExampleReportstest1(){ System.out.println("this is Example reportstest1"); }
        @Test public void ExampleReportstest2(){
        System.out.println("this is Example reportstest2");
    }
    @Test
    public void ExampleReportstest3(){
        System.out.println("this is Example reportstest3");
    }
    @Test
    public void ExampleReportstest4(){
        System.out.println("this is Example reportstest4");
    }
    
}
