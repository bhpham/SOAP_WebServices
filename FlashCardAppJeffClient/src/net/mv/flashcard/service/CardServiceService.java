/**
 * CardServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.mv.flashcard.service;

public interface CardServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCardServiceAddress();

    public net.mv.flashcard.service.CardService getCardService() throws javax.xml.rpc.ServiceException;

    public net.mv.flashcard.service.CardService getCardService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
