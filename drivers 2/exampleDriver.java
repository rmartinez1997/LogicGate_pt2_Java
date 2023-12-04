package drivers;
import gates.*;
public class exampleDriver {

	public static void main(String[] args)
	{
	AndGate and = new AndGate();
	OrGate or = new OrGate();
	OrGate orsec = new OrGate();
	XorGate xor = new XorGate();
	XorGate xorfinal = new XorGate();
	
	AndGate andsec = new AndGate();
	AndGate andsec2 = new AndGate();
	
	
	//first four
	and.addInput(true);
	and.addInput(true);
	
	System.out.println("And gate (true,true) returns "+ and.calculate());
	
	xor.addInput(true);
	xor.addInput(false);
	System.out.println("Xor gate (true,false) returns "+ xor.process());
	
	System.out.println("Not gate for (true,true) will return (" + NotGate.process(and.calculate())+","+NotGate.process(xor.process())+")");
	
	or.addInput(NotGate.process(and.calculate()));
	or.addInput(NotGate.process(xor.process()));
	System.out.println("Or gate (false,false) returns "+ or.process());
	
	//second four
	
	andsec.addInput(true);			//and gate false
	andsec.addInput(false);
	System.out.println("And gate for (True,False) returns " +andsec.calculate());
	
	andsec2.addInput(false);		//and gate false
	andsec2.addInput(true);
	System.out.println("And gate for (False,True) returns " +andsec2.calculate());
	
	
	
	orsec.addInput(NotGate.process(andsec.calculate()));	//add input of and into or gate
	orsec.addInput(NotGate.process(andsec2.calculate()));	//and input of and1 into or gate
	
	System.out.println("\nOr gate for (True,True) returns "+orsec.process());	//true 
	System.out.println("Not gate for (True,True) returns "+ NotGate.process(orsec.process()));
	
	//circuit from first or and second or gate to xor gate
	
	xorfinal.addInput(NotGate.process(xor.process()));
	xorfinal.addInput(NotGate.process(orsec.process()));
	System.out.println("Xor gate for false,xorfinal.process();
	
	
	}
}
