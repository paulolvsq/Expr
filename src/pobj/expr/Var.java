package pobj.expr;

public class Var implements Expression {

	private final String nom;

	public Var(String nom) {
		this.nom = nom;
	}

	public String getName() {
		return this.nom;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Var)) return false;
		Var tmp = (Var) (o);
		return tmp.getName().equals(this.nom);
	}
	
	public String toString() {
		return this.nom;
	}
	
	public int eval() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}

}
