/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.mv.week5.webservice.soap;

public interface HelloWorld extends java.rmi.Remote {
    public java.util.Calendar getTime() throws java.rmi.RemoteException;
    public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException;
}
