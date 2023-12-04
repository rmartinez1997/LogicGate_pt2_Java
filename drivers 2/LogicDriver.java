package drivers;

import gates.AndGate;
import gates.NotGate;
import gates.OrGate;
import gates.XorGate;

public class LogicDriver {

	public static void main(String[] args) {
		AndGate and=new AndGate();
		AndGate and2 = new AndGate();
		AndGate andex = new AndGate();
		OrGate or = new OrGate();
		OrGate orex = new OrGate();
		XorGate xor = new XorGate();
				
		boolean a = true;
		boolean b = false;
		boolean c = false;
		boolean d = true;
		
		
		xor.addInput(a);
		xor.addInput(b);
		System.out.println("Xor Gate for (true,false) returns " +xor.process());
		
		xor.addInput(c);
		System.out.println("Xor Gate for (true,false,false) returns "+xor.process());
		xor.addInput(d);
		System.out.println("Xor Gate for (true,false,false,true) returns "+xor.process());
		
		andex.addInput(a);
		andex.addInput(d);
		System.out.println("\nAnd gate for (True,True) returns " +andex.calculate());
		andex.addInput(b);
		andex.addInput(c);
		System.out.println("And gate for (True,True,False,False) returns " +andex.calculate());
		
		
		orex.addInput(b);
		orex.addInput(c);
		System.out.println("\nOr gate for (false,false) returns "+orex.process());
		orex.addInput(a);
		System.out.println("Or gate for (false,false,true) returns "+orex.process());

		
		System.out.println("\nNot gate if gate is true returns " + NotGate.process(a));
		System.out.println("Not gate if gate is false returns "+NotGate.process(b));
		
		//Logic Circuit problem
		
		System.out.println("\n\n Logic Curcuit--------");
		
		and.addInput(a);			//and gate false
		and.addInput(b);
		System.out.println("And gate for (True,False) returns " +and.calculate());
		
		and2.addInput(b);		//and gate false
		and2.addInput(a);
		System.out.println("And gate for (False,True) returns " +and2.calculate());
		
		
		
		or.addInput(NotGate.process(and.calculate()));	//add input of and into or gate
		or.addInput(NotGate.process(and2.calculate()));	//and input of and1 into or gate
		
		System.out.println("\nOr gate for (True,True) returns "+or.process());	//true 
		System.out.println("Not gate for (True,True) returns "+ NotGate.process(or.process()));
		

		
	}

}
