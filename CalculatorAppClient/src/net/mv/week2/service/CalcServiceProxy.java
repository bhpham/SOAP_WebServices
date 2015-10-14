package net.mv.week2.service;

public class CalcServiceProxy implements net.mv.week2.service.CalcService {
  private String _endpoint = null;
  private net.mv.week2.service.CalcService calcService = null;
  
  public CalcServiceProxy() {
    _initCalcServiceProxy();
  }
  
  public CalcServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcServiceProxy();
  }
  
  private void _initCalcServiceProxy() {
    try {
      calcService = (new net.mv.week2.service.CalcServiceServiceLocator()).getCalcService();
      if (calcService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calcService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calcService != null)
      ((javax.xml.rpc.Stub)calcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.mv.week2.service.CalcService getCalcService() {
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService;
  }
  
  public double add(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException{
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService.add(calc);
  }
  
  public double divide(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException{
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService.divide(calc);
  }
  
  public double subtract(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException{
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService.subtract(calc);
  }
  
  public double multiply(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException{
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService.multiply(calc);
  }
  
  public net.mv.week2.domain.Calc handleCalculation(net.mv.week2.domain.Calc calc) throws java.rmi.RemoteException{
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService.handleCalculation(calc);
  }
  
  
}