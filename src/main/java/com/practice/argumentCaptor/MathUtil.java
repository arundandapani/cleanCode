package com.practice.argumentCaptor;

class MathUtil {
	public int add(int x, int y) {
		return x + y;
	}

	public boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public long squareLong(long l) {
		return l*l;
	}

	public void foo(OtherClass other) {
		SomeData data = new SomeData("Some inner data");
		other.doSomething(data);
}

class OtherClass{
	void doSomething(SomeData data){

	}
}

class SomeData{
		String innerData;
	public SomeData(String some_inner_data) {
		this.innerData = some_inner_data;
	}
}
}
