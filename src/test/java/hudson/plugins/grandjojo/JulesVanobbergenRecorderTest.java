package hudson.plugins.grandjojo;

import hudson.plugins.grandjojo.Style;
import hudson.plugins.grandjojo.FactGenerator;
import hudson.plugins.grandjojo.FricandelAction;
import hudson.plugins.grandjojo.JulesVanobbergenRecorder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.model.Action;
import hudson.model.Build;
import hudson.model.BuildListener;
import hudson.model.Result;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class JulesVanobbergenRecorderTest extends TestCase {

	private FactGenerator mockGenerator;
	private JulesVanobbergenRecorder recorder;

	@Override
	public void setUp() {
		mockGenerator = mock(FactGenerator.class);
		recorder = new JulesVanobbergenRecorder(mockGenerator);
	}

	public void testGetProjectActionWithNoLastBuildGivesNullAction() {
		AbstractProject mockProject = mock(AbstractProject.class);
		when(mockProject.getLastBuild()).thenReturn(null);
		assertNull(recorder.getProjectAction(mockProject));
	}

	public void testGetProjectActionHavingLastBuildGivesFricandelAction() {
		AbstractProject mockProject = mock(AbstractProject.class);
		Build mockBuild = mock(Build.class);

		when(mockProject.getLastBuild()).thenReturn(mockBuild);
		when(mockBuild.getResult()).thenReturn(Result.SUCCESS);
		when(mockGenerator.random()).thenReturn(
				"Il y a environ 800 sortes de bières brassées en Belgique.");

		Action action = recorder.getProjectAction(mockProject);

		assertTrue(action instanceof FricandelAction);
		assertEquals(Style.THUMB_UP, ((FricandelAction) action).getStyle());
		assertNotNull(((FricandelAction) action).getFact());
	}

	public void testPerformWithFailureResultAddsFricandelActionWithBadAssStyleAndExpectedFact()
			throws Exception {
		List<Action> actions = new ArrayList<Action>();
		AbstractBuild mockBuild = mock(AbstractBuild.class);
		when(mockBuild.getResult()).thenReturn(Result.FAILURE);
		when(mockBuild.getActions()).thenReturn(actions);

		when(mockGenerator.random()).thenReturn(
				"Il y a environ 800 sortes de bières brassées en Belgique.");

		assertEquals(0, actions.size());

		recorder.perform(mockBuild, mock(Launcher.class),
				mock(BuildListener.class));

		assertEquals(1, actions.size());
		assertTrue(actions.get(0) instanceof FricandelAction);
		assertEquals(Style.BAD_ASS, ((FricandelAction) actions.get(0))
				.getStyle());
		assertEquals("Il y a environ 800 sortes de bières brassées en Belgique.",
				((FricandelAction) actions.get(0)).getFact());
	}
}
