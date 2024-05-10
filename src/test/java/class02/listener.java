package class02;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {// put your cursor on ITestListener and press ctrl and double click you mouse>>. will give you all methods
// it is implements ITestListener interface class


    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("the test case passed");

    }

    @Override

    public void onTestFailure(ITestResult result) {
        System.out.println("the test case failed");
    }

// generate xml file >> then <listener> .. for this class02 [to get the result from here ]
//


}
