package hudson.plugins.grandjojo;

import hudson.plugins.grandjojo.FriteDescriptor;
import static org.mockito.Mockito.mock;
import hudson.model.AbstractProject;
import junit.framework.TestCase;

public class FriteDescriptorTest extends TestCase {

	private FriteDescriptor descriptor;

	public void setUp() {
		descriptor = new FriteDescriptor();
	}

	public void testGetDisplayName() {
		assertEquals("Activate Grand Jojo", descriptor.getDisplayName());
	}

	public void testIsApplicableGivesTrue() {
		assertTrue(descriptor.isApplicable(mock(AbstractProject.class)
				.getClass()));
	}
}
