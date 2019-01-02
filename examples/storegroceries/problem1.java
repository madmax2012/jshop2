import java.util.LinkedList;
import JSHOP2.*;

public class problem1
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[11];

		problemConstants[0] = "a1";
		problemConstants[1] = "c1";
		problemConstants[2] = "cupboard";
		problemConstants[3] = "d1";
		problemConstants[4] = "door";
		problemConstants[5] = "s1";
		problemConstants[6] = "shelf";
		problemConstants[7] = "t1";
		problemConstants[8] = "table";
		problemConstants[9] = "r1";
		problemConstants[10] = "robot";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(10, 0, new TermList(TermConstant.getConstant(11), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(11), new TermList(TermConstant.getConstant(18), TermList.NIL))));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(14), TermList.NIL)));
		s.add(new Predicate(5, 0, new TermList(TermConstant.getConstant(20), new TermList(TermConstant.getConstant(18), TermList.NIL))));
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(22);

		Domain d = new storegroceries();

		d.setProblemConstants(defineConstants());

		State s = new State(11, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 0, new TermList(TermConstant.getConstant(11), new TermList(TermConstant.getConstant(18), new TermList(TermConstant.getConstant(12), new TermList(TermConstant.getConstant(16), TermList.NIL))))), false, false));

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
