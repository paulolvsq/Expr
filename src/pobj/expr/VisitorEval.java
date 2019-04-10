package pobj.expr;

public class VisitorEval implements IVisitor<Integer> {
	
	public Integer visit(Constant c) {
		return c.eval();
	}
	
	public Integer visit(Var v) {
		return v.eval();
	}
	
	public Integer visit(Add a) {
		Integer i1 = a.getLeft().accept(this);
		Integer i2 = a.getRight().accept(this);
		return i1 + i2;
	}
	
	public Integer visit(Mult a) {
		Integer i1 = a.getLeft().accept(this);
		Integer i2 = a.getRight().accept(this);
		return i1 * i2;
	}

}
