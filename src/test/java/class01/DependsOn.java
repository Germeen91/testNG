package class01;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void login(){
        System.out.println("i am login test");
    }

    @Test(dependsOnMethods = {"login"}) // means if our login test case not able to login so, i cant go to dashboard .. to not waste our time
    public void DashBoard(){
        System.out.println("i am a DashBoard test");
    }





    @Test
    public void divide(){
        System.out.println(0/0);
    }


    @Test (dependsOnMethods = {"divide"})
    public void result(){
        System.out.println("your result is good");   // will ignore because depend on
    }
}
