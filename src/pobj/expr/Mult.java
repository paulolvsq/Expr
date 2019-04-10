package pobj.expr;

public class Mult extends BinOp implements Expression {
	
	public Mult(Expression left, Expression right) {
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
		return this.left.toString()+" * "+this.right.toString();
	}
	
	public int eval() {
		return this.left.eval() * this.right.eval();
	}

	@Override
	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}

}
