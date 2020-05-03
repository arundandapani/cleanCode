package com.practice.argumentCaptor;

class MathUtil {

	void foo(OtherClass other) {
		SomeData data = new SomeData("Some inner data");
		other.doSomething(data);
	}

	class OtherClass {

		void doSomething(SomeData data) {

		}
	}

	class SomeData {

		String innerData;
		SomeData(String some_inner_data) {
			this.innerData = some_inner_data;
		}
	}
}
