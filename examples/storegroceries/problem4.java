import java.util.LinkedList;
import JSHOP2.*;

public class problem4
{
	private static String[] defineConstants()
	{
		String[] problemConstants = new String[20];

		problemConstants[0] = "a1";
		problemConstants[1] = "a2";
		problemConstants[2] = "a3";
		problemConstants[3] = "a4";
		problemConstants[4] = "camera1";
		problemConstants[5] = "camera";
		problemConstants[6] = "c1";
		problemConstants[7] = "cupboard";
		problemConstants[8] = "d1";
		problemConstants[9] = "door";
		problemConstants[10] = "s1";
		problemConstants[11] = "s2";
		problemConstants[12] = "s3";
		problemConstants[13] = "t1";
		problemConstants[14] = "table";
		problemConstants[15] = "r1";
		problemConstants[16] = "robot";
		problemConstants[17] = "tray1";
		problemConstants[18] = "tray";
		problemConstants[19] = "unlabeled";

		return problemConstants;
	}

	private static void createState0(State s)	{
		s.add(new Predicate(21, 0, new TermList(TermConstant.getConstant(27), TermList.NIL)));
		s.add(new Predicate(21, 0, new TermList(TermConstant.getConstant(28), TermList.NIL)));
		s.add(new Predicate(21, 0, new TermList(TermConstant.getConstant(29), TermList.NIL)));
		s.add(new Predicate(21, 0, new TermList(TermConstant.getConstant(30), TermList.NIL)));
		s.add(new Predicate(20, 0, new TermList(TermConstant.getConstant(37), TermList.NIL)));
		s.add(new Predicate(20, 0, new TermList(TermConstant.getConstant(38), TermList.NIL)));
		s.add(new Predicate(20, 0, new TermList(TermConstant.getConstant(39), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(40), TermList.NIL)));
		s.add(new Predicate(6, 0, new TermList(TermConstant.getConstant(33), TermList.NIL)));
		s.add(new Predicate(17, 0, new TermList(TermConstant.getConstant(37), TermList.NIL)));
		s.add(new Predicate(18, 0, new TermList(TermConstant.getConstant(38), TermList.NIL)));
		s.add(new Predicate(19, 0, new TermList(TermConstant.getConstant(39), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(27), new TermList(TermConstant.getConstant(40), TermList.NIL))));
		s.add(new Predicate(22, 0, new TermList(TermConstant.getConstant(27), TermList.NIL)));
		s.add(new Predicate(23, 0, new TermList(TermConstant.getConstant(27), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(28), new TermList(TermConstant.getConstant(40), TermList.NIL))));
		s.add(new Predicate(24, 0, new TermList(TermConstant.getConstant(28), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(29), new TermList(TermConstant.getConstant(40), TermList.NIL))));
		s.add(new Predicate(25, 0, new TermList(TermConstant.getConstant(29), TermList.NIL)));
		s.add(new Predicate(1, 0, new TermList(TermConstant.getConstant(30), new TermList(TermConstant.getConstant(40), TermList.NIL))));
		s.add(new Predicate(26, 0, new TermList(TermConstant.getConstant(30), TermList.NIL)));
		s.add(new Predicate(3, 0, new TermList(TermConstant.getConstant(35), TermList.NIL)));
		s.add(new Predicate(5, 0, new TermList(TermConstant.getConstant(42), new TermList(TermConstant.getConstant(40), TermList.NIL))));
	}

	public static LinkedList<Plan> getPlans()
	{
		LinkedList<Plan> returnedPlans = new LinkedList<Plan>();
		TermConstant.initialize(47);

		Domain d = new storegroceries();

		d.setProblemConstants(defineConstants());

		State s = new State(27, d.getAxioms());

		JSHOP2.initialize(d, s);

		TaskList tl;
		SolverThread thread;

		createState0(s);

		tl = new TaskList(1, true);
		tl.subtasks[0] = new TaskList(new TaskAtom(new Predicate(10, 0, new TermList(TermConstant.getConstant(40), new TermList(TermConstant.getConstant(33), new TermList(TermConstant.getConstant(37), new TermList(TermConstant.getConstant(44), new TermList(TermConstant.getConstant(31), TermList.NIL)))))), false, false));

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