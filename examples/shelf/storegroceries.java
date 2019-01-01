import JSHOP2.*;

class Operator0 extends Operator
{
	public Operator0()
	{
		super(new Predicate(0, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[2];
		delIn[0] = new DelAddAtomic(new Predicate(0, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		delIn[1] = new DelAddAtomic(new Predicate(1, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(2, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(2)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator1 extends Operator
{
	public Operator1()
	{
		super(new Predicate(1, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(3, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(4, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(3, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator2 extends Operator
{
	public Operator2()
	{
		super(new Predicate(2, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(2, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(1, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		addIn[1] = new DelAddAtomic(new Predicate(0, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionNil(2)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator3 extends Operator
{
	public Operator3()
	{
		super(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(5, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(5, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(2), TermList.NIL))));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(5, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator4 extends Operator
{
	public Operator4()
	{
		super(new Predicate(4, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(6, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[1];
		addIn[0] = new DelAddAtomic(new Predicate(7, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(6, 1, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Operator5 extends Operator
{
	public Operator5()
	{
		super(new Predicate(5, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), -1, -1, new TermNumber(1.0));


		DelAddElement[] delIn = new DelAddElement[1];
		delIn[0] = new DelAddAtomic(new Predicate(8, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setDel(delIn);

		DelAddElement[] addIn = new DelAddElement[2];
		addIn[0] = new DelAddAtomic(new Predicate(9, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		addIn[1] = new DelAddProtection(new Predicate(9, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));

		setAdd(addIn);
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		p = (new PreconditionAtomic(new Predicate(8, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier)).setComparator(null);
		p.reset();

		return p;
	}
}

class Precondition0 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition0(Term[] unifier)
	{
		p = new Precondition[4];
		p[1] = new PreconditionAtomic(new Predicate(5, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(4, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), unifier);
		b = new Term[4][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[3] == null)
		{
			boolean b2changed = false;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding();
					if (b[1] == null)
						return null;
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding();
				if (b[2] == null) b[1] = null;
				b2changed = true;
			}
			if ( b2changed ) {
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
			}
			b[3] = p[3].nextBinding();
			if (b[3] == null) b[2] = null;
		}

		Term[] retVal = Term.merge(b, 4);
		b[3] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}
}

class Precondition1 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition1(Term[] unifier)
	{
		p = new Precondition[4];
		p[1] = new PreconditionAtomic(new Predicate(5, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		p[2] = new PreconditionAtomic(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier);
		p[3] = new PreconditionAtomic(new Predicate(3, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), unifier);
		b = new Term[4][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[3] == null)
		{
			boolean b2changed = false;
			while (b[2] == null)
			{
				boolean b1changed = false;
				while (b[1] == null)
				{
					b[1] = p[1].nextBinding();
					if (b[1] == null)
						return null;
					b1changed = true;
				}
				if ( b1changed ) {
					p[2].reset();
					p[2].bind(Term.merge(b, 2));
				}
				b[2] = p[2].nextBinding();
				if (b[2] == null) b[1] = null;
				b2changed = true;
			}
			if ( b2changed ) {
				p[3].reset();
				p[3].bind(Term.merge(b, 3));
			}
			b[3] = p[3].nextBinding();
			if (b[3] == null) b[2] = null;
		}

		Term[] retVal = Term.merge(b, 4);
		b[3] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
	}
}

class Method0 extends Method
{
	public Method0()
	{
		super(new Predicate(0, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(3, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), false, true));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(6, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(0, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, true));
		retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), TermList.NIL)))), false, true));
		retVal.subtasks[5] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(3), TermList.NIL))), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition0(unifier)).setComparator(null);
			break;
			case 1:
				p = (new Precondition1(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "branch1";
			case 1: return "branch2";
			default: return null;
		}
	}
}

class Method1 extends Method
{
	public Method1()
	{
		super(new Predicate(1, 2, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[1];

		subsIn[0] = createTaskList0();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(2, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(4, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(4, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), false, true));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionNil(2)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "Method1Branch0";
			default: return null;
		}
	}
}

class Precondition2 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition2(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(7, 6, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(7, 6, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(5, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(4, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Precondition3 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition3(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(7, 6, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(7, 6, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(5, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(3, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Precondition4 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition4(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(6, 6, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(6, 6, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(5, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(4, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Precondition5 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition5(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(6, 6, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(6, 6, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(5, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(3, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Method2 extends Method
{
	public Method2()
	{
		super(new Predicate(4, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), TermList.NIL))))));
		TaskList[] subsIn = new TaskList[4];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();
		subsIn[2] = createTaskList2();
		subsIn[3] = createTaskList3();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(3, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(6, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[5] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));

		return retVal;
	}

	TaskList createTaskList2()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));

		return retVal;
	}

	TaskList createTaskList3()
	{
		TaskList retVal;

		retVal = new TaskList(7, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 6, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(1, 6, new TermList(TermVariable.getVariable(5), TermList.NIL)), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, true));
		retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(2, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[5] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(4), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[6] = new TaskList(new TaskAtom(new Predicate(3, 6, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition2(unifier)).setComparator(null);
			break;
			case 1:
				p = (new Precondition3(unifier)).setComparator(null);
			break;
			case 2:
				p = (new Precondition4(unifier)).setComparator(null);
			break;
			case 3:
				p = (new Precondition5(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "branch1";
			case 1: return "branch2";
			case 2: return "branch3";
			case 3: return "branch4";
			default: return null;
		}
	}
}

class Precondition6 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition6(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(7, 7, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(7, 7, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(5, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(4, 7, new TermList(TermVariable.getVariable(6), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Precondition7 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition7(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(7, 7, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(7, 7, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(5, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(3, 7, new TermList(TermVariable.getVariable(6), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Precondition8 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition8(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(6, 7, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(6, 7, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(5, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(4, 7, new TermList(TermVariable.getVariable(6), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Precondition9 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition9(Term[] unifier)
	{
		p = new Precondition[5];
		p[1] = new PreconditionAtomic(new Predicate(6, 7, new TermList(TermVariable.getVariable(0), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(6, 7, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[3] = new PreconditionAtomic(new Predicate(5, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier);
		p[4] = new PreconditionAtomic(new Predicate(3, 7, new TermList(TermVariable.getVariable(6), TermList.NIL)), unifier);
		b = new Term[5][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[4] == null)
		{
			boolean b3changed = false;
			while (b[3] == null)
			{
				boolean b2changed = false;
				while (b[2] == null)
				{
					boolean b1changed = false;
					while (b[1] == null)
					{
						b[1] = p[1].nextBinding();
						if (b[1] == null)
							return null;
						b1changed = true;
					}
					if ( b1changed ) {
						p[2].reset();
						p[2].bind(Term.merge(b, 2));
					}
					b[2] = p[2].nextBinding();
					if (b[2] == null) b[1] = null;
					b2changed = true;
				}
				if ( b2changed ) {
					p[3].reset();
					p[3].bind(Term.merge(b, 3));
				}
				b[3] = p[3].nextBinding();
				if (b[3] == null) b[2] = null;
				b3changed = true;
			}
			if ( b3changed ) {
				p[4].reset();
				p[4].bind(Term.merge(b, 4));
			}
			b[4] = p[4].nextBinding();
			if (b[4] == null) b[3] = null;
		}

		Term[] retVal = Term.merge(b, 5);
		b[4] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		p[3].reset();
		p[4].reset();
		b[1] = null;
		b[2] = null;
		b[3] = null;
		b[4] = null;
	}
}

class Method3 extends Method
{
	public Method3()
	{
		super(new Predicate(6, 7, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(4), TermList.NIL)))))));
		TaskList[] subsIn = new TaskList[4];

		subsIn[0] = createTaskList0();
		subsIn[1] = createTaskList1();
		subsIn[2] = createTaskList2();
		subsIn[3] = createTaskList3();

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(4, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 7, new TermList(TermVariable.getVariable(4), TermList.NIL)), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 7, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));

		return retVal;
	}

	TaskList createTaskList1()
	{
		TaskList retVal;

		retVal = new TaskList(7, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 7, new TermList(TermVariable.getVariable(4), TermList.NIL)), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(1, 7, new TermList(TermVariable.getVariable(6), TermList.NIL)), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, true));
		retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(2, 7, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[5] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[6] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));

		return retVal;
	}

	TaskList createTaskList2()
	{
		TaskList retVal;

		retVal = new TaskList(5, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 7, new TermList(TermVariable.getVariable(4), TermList.NIL)), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(1, 7, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(2, 7, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));

		return retVal;
	}

	TaskList createTaskList3()
	{
		TaskList retVal;

		retVal = new TaskList(8, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(1, 7, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(5, 7, new TermList(TermVariable.getVariable(4), TermList.NIL)), false, false));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[3] = new TaskList(new TaskAtom(new Predicate(1, 7, new TermList(TermVariable.getVariable(6), TermList.NIL)), false, true));
		retVal.subtasks[4] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL)))), false, true));
		retVal.subtasks[5] = new TaskList(new TaskAtom(new Predicate(2, 7, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, false));
		retVal.subtasks[6] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(5), new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL)))), false, true));
		retVal.subtasks[7] = new TaskList(new TaskAtom(new Predicate(3, 7, new TermList(TermVariable.getVariable(3), new TermList(TermVariable.getVariable(2), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition6(unifier)).setComparator(null);
			break;
			case 1:
				p = (new Precondition7(unifier)).setComparator(null);
			break;
			case 2:
				p = (new Precondition8(unifier)).setComparator(null);
			break;
			case 3:
				p = (new Precondition9(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "branch1";
			case 1: return "branch2";
			case 2: return "branch3";
			case 3: return "branch4";
			default: return null;
		}
	}
}

class Method4 extends Method
{
	public Method4()
	{
		super(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = TaskList.empty;

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(3, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier)).setComparator(null);
			break;
			case 1:
				p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), unifier), 3)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "branch1";
			case 1: return "branch2";
			default: return null;
		}
	}
}

class Method5 extends Method
{
	public Method5()
	{
		super(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = TaskList.empty;

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(3, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(0, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(2, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, true));
		retVal.subtasks[2] = new TaskList(new TaskAtom(new Predicate(3, 3, new TermList(TermVariable.getVariable(0), new TermList(TermVariable.getVariable(1), TermList.NIL))), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier)).setComparator(null);
			break;
			case 1:
				p = (new PreconditionNegation(new PreconditionAtomic(new Predicate(1, 3, new TermList(TermVariable.getVariable(2), new TermList(TermVariable.getVariable(0), TermList.NIL))), unifier), 3)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "branch1";
			case 1: return "branch2";
			default: return null;
		}
	}
}

class Precondition10 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition10(Term[] unifier)
	{
		p = new Precondition[3];
		p[1] = new PreconditionAtomic(new Predicate(10, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(8, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[3][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[2] == null)
		{
			boolean b1changed = false;
			while (b[1] == null)
			{
				b[1] = p[1].nextBinding();
				if (b[1] == null)
					return null;
				b1changed = true;
			}
			if ( b1changed ) {
				p[2].reset();
				p[2].bind(Term.merge(b, 2));
			}
			b[2] = p[2].nextBinding();
			if (b[2] == null) b[1] = null;
		}

		Term[] retVal = Term.merge(b, 3);
		b[2] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		b[1] = null;
		b[2] = null;
	}
}

class Precondition11 extends Precondition
{
	Precondition[] p;
	Term[][] b;

	public Precondition11(Term[] unifier)
	{
		p = new Precondition[3];
		p[1] = new PreconditionAtomic(new Predicate(10, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		p[2] = new PreconditionAtomic(new Predicate(9, 2, new TermList(TermVariable.getVariable(1), TermList.NIL)), unifier);
		b = new Term[3][];
		b[0] = unifier;
		b[0] = Term.merge( b, 1 );

		setFirst(false);
	}

	public void bind(Term[] binding)
	{
		b[0] = binding;
		b[0] = Term.merge( b, 1 );
		p[1].bind(binding);
		b[1] = null;
		b[2] = null;
	}

	protected Term[] nextBindingHelper()
	{
		while (b[2] == null)
		{
			boolean b1changed = false;
			while (b[1] == null)
			{
				b[1] = p[1].nextBinding();
				if (b[1] == null)
					return null;
				b1changed = true;
			}
			if ( b1changed ) {
				p[2].reset();
				p[2].bind(Term.merge(b, 2));
			}
			b[2] = p[2].nextBinding();
			if (b[2] == null) b[1] = null;
		}

		Term[] retVal = Term.merge(b, 3);
		b[2] = null;
		return retVal;
	}

	protected void resetHelper()
	{
		p[1].reset();
		p[2].reset();
		b[1] = null;
		b[2] = null;
	}
}

class Method6 extends Method
{
	public Method6()
	{
		super(new Predicate(5, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)));
		TaskList[] subsIn = new TaskList[2];

		subsIn[0] = createTaskList0();
		subsIn[1] = TaskList.empty;

		setSubs(subsIn);
	}

	TaskList createTaskList0()
	{
		TaskList retVal;

		retVal = new TaskList(2, true);
		retVal.subtasks[0] = new TaskList(new TaskAtom(new Predicate(5, 2, new TermList(TermVariable.getVariable(1), new TermList(TermVariable.getVariable(0), TermList.NIL))), false, true));
		retVal.subtasks[1] = new TaskList(new TaskAtom(new Predicate(5, 2, new TermList(TermVariable.getVariable(0), TermList.NIL)), false, false));

		return retVal;
	}

	public Precondition getIterator(Term[] unifier, int which)
	{
		Precondition p;

		switch (which)
		{
			case 0:
				p = (new Precondition10(unifier)).setComparator(null);
			break;
			case 1:
				p = (new Precondition11(unifier)).setComparator(null);
			break;
			default:
				return null;
		}

		p.reset();

		return p;
	}

	public String getLabel(int which)
	{
		switch (which)
		{
			case 0: return "branch1";
			case 1: return "branch2";
			default: return null;
		}
	}
}

public class storegroceries extends Domain
{
	public storegroceries()
	{
		TermVariable.initialize(7);

		constants = new String[11];
		constants[0] = "clear";
		constants[1] = "on";
		constants[2] = "holding";
		constants[3] = "door-closed";
		constants[4] = "door-open";
		constants[5] = "robot-at";
		constants[6] = "unknown-location";
		constants[7] = "known-location";
		constants[8] = "uncategorized";
		constants[9] = "categorized";
		constants[10] = "object";

		compoundTasks = new String[7];
		compoundTasks[0] = "move-known-object";
		compoundTasks[1] = "locate-table-and-cupboard";
		compoundTasks[2] = "load-tray";
		compoundTasks[3] = "unload-tray";
		compoundTasks[4] = "move-known-objects";
		compoundTasks[5] = "categorize";
		compoundTasks[6] = "move-uncategorized-objects";

		primitiveTasks = new String[6];
		primitiveTasks[0] = "!pickup";
		primitiveTasks[1] = "!open-door";
		primitiveTasks[2] = "!putdown";
		primitiveTasks[3] = "!move";
		primitiveTasks[4] = "!locate";
		primitiveTasks[5] = "!perceive";

		methods = new Method[7][];

		methods[0] = new Method[1];
		methods[0][0] = new Method0();

		methods[1] = new Method[1];
		methods[1][0] = new Method1();

		methods[2] = new Method[1];
		methods[2][0] = new Method4();

		methods[3] = new Method[1];
		methods[3][0] = new Method5();

		methods[4] = new Method[1];
		methods[4][0] = new Method2();

		methods[5] = new Method[1];
		methods[5][0] = new Method6();

		methods[6] = new Method[1];
		methods[6][0] = new Method3();


		ops = new Operator[6][];

		ops[0] = new Operator[1];
		ops[0][0] = new Operator0();

		ops[1] = new Operator[1];
		ops[1][0] = new Operator1();

		ops[2] = new Operator[1];
		ops[2][0] = new Operator2();

		ops[3] = new Operator[1];
		ops[3][0] = new Operator3();

		ops[4] = new Operator[1];
		ops[4][0] = new Operator4();

		ops[5] = new Operator[1];
		ops[5][0] = new Operator5();

		axioms = new Axiom[11][];

		axioms[0] = new Axiom[0];

		axioms[1] = new Axiom[0];

		axioms[2] = new Axiom[0];

		axioms[3] = new Axiom[0];

		axioms[4] = new Axiom[0];

		axioms[5] = new Axiom[0];

		axioms[6] = new Axiom[0];

		axioms[7] = new Axiom[0];

		axioms[8] = new Axiom[0];

		axioms[9] = new Axiom[0];

		axioms[10] = new Axiom[0];

	}
}