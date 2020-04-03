package lsystems;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestB_A {

	@Test
	public void test() throws LSystemSymbolException, LSystemLengthException {
		char[] test = {'B'};
		Set<LRule> rules = new HashSet<LRule>();
		rules.add(new B_A());
		LLine line = new LLine(test, rules);
		line.process();
		assertEquals("Expected output B", "A", line.toString());
	}

}
