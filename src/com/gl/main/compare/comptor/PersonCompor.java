package com.gl.main.compare.comptor;

import java.util.Comparator;

public class PersonCompor implements Comparator<Person>{
	
	@Override
	public int compare(Person paramT1, Person paramT2) {
		if(paramT1.getAge()==paramT2.getAge()) {
			return 0;
		}
		
		if(paramT1.getAge()>paramT2.getAge()) {
			return 1;
		}
		
		if(paramT1.getAge()<paramT2.getAge()) {
			return -1;
		}
		
		return 0;
	}

}
