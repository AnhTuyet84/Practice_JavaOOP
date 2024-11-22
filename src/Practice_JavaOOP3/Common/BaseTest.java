package Practice_JavaOOP3.Common;

import Practice_JavaOOP1.Staff;

public class BaseTest extends Constants{
    public void createDriver(){
        setBrowser("Chrome");
        setReport(true);
        setHeadless(true);
        System.out.println(getBrowser());
        System.out.println(isReport());
        System.out.println(isHeadless());
    }
    public void closeDriver(){
        String browser = "Chrome";
        System.out.println("Close Driver: " + browser);
    }
}
