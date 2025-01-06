package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters; 
public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	@BeforeClass(groups = {"sanity","Regression"})
	@Parameters({"os","browser"})
	public void setUp(String os,String br) throws IOException {
		 FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		 
		 
		 
		// loadng confif properties
		logger = (Logger) LogManager.getLogger(getClass());
		switch(br.toLowerCase()) {
		case "chrome":driver = new ChromeDriver();break;
		case "edge"  :driver = new EdgeDriver();break;
		case "firefox"  :driver = new FirefoxDriver();break;
		default :System.out.println("invalid browser name..");return;
		}
		//driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	@AfterClass(groups = {"sanity","regression","Master"})
	public void tearDown() {
		driver.quit();
	}
	public String randomeString() {
		 String generatedstring	 = RandomStringUtils.randomAlphabetic(5);
			return generatedstring;
		}
		public String randomeNumber() {
			 String generatednumber	 = RandomStringUtils.randomNumeric(10);
				return generatednumber;
			}
		
		public String randomeAlphaNumber() {
			 String generatednumber	 = RandomStringUtils.randomNumeric(3);
			 String generateAlphadnumber	 = RandomStringUtils.randomAlphabetic(3);
				return (generateAlphadnumber +"@" +generatednumber);
			}
}
