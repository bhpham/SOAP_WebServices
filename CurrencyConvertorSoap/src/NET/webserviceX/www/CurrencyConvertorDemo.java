package NET.webserviceX.www;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class CurrencyConvertorDemo {

	public static void main(String[] args) {
		
		CurrencyConvertor convertor = new CurrencyConvertorLocator();
		try {
			
			CurrencyConvertorSoap msg = convertor.getCurrencyConvertorSoap();
			// Invoke the method
	        double rate = msg.conversionRate(Currency.USD, Currency.VND);
	 
	        System.out.println("USD to VND rate = " + rate);
	        
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
		}
		

	}

}
