package hudson.plugins.grandjojo;

import junit.framework.TestCase;

public class FricandelActionTest extends TestCase {

	private FricandelAction action;

	public void setUp() {
		action = new FricandelAction(Style.BAD_ASS,
				"Il y a environ 800 sortes de bières brassées en Belgique.");
	}

	public void testAccessors() {
		assertEquals(Style.BAD_ASS, action.getStyle());
		assertEquals("Il y a environ 800 sortes de bières brassées en Belgique.", action
				.getFact());
		assertEquals("Grand Jojo", action.getDisplayName());
		assertNull(action.getIconFileName());
		assertEquals("grandjojo", action.getUrlName());
	}
}
