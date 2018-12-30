import java.util.LinkedList;
import JSHOP2.*;

public class problem1
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[12];

		problemConstants[0] = "a1";
		problemConstants[1] = "object";
		problemConstants[2] = "c1";
		problemConstants[3] = "cupboard";
		problemConstants[4] = "d1";
		problemConstants[5] = "door";
		problemConstants[6] = "s1";
		problemConstants[7] = "shelf";
		problemConstants[8] = "t1";
		problemConstants[9] = "table";
		problemConstants[10] = "r1";
		problemConstants[11] = "robot";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(8), TermList.NIL)));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(12), TermList.NIL)));
		s.add(new Predicate(5, 0, new TermList(TermConstant.getConstant(18), new TermList(TermConstant.getConstant(16), TermList.NIL))));
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(20);

		Domain d = new storegroceries();

		d.setProblemConstants(defineConstants());

		State s = new State(8, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 0, new TermList(TermConstant.getConstant(8), new TermList(TermConstant.getConstant(16), new TermList(TermConstant.getConstant(10), new TermList(TermConstant.getConstant(14), TermList.NIL))))), false, false));

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
