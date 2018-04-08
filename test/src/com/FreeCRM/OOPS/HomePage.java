package com.FreeCRM.OOPS;

public class HomePage  extends Loginpage{
public void newAccount()
{
	System.out.println("This is my New Account");
	
}
public void verifyHomePageTitle()
{
	System.out.println("verify HomePage Title");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HomePage h=new HomePage();
h.login();
h.m1();
h.city="chicago";
h.newAccount();
h.verifyHomePageTitle();

	}

}
