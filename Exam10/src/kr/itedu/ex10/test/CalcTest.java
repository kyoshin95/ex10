package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest 
{
	@Test
	void test() 
	{
		Calc c = new Calc();
		
		// test1 값 검증
		int n1 = 10;
		int n2 = 20;
		int result = c.sum(n1, n2);
		assertEquals(n1 + n2, result);
		
		// test2 값 검증
		n1 = 30;
		n2 = 40;
		assertEquals(n1 + n2, result);

		// test3 값 검증
		n1 = 50;
		n2 = 60;
		assertEquals(n1 + n2, result);
		
	}
}
