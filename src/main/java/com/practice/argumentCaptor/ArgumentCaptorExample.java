package com.practice.argumentCaptor;

public class ArgumentCaptorExample {

	public void createElement(ElementCaller elementCaller) {
		Element element = new Element(100);
		elementCaller.callElement(element);
	}

	class ElementCaller{
		void callElement(Element element){
			element.elementValue = 1000;
		}
	}

	class Element {

		int elementValue;

		Element(int incomingValue) {
			this.elementValue = incomingValue;
		}

		int getElementValue(){
			return elementValue;
		}
	}
}
