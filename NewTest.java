import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;


public class NewTest {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting the browser session");
  }

  @BeforeClass
  public void beforeClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

}
