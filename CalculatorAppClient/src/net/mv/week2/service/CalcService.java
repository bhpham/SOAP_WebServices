/**
 * CalcService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.mv.week2.service;

public interface CalcService extends java.rmi.Remote {
    public double add(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException;
    public double divide(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException;
    public double subtract(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException;
    public double multiply(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException;
    public net.mv.week2.domain.Calc handleCalculation(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException;
}
