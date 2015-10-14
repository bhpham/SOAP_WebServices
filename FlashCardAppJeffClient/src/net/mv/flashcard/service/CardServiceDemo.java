package net.mv.flashcard.service;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import net.mv.flashcard.domain.Card;
import net.mv.flashcard.domain.CardUser;

public class CardServiceDemo {

	public static void main(String[] args) {
		
		try {
			CardService cs = new CardServiceServiceLocator().getCardService();
			
			CardUser user = new CardUser();
			
			user.setUsername("binh");
			user.setPassword("Seattle113");
			user.setUserId(24);
			
			Object[] cards = cs.getAllCard(user);
			
			System.out.println(Arrays.toString(cards));
			
			
			
			for (Object card : cards) {
				System.out.println(((Card)card).getQuestion());
			}
			
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
