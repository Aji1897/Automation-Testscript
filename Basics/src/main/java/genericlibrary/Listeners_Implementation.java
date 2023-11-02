package genericlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Implementation implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		String name = result.getName();
		TakesScreenshot ts = (TakesScreenshot)BaseTest.listenersDriver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshot/"+name+".png");

		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
