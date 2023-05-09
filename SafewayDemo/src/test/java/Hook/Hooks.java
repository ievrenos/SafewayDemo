package Hook;

import Driver.Driver;
import io.cucumber.java.After;

public class Hooks {	
		
		@After
	    public void afterScenario(){
			Driver.GetDriver().close();
			Driver.GetDriver().quit();
	    }
	}
