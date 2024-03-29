package pobj.expr;

public class Question10 {
	
	public static boolean isConstant(Expression e) {
		return e.accept(new VisitorConstant());
	}
	
	public static int evalConstantExpression(Expression e) {
		return e.accept(new VisitorEval());
	}

}
