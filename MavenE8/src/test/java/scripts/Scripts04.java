package scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import GenericLib.Methods;
import pom.BookPagePom;
import pom.HomePagePom;

public class Scripts04 extends BaseClass{
	@Test
	public void dropDown() throws InterruptedException {
		hp=new HomePagePom(driver);
		 hp.getBookLink().click();
		Thread.sleep(2000);
		bp=new BookPagePom(driver);
		Methods ms= new Methods();
		ms.selectDropDownByVisibleText(bp.getProductDropdown(), "Name: Z to A");
		Thread.sleep(4000);
		}
}
