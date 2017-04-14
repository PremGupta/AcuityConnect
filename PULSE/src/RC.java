import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


@SuppressWarnings("deprecation")
public class RC {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

    Selenium sl= new DefaultSelenium("localhost", 4444, "*firefox", "http://www.google.com");
    sl.start();
    sl.open("/");
    Thread.sleep(5000);
    sl.windowMaximize();

	}

}
