package com.cg.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cg.Page.LoginActivity;
import com.cg.utility.ReadDataFromExcel;

public class LoginTestCase {

	@Test(dataProvider = "sendData")
	public void login(String userName, String password) throws IOException {

		if (ReadDataFromExcel.isTestCaseRunnable("LoginTest")) {
			LoginActivity loginActivity = new LoginActivity();
			Assert.assertTrue(loginActivity.doLogin(userName, password), "***Login Failed***");
			System.out.println("My first Commit");
		}
	}
	
	@DataProvider
	public Object[][] sendData(String testCaseName)
	{   Object[][] a = null;
		return a;
	}

}
