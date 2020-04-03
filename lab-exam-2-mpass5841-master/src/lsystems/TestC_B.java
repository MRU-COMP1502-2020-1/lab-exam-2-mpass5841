package lsystems;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestC_B {

	@Test
	public void test() throws LSystemSymbolException, LSystemLengthException {
		char[] test = {'C'};
		Set<LRule> rules = new HashSet<LRule>();
		rules.add(new C_B());
		LLine line = new LLine(test, rules);
		line.process();
		assertEquals("Expected output C", "B", line.toString());
	}

}
