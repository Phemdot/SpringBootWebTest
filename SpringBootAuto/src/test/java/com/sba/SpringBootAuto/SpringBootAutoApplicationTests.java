package com.sba.SpringBootAuto;

import com.sba.SpringBootAuto.pages.HomePage;
import com.sba.SpringBootAuto.pages.LoginPage;
import com.sba.SpringBootAuto.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootAutoApplicationTests {







	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Test
	void performLoginTest() {

		//mainPage.navigate();
		//mainPage.performLogin();
	}

}
