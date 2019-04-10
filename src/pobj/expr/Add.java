package pobj.expr;

public class Add extends BinOp implements Expression {
	
	public Add(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	/*public Expression getLeft() {
		return this.left;
	}
	
	public Expression getRight() {
		return this.right;
	}*/
	
	public String toString() {
		return "( "+this.left.toString()+" + "+this.right.toString()+" )";
	}
	
	public int eval() {
		return this.right.eval() + this.left.eval();
	}

	
	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}

}
