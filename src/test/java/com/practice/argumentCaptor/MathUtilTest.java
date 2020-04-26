package com.practice.argumentCaptor;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MathUtilTest {


	@Test
	public void test() {
		MathUtil.OtherClass other = mock(MathUtil.OtherClass.class);

// Run the foo method with the mock
		new MathUtil().foo(other);

// Capture the argument of the doSomething function
		ArgumentCaptor<MathUtil.SomeData> captor = ArgumentCaptor.forClass(MathUtil.SomeData.class);
		verify(other, times(1)).doSomething(captor.capture());

// Assert the argument
		MathUtil.SomeData actual = captor.getValue();
		assertEquals("Some inner data", actual.innerData);
	}


}