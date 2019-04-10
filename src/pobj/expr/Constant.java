package pobj.expr;

public class Constant implements Expression {
	
	private int c;
	
	public Constant(int c) {
		this.c = c;
	}
	
	public Constant() {
		this.c = 0;
	}
	
	public int getValue() {
		return this.c;
	}
	
	/*public boolean equals(Object o) {
		if (o instanceof Constant) {
			Constant tmp = (Constant) (o);
			return tmp.getValue() == this.getValue();
		}
		return ((Integer) c).equals(o);
	}*/
	
	public boolean equals(Object o) {
		if(!(o instanceof Constant)) return false;
		Constant tmp = (Constant) (o);
		return this.c == tmp.getValue();
	}
	
	public String toString() {
		return Integer.toString(this.c);
	}
	
	public int eval() {
		return this.c;
	}

	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}

}
