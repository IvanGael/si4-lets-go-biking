
package com.baeldung.soap.ws.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IService1", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IService1 {


    /**
     * 
     * @param destination
     * @param location
     * @return
     *     returns com.baeldung.soap.ws.client.generated.Result
     */
    @WebMethod(operationName = "GetItinary", action = "http://tempuri.org/IService1/GetItinary")
    @WebResult(name = "GetItinaryResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetItinary", targetNamespace = "http://tempuri.org/", className = "com.baeldung.soap.ws.client.generated.GetItinary")
    @ResponseWrapper(localName = "GetItinaryResponse", targetNamespace = "http://tempuri.org/", className = "com.baeldung.soap.ws.client.generated.GetItinaryResponse")
    public Result getItinary(
        @WebParam(name = "location", targetNamespace = "http://tempuri.org/")
        String location,
        @WebParam(name = "destination", targetNamespace = "http://tempuri.org/")
        String destination);

    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(action = "http://tempuri.org/IService1/updateSteps")
    @WebResult(name = "updateStepsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "updateSteps", targetNamespace = "http://tempuri.org/", className = "com.baeldung.soap.ws.client.generated.UpdateSteps")
    @ResponseWrapper(localName = "updateStepsResponse", targetNamespace = "http://tempuri.org/", className = "com.baeldung.soap.ws.client.generated.UpdateStepsResponse")
    public Boolean updateSteps();

}