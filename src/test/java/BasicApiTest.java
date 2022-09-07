import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.Assert;
public class BasicApiTest extends BaseTest {

    @Test
    public void T01_StatusCodeAndGetClientsTest() {
        res = utils.RestAssuredUtil.getResponse("http://localhost:9090/greeting");
        Assert.assertEquals(res.getStatusCode(), 200, "Status Check Failed!");
    }
    
    @Test
    public void T02_StatusCodeAndGetClientsTest() {
        res = utils.RestAssuredUtil.getResponse("http://localhost:9090/greeting?name=vishal&capitalize=true");
        Assert.assertEquals(res.getStatusCode(), 200, "Status Check Failed!");
    }


//    @Test
//    public void T02_GetAndroidModelPackageOptions() {
//        res = utils.RestAssuredUtil.getResponse("/gen/clients/android");
//        testUtil.checkStatusIs200(res);
//        jp = utils.RestAssuredUtil.getJsonPath(res);
//        System.out.println("Opt: " + jp.get("modelPackage.opt"));
//        System.out.println("Description: " + jp.get("modelPackage.description"));
//        System.out.println("Type: " + jp.get("modelPackage.type"));
//    }
}
