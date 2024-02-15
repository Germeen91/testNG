package class01;

import org.testng.annotations.Test;

public class EnableDisable {

    @Test (groups = "regression")
    public  void Atest(){
        System.out.println("i am first test case");
    }

    @Test
    public  void Btest(){
        System.out.println( "i am the second test case");
    }


    //    failing
    @Test(enabled = false)  // mean if i have failed test case please ignore (like comment out) .. it is true by default
    public  void Ctest(){
        System.out.println( "i am the third test case");
    }
}
