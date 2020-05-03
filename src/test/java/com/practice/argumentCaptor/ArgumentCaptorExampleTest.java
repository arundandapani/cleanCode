package com.practice.argumentCaptor;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentCaptorExampleTest {

	@Captor
	public ArgumentCaptor elementCaptor;

	@Test
	public void testElementValue() {
		ArgumentCaptor<ArgumentCaptorExample.Element> captor = ArgumentCaptor.forClass(ArgumentCaptorExample.Element.class);
		ArgumentCaptorExample.ElementCaller elementCaller = mock(ArgumentCaptorExample.ElementCaller.class);
		new ArgumentCaptorExample().createElement(elementCaller);

		verify(elementCaller, times(1)).callElement(captor.capture());

		Assert.assertEquals(100, captor.getValue().getElementValue());
	}
}