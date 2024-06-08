package scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import GenericLib.Methods;

public class Script05 extends BaseClass{

	@Test

	public void scrollDown() throws InterruptedException {
	Thread.sleep(4000);
	Methods ms= new Methods();
	ms.scrollDown(driver);
	Thread.sleep(4000);
	}
}
