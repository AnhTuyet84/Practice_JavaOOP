package Practice_JavaOOP3.Testcases;

import Practice_JavaOOP3.Common.BaseTest;

public class Testcases extends BaseTest {
    public void testLoginSuccess(){
        createDriver();
        System.out.println("Navigate to URL https://cms.anhtester.com/login");
        System.out.println("Set email valid: admin@example.com");
        System.out.println("Enter password valid: 123456");
        System.out.println("Click on Login button");
        System.out.println("Verify Login success");
        closeDriver();
    }
    public void addCategory(){
        createDriver();
        System.out.println("Click on Products menu");
        System.out.println("On the dropdown list, click on Category menu");
        System.out.println("On the All categories window, click on Add new Category button");
        System.out.println("Input all required Category Information");
        System.out.println("Click on Save button");
        System.out.println("Verify the newly created category is displayed on the All categories window");
        closeDriver();
    }

    public static void main(String[] args) {
        Testcases testcases = new Testcases();
        testcases.testLoginSuccess();
        testcases.addCategory();
    }
}
