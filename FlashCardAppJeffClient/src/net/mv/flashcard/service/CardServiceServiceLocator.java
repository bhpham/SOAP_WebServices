/**
 * CardServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.mv.flashcard.service;

public class CardServiceServiceLocator extends org.apache.axis.client.Service implements net.mv.flashcard.service.CardServiceService {

    public CardServiceServiceLocator() {
    }


    public CardServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CardServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CardService
    private java.lang.String CardService_address = "http://localhost:7001/FlashCardAppJeff/services/CardService";

    public java.lang.String getCardServiceAddress() {
        return CardService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CardServiceWSDDServiceName = "CardService";

    public java.lang.String getCardServiceWSDDServiceName() {
        return CardServiceWSDDServiceName;
    }

    public void setCardServiceWSDDServiceName(java.lang.String name) {
        CardServiceWSDDServiceName = name;
    }

    public net.mv.flashcard.service.CardService getCardService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CardService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCardService(endpoint);
    }

    public net.mv.flashcard.service.CardService getCardService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.mv.flashcard.service.CardServiceSoapBindingStub _stub = new net.mv.flashcard.service.CardServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCardServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCardServiceEndpointAddress(java.lang.String address) {
        CardService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.mv.flashcard.service.CardService.class.isAssignableFrom(serviceEndpointInterface)) {
                net.mv.flashcard.service.CardServiceSoapBindingStub _stub = new net.mv.flashcard.service.CardServiceSoapBindingStub(new java.net.URL(CardService_address), this);
                _stub.setPortName(getCardServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CardService".equals(inputPortName)) {
            return getCardService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.flashcard.mv.net", "CardServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.flashcard.mv.net", "CardService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CardService".equals(portName)) {
            setCardServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
