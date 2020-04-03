package lsystems;

public class A_BC extends LRule {

	public A_BC() {
		
	}
	
	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'A';
	}

	@Override
	public char[] getBody() {
		// TODO Auto-generated method stub
		char[] c = { 'B', 'C' };
		return c;
	}

}
