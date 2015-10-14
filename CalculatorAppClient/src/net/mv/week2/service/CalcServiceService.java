/**
 * CalcServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.mv.week2.service;

public interface CalcServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCalcServiceAddress();

    public net.mv.week2.service.CalcService getCalcService() throws javax.xml.rpc.ServiceException;

    public net.mv.week2.service.CalcService getCalcService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
