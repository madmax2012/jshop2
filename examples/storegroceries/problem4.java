import java.util.LinkedList;
import JSHOP2.*;

public class problem4
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[18];

		problemConstants[0] = "a1";
		problemConstants[1] = "a2";
		problemConstants[2] = "a3";
		problemConstants[3] = "camera1";
		problemConstants[4] = "camera";
		problemConstants[5] = "c1";
		problemConstants[6] = "cupboard";
		problemConstants[7] = "d1";
		problemConstants[8] = "door";
		problemConstants[9] = "s1";
		problemConstants[10] = "s2";
		problemConstants[11] = "t1";
		problemConstants[12] = "table";
		problemConstants[13] = "r1";
		problemConstants[14] = "robot";
		problemConstants[15] = "tray1";
		problemConstants[16] = "tray";
		problemConstants[17] = "unlabeled";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(18, 0, new TermList(TermConstant.getConstant(23), TermList.NIL)));
		s.add(new Predicate(18, 0, new TermList(TermConstant.getConstant(24), TermList.NIL)));
		s.add(new Predicate(18, 0, new TermList(TermConstant.getConstant(25), TermList.NIL)));
		s.add(new Predicate(17, 0, new TermList(TermConstant.getConstant(32), TermList.NIL)));
		s.add(new Predicate(17, 0, new TermList(TermConstant.getConstant(33), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(34), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(28), TermList.NIL)));
		s.add(new Predicate(15, 0, new TermList(TermConstant.getConstant(32), TermList.NIL)));
		s.add(new Predicate(16, 0, new TermList(TermConstant.getConstant(33), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(23), new TermList(TermConstant.getConstant(34), TermList.NIL))));
		s.add(new Predicate(19, 0, new TermList(TermConstant.getConstant(23), TermList.NIL)));
		s.add(new Predicate(20, 0, new TermList(TermConstant.getConstant(23), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(24), new TermList(TermConstant.getConstant(34), TermList.NIL))));
		s.add(new Predicate(21, 0, new TermList(TermConstant.getConstant(24), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(25), new TermList(TermConstant.getConstant(34), TermList.NIL))));
		s.add(new Predicate(22, 0, new TermList(TermConstant.getConstant(25), TermList.NIL)));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(30), TermList.NIL)));
		s.add(new Predicate(5, 0, new TermList(TermConstant.getConstant(36), new TermList(TermConstant.getConstant(34), TermList.NIL))));
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(41);

		Domain d = new storegroceries();

		d.setProblemConstants(defineConstants());

		State s = new State(23, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(10, 0, new TermList(TermConstant.getConstant(34), new TermList(TermConstant.getConstant(28), new TermList(TermConstant.getConstant(32), new TermList(TermConstant.getConstant(38), new TermList(TermConstant.getConstant(26), TermList.NIL)))))), false, false));

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