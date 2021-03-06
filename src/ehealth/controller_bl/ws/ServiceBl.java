
package ehealth.controller_bl.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ehealth.controller_db.ws.Person;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceBl", targetNamespace = "http://ws.controller_bl.ehealth/")
@XmlSeeAlso({
    ehealth.controller_db.ws.ObjectFactory.class,
    ehealth.controller_bl.ws.ObjectFactory.class
})
public interface ServiceBl {


    /**
     * 
     * @param person
     * @param measureType
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "goalStatus", targetNamespace = "")
    @RequestWrapper(localName = "readGoalStatus", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadGoalStatus")
    @ResponseWrapper(localName = "readGoalStatusResponse", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadGoalStatusResponse")
    @Action(input = "http://ws.controller_bl.ehealth/ServiceBl/readGoalStatusRequest", output = "http://ws.controller_bl.ehealth/ServiceBl/readGoalStatusResponse")
    public String readGoalStatus(
        @WebParam(name = "person", targetNamespace = "")
        Person person,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @param person
     * @param days
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "stepStatus", targetNamespace = "")
    @RequestWrapper(localName = "readSteps", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadSteps")
    @ResponseWrapper(localName = "readStepsResponse", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadStepsResponse")
    @Action(input = "http://ws.controller_bl.ehealth/ServiceBl/readStepsRequest", output = "http://ws.controller_bl.ehealth/ServiceBl/readStepsResponse")
    public String readSteps(
        @WebParam(name = "person", targetNamespace = "")
        Person person,
        @WebParam(name = "days", targetNamespace = "")
        int days);

    /**
     * 
     * @param person
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "idealWeight", targetNamespace = "")
    @RequestWrapper(localName = "updateIdealWeight", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.UpdateIdealWeight")
    @ResponseWrapper(localName = "updateIdealWeightResponse", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.UpdateIdealWeightResponse")
    @Action(input = "http://ws.controller_bl.ehealth/ServiceBl/updateIdealWeightRequest", output = "http://ws.controller_bl.ehealth/ServiceBl/updateIdealWeightResponse")
    public String updateIdealWeight(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "weightChange", targetNamespace = "")
    @RequestWrapper(localName = "readBigWeightChange", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadBigWeightChange")
    @ResponseWrapper(localName = "readBigWeightChangeResponse", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadBigWeightChangeResponse")
    @Action(input = "http://ws.controller_bl.ehealth/ServiceBl/readBigWeightChangeRequest", output = "http://ws.controller_bl.ehealth/ServiceBl/readBigWeightChangeResponse")
    public String readBigWeightChange(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "measureReminder", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureReminder", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadMeasureReminder")
    @ResponseWrapper(localName = "readMeasureReminderResponse", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadMeasureReminderResponse")
    @Action(input = "http://ws.controller_bl.ehealth/ServiceBl/readMeasureReminderRequest", output = "http://ws.controller_bl.ehealth/ServiceBl/readMeasureReminderResponse")
    public String readMeasureReminder(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "goalReminder", targetNamespace = "")
    @RequestWrapper(localName = "readGoalReminder", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadGoalReminder")
    @ResponseWrapper(localName = "readGoalReminderResponse", targetNamespace = "http://ws.controller_bl.ehealth/", className = "ehealth.controller_bl.ws.ReadGoalReminderResponse")
    @Action(input = "http://ws.controller_bl.ehealth/ServiceBl/readGoalReminderRequest", output = "http://ws.controller_bl.ehealth/ServiceBl/readGoalReminderResponse")
    public String readGoalReminder(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

}
