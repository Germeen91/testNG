package Notes;

public class class01 {

    /*Annotations:

1.@Test:
All the test cases must be written down under the annotation of @Test.


whenever u run a class , it is going to execute each and every method under the annotation of
@Test.

by default @Test annotation follows alphabetical order of execution of the test cases

e.g public void atestcase(); --> will execute first
    public void btestcase();-->will execute second

    the green tick indicates that test case has passed
    the red sign indicates the test case has failed



@BeforeMethod annotation:

the code under this annotation is going to execute everytime before each and every @Test execution is made



@AfterMethod annotation :

the code under this annotation is going to execute after every test Method (after every @TEST)


Assertions:
we are not using if else condition because even if the test case fails (i.e the condition doesnt pass in if)
the testNG will still show it has passed
in order to overcome that we use
Assertions from testNG
the library is Assert
and we call different types of assertions from it

first assertion that we learned is
1.Assert.AssertEquals(String , String)
it compares two strings if they are equal test case passed else fails.

2.Assert.AssetTrue(boolean)-->if the boolean is True the Assertion will pass
								if the boolean is false the assertion will fail


1.HardAssertions
As soon as any assertion FAIlS it doesnt check for other assertions , marks the test as failed and quits


Assert.AssertEquals(Expected value,Actual Value)-->if they are equal your test case will pass
`												--> if they are not equal your test case is going to FAIL

2.SoftAssertions:

Soft assertion will execute all assertions that are there despite of the fact that they FAIL or PASS
and once it has evaluated them all then it will mark the test case as
Failed or Passed
(it marks it failed even if one assertion has failed)

The advantage of using soft assert is that we can
see what errors we are having in other assertions that we make in the same test case
but we cant see them if we use hardAssertion as IT WILL EXIT AS SOON AS THE FIRST ASSERTION FAILS

method to implement:
1. declare the instance
softAssert soft =new softAssert();
2.make assertions

soft.assertEquals();

3. at the end of making all assertions
you must do
soft.assertALL()

this evaluates whether the test case has to be marked passed or failed

---------Data Provider-----------
Used for dataDriven testing
 DataProviders in TestNG are another way to pass the parameters in the test function. DataProviders pass different values to the TestNG Test Case in a single execution
@DataProvider

--> we provide our data under this annotations and should name our data provider @DataProvider(name="abc")

-->in which ever test case we want to use this data we simply link the data provider to that test case
  @Test(dataProvider="abc")

//dataProvider -->use it when u have small data
in case of larger data use excel file


if we want our test case to utilize this dataProvider
what do we need to do?
@test(dataProvider ="name of dataProvider")
public void test(){


}


whenever u want to create a testNg XML


Approach is
1.make sure the XML file is installed
      goto file--> preferences     (intellijidea--> preferences)
            plugins---> marketplace --> TestNgXML and install--> apply ok
OR

      goto file -->settings -->>plugins --> marketplace --> TestNgXML and install--> apply ok



testng xml file for a particular class

1. right click the or the class --> choose option  create testNg xml
2. then click OK
3.right click on the Project and select the option reload from disk.


In a testNg XML file

we have a structure

<suite>
		<test name="abc">
				<classes>
						<class name=  > </class>
						<class name=  > </class>

				</classes>
		</test>

</suite>




1.XML file
a. Class wise execution

 we can control which classes to execute
 <suite name="All Test Suite">
    <test verbose="2" preserve-order="true" name="mytest">
        <classes>
            <class name="class01.priority"></class>
            <class name="class02.dataProvider"></class>
            <class name="class01.AssertionBasic"></class>
        </classes>
    </test>
</suite>



b.Method wise Execution
  in order to include a method simply use the tag name  "include"
  in order to not run a method just use the tag name   "exclude"



<suite name="All Test Suite">
    <test verbose="2" preserve-order="true" name="abracadabra">
       <classes>
           <class name="class01.priority">
               <methods>
                   <include name="Atest"></include>
                   <include name="Btest"/>
                   <exclude name="Ctest"/>
               </methods>
           </class>
       </classes>
    </test>
</suite>





c.Package wise execution

u can run the whole package i.e all the classes included in that package


<suite name="custom-fit">
    <test verbose="2" preserve-order="true" name="bran">
        <packages>
            <package name="class01"></package>
        </packages>
    </test>
</suite>


d.group wise execution

regression group--> will consist of all the test cases included in regression testing

<suite name="All Test Suite">
    <test verbose="2" preserve-order="true" name="regression group">
         <groups>
             <run>
                 <include name="regression"/>
             </run>
         </groups>
        <packages>
            <package name="class01"></package>
        </packages>
    </test>
</suite>

Note"
when ever u are marking a test case in a group, and that test case has
a before and after method
make sure to mark it as (alwaysRun=true) other wise those pre-post cond are not going to run

beforemethod(alwaysRun=true)




-----------parallel testing-------------------
<suite name="All Test Suite">
    <test verbose="2" preserve-order="true" name="parallel" parallel="classes" thread-count="4">
      <classes>
          <class name="class01.AssertionBasic"></class>
          <class name="class02.softAssertionExample"></class>
      </classes>
    </test>
</suite>

   */
}
