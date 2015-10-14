package net.mv.week2.service;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import net.mv.week2.domain.Calc;

public class CalculatorAppDemo {

	public static void main(String[] args) {
		try {
			CalcService calcService = new CalcServiceServiceLocator().getCalcService();
		
			Calc calc = new Calc();
			
			calc.setNum1(42);
			calc.setNum2(50);
			calc.setOp("add");
			
			double result = calcService.add(calc);
			System.out.println(result);
			 
		
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
		}
		
		
	}

}
