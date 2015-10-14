/**
 * CardService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.mv.flashcard.service;

public interface CardService extends java.rmi.Remote {
    public java.lang.Object[] getAllCard(net.mv.flashcard.domain.CardUser user) throws java.rmi.RemoteException;
    public void saveCard(net.mv.flashcard.domain.Card card) throws java.rmi.RemoteException;
    public net.mv.flashcard.domain.Card getRandomCard(net.mv.flashcard.domain.CardUser user) throws java.rmi.RemoteException;
}
