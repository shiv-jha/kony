package user;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
  @Test
  public void test3() {
	  System.out.println("test3");
  }
  
  @BeforeTest
  public void before() {
	  System.out.println("beforetest");
  }
}
