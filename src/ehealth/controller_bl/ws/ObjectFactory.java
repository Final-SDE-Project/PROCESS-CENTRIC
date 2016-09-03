
package ehealth.controller_bl.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ehealth.controller_bl.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadBigWeightChangeResponse_QNAME = new QName("http://ws.controller_bl.ehealth/", "readBigWeightChangeResponse");
    private final static QName _ReadMeasureReminder_QNAME = new QName("http://ws.controller_bl.ehealth/", "readMeasureReminder");
    private final static QName _ReadSteps_QNAME = new QName("http://ws.controller_bl.ehealth/", "readSteps");
    private final static QName _ReadGoalReminderResponse_QNAME = new QName("http://ws.controller_bl.ehealth/", "readGoalReminderResponse");
    private final static QName _UpdateIdealWeightResponse_QNAME = new QName("http://ws.controller_bl.ehealth/", "updateIdealWeightResponse");
    private final static QName _ReadGoalStatusResponse_QNAME = new QName("http://ws.controller_bl.ehealth/", "readGoalStatusResponse");
    private final static QName _ReadMeasureReminderResponse_QNAME = new QName("http://ws.controller_bl.ehealth/", "readMeasureReminderResponse");
    private final static QName _ReadStepsResponse_QNAME = new QName("http://ws.controller_bl.ehealth/", "readStepsResponse");
    private final static QName _ReadGoalStatus_QNAME = new QName("http://ws.controller_bl.ehealth/", "readGoalStatus");
    private final static QName _ReadBigWeightChange_QNAME = new QName("http://ws.controller_bl.ehealth/", "readBigWeightChange");
    private final static QName _UpdateIdealWeight_QNAME = new QName("http://ws.controller_bl.ehealth/", "updateIdealWeight");
    private final static QName _ReadGoalReminder_QNAME = new QName("http://ws.controller_bl.ehealth/", "readGoalReminder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ehealth.controller_bl.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadGoalStatus }
     * 
     */
    public ReadGoalStatus createReadGoalStatus() {
        return new ReadGoalStatus();
    }

    /**
     * Create an instance of {@link ReadBigWeightChange }
     * 
     */
    public ReadBigWeightChange createReadBigWeightChange() {
        return new ReadBigWeightChange();
    }

    /**
     * Create an instance of {@link UpdateIdealWeight }
     * 
     */
    public UpdateIdealWeight createUpdateIdealWeight() {
        return new UpdateIdealWeight();
    }

    /**
     * Create an instance of {@link ReadGoalReminder }
     * 
     */
    public ReadGoalReminder createReadGoalReminder() {
        return new ReadGoalReminder();
    }

    /**
     * Create an instance of {@link ReadBigWeightChangeResponse }
     * 
     */
    public ReadBigWeightChangeResponse createReadBigWeightChangeResponse() {
        return new ReadBigWeightChangeResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureReminder }
     * 
     */
    public ReadMeasureReminder createReadMeasureReminder() {
        return new ReadMeasureReminder();
    }

    /**
     * Create an instance of {@link ReadSteps }
     * 
     */
    public ReadSteps createReadSteps() {
        return new ReadSteps();
    }

    /**
     * Create an instance of {@link ReadGoalReminderResponse }
     * 
     */
    public ReadGoalReminderResponse createReadGoalReminderResponse() {
        return new ReadGoalReminderResponse();
    }

    /**
     * Create an instance of {@link UpdateIdealWeightResponse }
     * 
     */
    public UpdateIdealWeightResponse createUpdateIdealWeightResponse() {
        return new UpdateIdealWeightResponse();
    }

    /**
     * Create an instance of {@link ReadGoalStatusResponse }
     * 
     */
    public ReadGoalStatusResponse createReadGoalStatusResponse() {
        return new ReadGoalStatusResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureReminderResponse }
     * 
     */
    public ReadMeasureReminderResponse createReadMeasureReminderResponse() {
        return new ReadMeasureReminderResponse();
    }

    /**
     * Create an instance of {@link ReadStepsResponse }
     * 
     */
    public ReadStepsResponse createReadStepsResponse() {
        return new ReadStepsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBigWeightChangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readBigWeightChangeResponse")
    public JAXBElement<ReadBigWeightChangeResponse> createReadBigWeightChangeResponse(ReadBigWeightChangeResponse value) {
        return new JAXBElement<ReadBigWeightChangeResponse>(_ReadBigWeightChangeResponse_QNAME, ReadBigWeightChangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureReminder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readMeasureReminder")
    public JAXBElement<ReadMeasureReminder> createReadMeasureReminder(ReadMeasureReminder value) {
        return new JAXBElement<ReadMeasureReminder>(_ReadMeasureReminder_QNAME, ReadMeasureReminder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSteps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readSteps")
    public JAXBElement<ReadSteps> createReadSteps(ReadSteps value) {
        return new JAXBElement<ReadSteps>(_ReadSteps_QNAME, ReadSteps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalReminderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readGoalReminderResponse")
    public JAXBElement<ReadGoalReminderResponse> createReadGoalReminderResponse(ReadGoalReminderResponse value) {
        return new JAXBElement<ReadGoalReminderResponse>(_ReadGoalReminderResponse_QNAME, ReadGoalReminderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdealWeightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "updateIdealWeightResponse")
    public JAXBElement<UpdateIdealWeightResponse> createUpdateIdealWeightResponse(UpdateIdealWeightResponse value) {
        return new JAXBElement<UpdateIdealWeightResponse>(_UpdateIdealWeightResponse_QNAME, UpdateIdealWeightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readGoalStatusResponse")
    public JAXBElement<ReadGoalStatusResponse> createReadGoalStatusResponse(ReadGoalStatusResponse value) {
        return new JAXBElement<ReadGoalStatusResponse>(_ReadGoalStatusResponse_QNAME, ReadGoalStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureReminderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readMeasureReminderResponse")
    public JAXBElement<ReadMeasureReminderResponse> createReadMeasureReminderResponse(ReadMeasureReminderResponse value) {
        return new JAXBElement<ReadMeasureReminderResponse>(_ReadMeasureReminderResponse_QNAME, ReadMeasureReminderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadStepsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readStepsResponse")
    public JAXBElement<ReadStepsResponse> createReadStepsResponse(ReadStepsResponse value) {
        return new JAXBElement<ReadStepsResponse>(_ReadStepsResponse_QNAME, ReadStepsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readGoalStatus")
    public JAXBElement<ReadGoalStatus> createReadGoalStatus(ReadGoalStatus value) {
        return new JAXBElement<ReadGoalStatus>(_ReadGoalStatus_QNAME, ReadGoalStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBigWeightChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readBigWeightChange")
    public JAXBElement<ReadBigWeightChange> createReadBigWeightChange(ReadBigWeightChange value) {
        return new JAXBElement<ReadBigWeightChange>(_ReadBigWeightChange_QNAME, ReadBigWeightChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdealWeight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "updateIdealWeight")
    public JAXBElement<UpdateIdealWeight> createUpdateIdealWeight(UpdateIdealWeight value) {
        return new JAXBElement<UpdateIdealWeight>(_UpdateIdealWeight_QNAME, UpdateIdealWeight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalReminder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.controller_bl.ehealth/", name = "readGoalReminder")
    public JAXBElement<ReadGoalReminder> createReadGoalReminder(ReadGoalReminder value) {
        return new JAXBElement<ReadGoalReminder>(_ReadGoalReminder_QNAME, ReadGoalReminder.class, null, value);
    }

}
