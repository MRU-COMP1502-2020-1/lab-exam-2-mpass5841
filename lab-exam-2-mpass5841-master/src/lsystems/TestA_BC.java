package lsystems;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestA_BC {

	@Test
	public void test() throws LSystemSymbolException, LSystemLengthException {
		char[] test = {'A'};
		Set<LRule> rules = new HashSet<LRule>();
		
		rules.add(new A_BC());
		rules.add(new B_A());
		rules.add(new C_B());

		LLine line = new LLine(test, rules);
		for (int i = 1; i <= 10; i++) {
			line.process();
		}
		assertEquals("Expected output ABBCBCABCAABBCAABABBC after 10 runs", "ABBCBCABCAABBCAABABBC", line.toString());
		
	}

}
