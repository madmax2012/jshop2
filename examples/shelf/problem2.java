import java.util.LinkedList;
import JSHOP2.*;

public class problem2
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[15];

		problemConstants[0] = "a1";
		problemConstants[1] = "object";
		problemConstants[2] = "a2";
		problemConstants[3] = "c1";
		problemConstants[4] = "cupboard";
		problemConstants[5] = "d1";
		problemConstants[6] = "door";
		problemConstants[7] = "s1";
		problemConstants[8] = "shelf";
		problemConstants[9] = "t1";
		problemConstants[10] = "table";
		problemConstants[11] = "r1";
		problemConstants[12] = "robot";
		problemConstants[13] = "tray1";
		problemConstants[14] = "tray";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(8), new TermList(TermConstant.getConstant(17), TermList.NIL))));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(17), TermList.NIL))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(13), TermList.NIL)));
		s.add(new Predicate(5, 0, new TermList(TermConstant.getConstant(19), new TermList(TermConstant.getConstant(17), TermList.NIL))));
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(23);

		Domain d = new storegroceries();

		d.setProblemConstants(defineConstants());

		State s = new State(8, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(3, 0, new TermList(TermConstant.getConstant(17), new TermList(TermConstant.getConstant(11), new TermList(TermConstant.getConstant(15), new TermList(TermConstant.getConstant(21), TermList.NIL))))), false, false));

		thread = new SolverThread(tl, 2147483647);
		thread.start();

		try {
			while (thread.isAlive())
				Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		returnedPlans.addAll( thread.getPlans() );

		return returnedPlans;
	}

	public static LinkedList<Predicate> getFirstPlanOps() {
		return getPlans().getFirst().getOps();
	}
}