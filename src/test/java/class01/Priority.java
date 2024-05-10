package class01;

import org.testng.annotations.Test;

public class Priority {  // testNG execute test cases Alphabetical .. so, to execute your test case as you want put priority
// 0 by default
    @Test (priority = 3)
    public void A(){
        System.out.println("i am test case A");
    }

    @Test(priority = 2)
    public void B(){
        System.out.println("i am test case B");
    }

    @Test(priority = 1,groups = "smoke")
    public void C(){
        System.out.println("i am test case C");
    }

    @Test
    public void Ftest(){  // if i dont put priority will be 0 by default
        System.out.println("i am the parent test case");
    }
}
