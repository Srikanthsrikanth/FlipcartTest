package com.hetlperutil;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
System.out.println("ON TEST SCREEN SHOT");		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
System.out.println("Test case is success"+result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("Test is Failure"+result.getStatus());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
System.out.println("Test is failed"+result.getStatus());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
System.out.println("Test is percentage"+result.getTestName()+""+result.getStatus());		
	}

	@Override
	public void onStart(ITestContext context) {
System.out.println("ItestContext"+context.getName());		
	}

	@Override
	public void onFinish(ITestContext context) {
System.out.println("COmpleted"+context.getPassedTests());		
	}

}
