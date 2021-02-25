package hu.bme.mit.train.tachometer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TachometerTest {
	Tachometer tachometer;

	@Before
	public void before() {
		tachometer = new Tachometer();
	}

	@Test
	public void checkIfTachometerEmpty() {
		tachometer.add(10, 5);
		Assert.assertEquals(true, tachometer.isEmpty());
	}
}
