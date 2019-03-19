package com.qa.accounts;

import java.util.concurrent.ThreadLocalRandom;

public class SixNumGen implements INumGen {

	@Override
	public String generateNumber() {
		String str = "abc";
		char letterPart = str.charAt(ThreadLocalRandom.current().nextInt(0, 3));
		int numberPart = (int) ThreadLocalRandom.current().nextDouble(Math.pow(10, 5), Math.pow(10, 6));
		return letterPart +""+ numberPart;
	}

}
