package net.mv.flashcard.service;

public class CardServiceProxy implements net.mv.flashcard.service.CardService {
  private String _endpoint = null;
  private net.mv.flashcard.service.CardService cardService = null;
  
  public CardServiceProxy() {
    _initCardServiceProxy();
  }
  
  public CardServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCardServiceProxy();
  }
  
  private void _initCardServiceProxy() {
    try {
      cardService = (new net.mv.flashcard.service.CardServiceServiceLocator()).getCardService();
      if (cardService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cardService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cardService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cardService != null)
      ((javax.xml.rpc.Stub)cardService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.mv.flashcard.service.CardService getCardService() {
    if (cardService == null)
      _initCardServiceProxy();
    return cardService;
  }
  
  public java.lang.Object[] getAllCard(net.mv.flashcard.domain.CardUser user) throws java.rmi.RemoteException{
    if (cardService == null)
      _initCardServiceProxy();
    return cardService.getAllCard(user);
  }
  
  public void saveCard(net.mv.flashcard.domain.Card card) throws java.rmi.RemoteException{
    if (cardService == null)
      _initCardServiceProxy();
    cardService.saveCard(card);
  }
  
  public net.mv.flashcard.domain.Card getRandomCard(net.mv.flashcard.domain.CardUser user) throws java.rmi.RemoteException{
    if (cardService == null)
      _initCardServiceProxy();
    return cardService.getRandomCard(user);
  }
  
  
}