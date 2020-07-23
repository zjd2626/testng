package cn.nome.testng;


import org.testng.annotations.*;

@Listeners({TestReport.class})
public class testng_demo2 {

    @BeforeClass
    public void setup(){
        System.out.println("beforeclass....");
    }

    @BeforeMethod
    public void bmethod(){
        System.out.println("bmethod...");
    }

    @AfterMethod
    public void wait1s() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(description = "test1", priority = 0, timeOut = 8000)
    public  void test1(){
        System.out.println("test1 method...");
    }

    @Test(description = "test2", priority = 2, timeOut = 8000, dataProvider = "mydata")
    public  void test2(String from, String to){
        System.out.println("test2 method...");
        System.out.println("From:" + from + ",  To:" + to);
    }

    @Test(description = "test3", priority = 3, timeOut = 8000, dataProvider = "get_data_from_excel", dataProviderClass = Params.class)
    public  void test3(String from, String to){
        System.out.println("test3 method...");
        System.out.println("From:" + from + ",  To:" + to);
    }

    @Test(description = "test4", priority = 1, timeOut = 5000, dataProvider = "get_data_from_txt", dataProviderClass = Params.class)
    public void test4(String username,String password){
        System.out.println("test4 method...");
        System.out.println("Username:" + username + ",  Password:" + password);
    }

    @AfterClass
    public void teardown(){
        System.out.println("afterclass....");
    }

    @DataProvider(name = "mydata")
    public Object[][] getData(){
        Object[][] data = {{"China","Japan"}, {"American", "France"}, {"Italy","Paris"}};
        return data;
    }
}
