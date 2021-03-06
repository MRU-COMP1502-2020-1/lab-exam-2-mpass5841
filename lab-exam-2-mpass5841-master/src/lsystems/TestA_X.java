package lsystems;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestA_X {

	@Test
	public void test() throws LSystemSymbolException, LSystemLengthException {
		char[] test = {'A'};
		Set<LRule> rules = new HashSet<LRule>();
		rules.add(new A_X());
		LLine line = new LLine(test, rules);
		line.process();
		assertEquals("Expected output A", line.toString());
	}

}
