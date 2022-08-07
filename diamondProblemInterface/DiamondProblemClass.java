package diamondProblemInterface;

import defaultMethodInterface.InterfaceDemoImpl3;

public class DiamondProblemClass implements DiamondProblemInterface1, DiamondProblemInterface2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DiamondProblemInterface1.super.m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamondProblemClass default1=new DiamondProblemClass();
		default1.m1();
	}

}
