package com.crm.qa.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.crm.qa.util.ExtentReporter;

public class MyListeners implements ITestListener{

	ExtentReports extentReport;
	ExtentTest extentTest;
	 
	@Override
	public void onStart(ITestContext context) {
		 try {
			extentReport = ExtentReporter.generateExtentReport();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Execution of project Test started");
	}
	@Override
	public void onTestStart(ITestResult result) {
		String Testname = result.getName(); 
		extentTest =  extentReport.createTest(Testname);
		extentTest.log(Status.INFO, Testname +"Started Executing");
		
		//System.out.println(Testname + "started executing");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String Testname = result.getName(); 
		extentTest.log(Status.PASS, Testname +"got Successfully Executed");
		
		//System.out.println(Testname + "Got successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String Testname = result.getName(); 
		
		extentTest.log(Status.INFO,result.getThrowable());
		extentTest.log(Status.FAIL,Testname +"Got Failed");
		
//		System.out.println(Testname + "Got Failed");
//		System.out.println(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
		
		extentTest.log(Status.INFO,result.getThrowable());
		extentTest.log(Status.SKIP,testName + "Got Skiped");
		
//		System.out.println(testName + "Got skipped");
//		System.out.println(result.getThrowable());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testName = result.getName();
		extentTest.log(Status.INFO,result.getThrowable());
		extentTest.log(Status.SKIP,testName + "Got Failed due to timeout");
//		System.out.println(testName + "Got failed due to timeout");
//		System.out.println(result.getThrowable());
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

}
