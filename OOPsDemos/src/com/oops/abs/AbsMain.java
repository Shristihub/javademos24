package com.oops.abs;

public class AbsMain {

	public static void main(String[] args) {

		Bank bank = new Branch1();
		bank.admin();
		bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		System.out.println(bank.num);
		//own method of branch1
		Branch1 branch1 =(Branch1)bank;
		branch1.payBills();
		System.out.println(branch1.num);
		
		System.out.println();
		bank  = new SubBranch();
		bank.admin();
		bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		
		SubBranch sub = (SubBranch)bank;
		sub.chequePayment(); // own method of sub
		sub.showBills(); // method of branch2
		
		Branch2 branch2 = (Branch2) bank;      //new SubBranch()
		branch2.showBills();
	}

}
