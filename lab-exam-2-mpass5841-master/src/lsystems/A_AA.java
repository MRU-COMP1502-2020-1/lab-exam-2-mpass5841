package lsystems;

public class A_AA extends LRule{

	public A_AA() {
		
	}
	
	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'A';
	}

	@Override
	public char[] getBody() {
		// TODO Auto-generated method stub
		char[] c = { 'A', 'A' };
		return c;
	}

}
