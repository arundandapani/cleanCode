
package com.practice.generics.oracleExamples.wildCards;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
	List<? super Integer> lowerList = new ArrayList<>();

	private void check(){
		lowerList.add(Integer.valueOf(10));
	}

}
