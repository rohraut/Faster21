package com.resonance.keywords;

import org.apache.commons.math3.ode.AbstractParameterizable;

public class Demo1 {
	UIKeywords uiKeywords = new UIKeywords();
	// UIKeywords uk = new UIKeywords();

	public static void verifyTitleOfHomePage() {
		String s = "hello";
		System.out.println(s);

	}

	public void ram() {

		verifyTitleOfHomePage();

	}

	public static void main(String[] args) {
		// new Demo1().ram();
		Demo1 r = new Demo1();
		r.ram();
		verifyTitleOfHomePage();

	}

}