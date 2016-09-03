package ehealth.controller_pc.ws;

import ehealth.controller_db.ws.Goal;
import ehealth.controller_db.ws.HealthMeasureHistory;
import ehealth.controller_db.ws.MeasureDefinition;
import ehealth.controller_db.ws.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;
import java.util.List;

/**
 * Created by Navid on 9/1/2016.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use= SOAPBinding.Use.LITERAL) //optional
public interface ServicePc {
    //Storage Layer Methods
    @WebMethod(operationName="readPersonList")
    @WebResult(name="people")
    public List<Person> readPersonList();

    @WebMethod(operationName="readPerson")
    @WebResult(name="person")
    public Person readPerson(@WebParam(name="idPerson") Long id);

    @WebMethod(operationName="updatePerson")
    public void updatePerson(@WebParam(name="person") Person person);

    @WebMethod(operationName="createPerson")
    @WebResult
    public Person createPerson(@WebParam(name="person") Person person);

    @WebMethod(operationName="deletePerson")
    public void deletePerson(@WebParam(name="person") Person person);

    @WebMethod(operationName="readPersonHistory")
    @WebResult(name="measure")
    public List<HealthMeasureHistory> readPersonHistory(@WebParam(name="idPerson") Long idPerson,@WebParam(name="measureType") String measureType);

    @WebMethod(operationName="readMeasureTypes")
    @WebResult(name="measureTypes")
    public List<String> readMeasureTypes();

    @WebMethod(operationName="readPersonMeasure")
    @WebResult(name="measure")
    public HealthMeasureHistory readPersonMeasure(@WebParam(name="idPerson") Long idPerson,@WebParam(name="measureType") String measureType,@WebParam(name="mid") Long mid);

    @WebMethod(operationName="savePersonMeasure")
    @WebResult
    public HealthMeasureHistory savePersonMeasure(@WebParam(name="idPerson") Long id,@WebParam(name="measure") HealthMeasureHistory healthMeasureHistory);

    @WebMethod(operationName="updatePersonMeasure")
    @WebResult
    public HealthMeasureHistory updatePersonMeasure(@WebParam(name="idPerson") Long id,@WebParam(name="measure") HealthMeasureHistory healthMeasureHistory);

    @WebMethod(operationName="readMeasureType")
    @WebResult(name="measureType")
    public MeasureDefinition readMeasureType(@WebParam(name="measureType") String measureType);

    //GOALS PART
    @WebMethod(operationName="updateGoal")
    @WebResult
    public Goal updateGoal(@WebParam(name="goal") Goal goal);

    @WebMethod(operationName="readGoalList")
    @WebResult(name="goals")
    public List<String> readGoalList(@WebParam(name="idPerson") Long id);

    @WebMethod(operationName="readLatestGoalList")
    @WebResult(name="goals")
    public List<String> readLatestGoalList(@WebParam(name="idPerson") Long id);

    @WebMethod(operationName="saveGoal")
    @WebResult
    public Goal saveGoal(@WebParam(name="goal") Goal goal);

    @WebMethod(operationName="readMeasureHistoriesByDate")
    @WebResult(name="measure")
    public List<HealthMeasureHistory> readMeasureHistoriesByDate(@WebParam(name="idPerson") Long idPerson, @WebParam(name="measureType") String measureType, @WebParam(name="before") Date before, @WebParam(name="after") Date after);

    @WebMethod(operationName="readBmi")
    @WebResult(name="bmi")
    public String readBmi(@WebParam(name="weight") double weight,@WebParam(name="height") double height);

    @WebMethod(operationName="readQuote")
    @WebResult(name="quote")
    public String readQuote();


    //Business Logic Layer Methods
    @WebMethod(operationName="readGoalStatus")
    @WebResult(name="goalStatus")
    public String readGoalStatus(@WebParam(name="person") Person person,@WebParam(name="measureType") String measureType);

    @WebMethod(operationName="readSteps")
    @WebResult(name="stepStatus")
    public String readSteps(@WebParam(name="person") Person person,@WebParam(name="days") int days);

    @WebMethod(operationName="updateIdealWeight")
    @WebResult(name="idealWeight")
    public String updateIdealWeight(@WebParam(name="person") Person person);

    @WebMethod(operationName="readBigWeightChange")
    @WebResult(name="weightChange")
    public String readBigWeightChange(@WebParam(name="person") Person person);

    @WebMethod(operationName="readMeasureReminder")
    @WebResult(name="measureReminder")
    public String readMeasureReminder(@WebParam(name="person") Person person);

    @WebMethod(operationName="readGoalReminder")
    @WebResult(name="goalReminder")
    public String readGoalReminder(@WebParam(name="person") Person person);

}
