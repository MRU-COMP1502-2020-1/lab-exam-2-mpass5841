package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	List<LRule> rulesArray = new ArrayList<>();
	List<Character> list = new ArrayList<>();
	int count = 0;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		
		rulesArray.addAll(rules);
		
		for (int j = 0; j < line.length; j++) {
			
			for (int i = 0; i < rulesArray.size(); i++) {
				
				if (line[j] == rulesArray.get(i).getMatch()) {
					
					for (int k = 0; k < rulesArray.get(i).getBody().length; k++) {
						
						char[] c = rulesArray.get(i).getBody();
						
						if(c[k] != 'Q') {
							list.add(c[k]);
						} else {
							throw new LSystemSymbolException(c[k]);
						}
					}
				}
			}
		}
		
		if (list.get(0) == 0) {
			throw new LSystemLengthException();
		}
		
		line = listToArray(list);
		list.clear();
		rulesArray.clear();
		count++;
		
	}
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
		
	}
	
}
