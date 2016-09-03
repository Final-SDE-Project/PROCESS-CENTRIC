package ehealth.controller_pc.ws;

import ehealth.controller_bl.ws.BlService;
import ehealth.controller_bl.ws.ServiceBl;
import ehealth.controller_db.ws.Goal;
import ehealth.controller_db.ws.HealthMeasureHistory;
import ehealth.controller_db.ws.MeasureDefinition;
import ehealth.controller_db.ws.Person;
import ehealth.controller_storage.ws.ServiceStorage;
import ehealth.controller_storage.ws.StorageService;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Navid on 9/1/2016.
 */

@WebService(endpointInterface = "ehealth.controller_pc.ws.ServicePc", serviceName="PcService")
public class ServicePcImpl implements ServicePc {

    //Connection with Storage layer
    private StorageService storageService = new StorageService();
    private ServiceStorage serviceStorage = storageService.getServiceStorageImplPort();

    //Connection with Business Logic Layer
    private BlService blService = new BlService();
    private ServiceBl serviceBl = blService.getServiceBLogicImplPort();

    //Method #1
    @Override
    public List<Person> readPersonList()
    {
        List<Person> personList = new ArrayList<Person>();
        try
        {
            personList = serviceStorage.readPersonList();
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return personList;
    }

    //Method #2
    @Override
    public Person readPerson(Long person_id)
    {
        Person person = new Person();
        try
        {
            person = serviceStorage.readPerson(person_id);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return person;
    }

    //Method #3
    @Override
    public void updatePerson(Person person)
    {
        try
        {
            serviceStorage.updatePerson(person);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
    }

    //Method #4
    @Override
    public Person createPerson(Person person)
    {
        try
        {
            person = serviceStorage.createPerson(person);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return person;
    }

    //Method #5
    @Override
    public void deletePerson(Person person)
    {
        try
        {
            serviceStorage.deletePerson(person);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
    }

    //Method #6
    @Override
    public List<HealthMeasureHistory> readPersonHistory(Long idPerson, String measureType)
    {
        List<HealthMeasureHistory> healthMeasureHistories = new ArrayList<HealthMeasureHistory>();
        try
        {
            healthMeasureHistories = serviceStorage.readPersonHistory(idPerson, measureType);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return healthMeasureHistories;
    }

    //Method #7
    @Override
    public List<String> readMeasureTypes()
    {
        List<String> measureTypes = new ArrayList<String>();
        try
        {
            measureTypes = serviceStorage.readMeasureTypes();
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return measureTypes;
    }

    //Method #8
    @Override
    public HealthMeasureHistory readPersonMeasure(Long idPerson, String measureType, Long mid)
    {
        HealthMeasureHistory healthMeasureHistory = new HealthMeasureHistory();
        try
        {
            healthMeasureHistory = serviceStorage.readPersonMeasure(idPerson, measureType, mid);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return healthMeasureHistory;
    }

    //Method #9
    @Override
    public HealthMeasureHistory savePersonMeasure(Long id, HealthMeasureHistory healthMeasureHistory)
    {
        HealthMeasureHistory tmpHealthMeasureHistory = new HealthMeasureHistory();
        try
        {
            tmpHealthMeasureHistory = serviceStorage.savePersonMeasure(id, healthMeasureHistory);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return tmpHealthMeasureHistory;
    }

    //Method #10
    @Override
    public HealthMeasureHistory updatePersonMeasure(Long id, HealthMeasureHistory healthMeasureHistory)
    {
        HealthMeasureHistory tmpHealthMeasureHistory = new HealthMeasureHistory();
        try
        {
            tmpHealthMeasureHistory = serviceStorage.updatePersonMeasure(id, healthMeasureHistory);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return tmpHealthMeasureHistory;
    }

    //Method #11
    @Override
    public MeasureDefinition readMeasureType(String measureType)
    {
        MeasureDefinition measureDefinition = new MeasureDefinition();
        try
        {
            measureDefinition = serviceStorage.readMeasureType(measureType);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return measureDefinition;
    }

    //Method #12
    @Override
    public Goal updateGoal(Goal goal)
    {
        Goal tmpGoal = new Goal();
        try
        {
            tmpGoal = serviceStorage.updateGoal(goal);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return tmpGoal;
    }

    //Method #13
    @Override
    public List<String> readGoalList(Long id)
    {
        List<String> goals = new ArrayList<String>();
        try
        {
            goals = convertGoalToString(serviceStorage.readGoalList(id));
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return goals;
    }

    //Method #14
    @Override
    public List<String> readLatestGoalList(Long id)
    {
        List<String> goalsStringList = new ArrayList<String>();
        try
        {
            goalsStringList = convertGoalToString(serviceStorage.readLatestGoalList(id));
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return goalsStringList;
    }

    //Method #15
    @Override
    public Goal saveGoal(Goal goal)
    {
        try
        {
            goal = serviceStorage.saveGoal(goal);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return goal;
    }

    //Method EXTRA
    @Override
    public List<HealthMeasureHistory> readMeasureHistoriesByDate(Long idPerson, String measureType, Date before, Date after)
    {
        List<HealthMeasureHistory> healthMeasureHistories = new ArrayList<HealthMeasureHistory>();
        try
        {
            GregorianCalendar beforeDate = new GregorianCalendar();
            beforeDate.setTime(before);
            XMLGregorianCalendar beforeDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(beforeDate);
            GregorianCalendar afterDate = new GregorianCalendar();
            afterDate.setTime(after);
            XMLGregorianCalendar afterDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(afterDate);

            healthMeasureHistories = serviceStorage.readMeasureHistoriesByDate(idPerson, measureType, beforeDateXML, afterDateXML);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return healthMeasureHistories;
    }

    @Override
    public String readBmi(double weight, double height)
    {
        String bmi="";
        try
        {
            bmi = serviceStorage.readBmi(weight, height);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return bmi;
    }

    @Override
    public String readQuote()
    {
        String quote="";
        try
        {
            quote = serviceStorage.readQuote();
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return quote;
    }

    @Override
    public String readGoalStatus(Person person, String measureType)
    {
        try
        {
            return serviceBl.readGoalStatus(person, measureType);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "";
    }

    @Override
    public String readSteps(Person person, int days)
    {
        try
        {
            return serviceBl.readSteps(person, days);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "";
    }

    @Override
    public String updateIdealWeight(Person person)
    {
        try
        {
            return serviceBl.updateIdealWeight(person);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "";
    }

    @Override
    public String readBigWeightChange(Person person)
    {
        try
        {
            return serviceBl.readBigWeightChange(person);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "";
    }

    @Override
    public String readMeasureReminder(Person person)
    {
        try
        {
            return serviceBl.readMeasureReminder(person);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "";
    }

    @Override
    public String readGoalReminder(Person person)
    {
        try
        {
            return serviceBl.readGoalReminder(person);
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return "";
    }

    public List<String> convertGoalToString(List<Goal> goals)
    {
        List<String> stringList = new ArrayList<String>();
        try
        {
            for(Goal goal:goals)
            {
                String goalString = "";
                String goalValue = goal.getGoalValue();
                Date goalDate = goal.getDateRegistered().toGregorianCalendar().getTime();
                String measureType = goal.getMeasureDefinition().getMeasureType();
                String measureUnit = goal.getMeasureDefinition().getMeasureValueType().split(":")[0];

                if ("weight".equals(measureType))
                {
                    if(goal.getGoalValue().indexOf("+") != -1)
                    {
                        //goalString = "My \"Weight\" Goal is to gain 10 kg (Starting weight: 60 kg on 12/13/1333)";
                        goalString = "My \"Weight\" Goal is to gain "+goalValue.split("[+]")[1]+" "+measureUnit+
                                " (Initial weight: "+goalValue.split("[+]")[0]+" "+measureUnit+" on "+
                                goalDate.toString().split("T")[0]+")";
                    }else if(goal.getGoalValue().indexOf("-") != -1)
                    {
                        goalString = "My \"Weight\" Goal is to lose "+goalValue.split("-")[1]+" "+measureUnit+
                                " (Initial weight: "+goalValue.split("-")[0]+" "+measureUnit+" on "+
                                goalDate.toString().split("T")[0]+")";
                    }
                }
                else if("height".equals(measureType))
                {
                    if(goal.getGoalValue().indexOf("+") != -1)
                    {
                        //goalString = "My \"Height\" Goal is to grow 2 cm (Starting height: 60 kg on 12/13/1333)";
                        goalString = "My \"Height\" Goal is to grow "+goalValue.split("[+]")[1]+" "+measureUnit+
                                " (Initial height: "+goalValue.split("[+]")[0]+" "+measureUnit+" on "+
                                goalDate.toString().split("T")[0]+")";
                    }else if(goal.getGoalValue().indexOf("-") != -1)
                    {
                        goalString = "My \"Height\" Goal is to shrink "+goalValue.split("-")[1]+" "+measureUnit+
                                " (Initial height: "+goalValue.split("-")[0]+" "+measureUnit+" on "+
                                goalDate.toString().split("T")[0]+")";
                    }
                }
                else if ("steps".equals(measureType))
                {
                    if(goal.getGoalValue().indexOf("+") != -1)
                    {
                        //goalString = "My \"Steps\" Goal is to walk 1000 steps (Starting from 12/13/1333)";
                        goalString = "My \"Steps\" Goal is to walk for "+goalValue.split("[+]")[1]+" "+measureUnit+
                                " (Starting from "+goalDate.toString().split("T")[0]+")";
                    }
                }else if ("sleep".equals(measureType))
                {
                    if(goal.getGoalValue().indexOf("+") != -1)
                    {
                        //goalString = "My \"Sleep\" Goal is to sleep 5 hours (Starting from 12/13/1333)";
                        goalString ="My \"Sleep\" Goal is to sleep for "+goalValue.split("[+]")[1]+" "+measureUnit+
                                " (Starting from "+goalDate.toString().split("T")[0]+")";
                    }
                }else if ("water".equals(measureType))
                {
                    if(goal.getGoalValue().indexOf("+") != -1)
                    {
                        //goalString = "My \"Water\" Goal is to drink 2 litres (Starting from 12/13/1333)";
                        goalString ="My \"Water\" Goal is to drink "+goalValue.split("[+]")[1]+" "+measureUnit+
                                " (Starting from "+goalDate.toString().split("T")[0]+")";
                    }
                }
                else if ("heart rate".equals(measureType))
                {
                    if(goal.getGoalValue().indexOf("+") != -1)
                    {
                        //goalString = "My \"Heart Rate\" Goal is to increase its average by 2 bmp (Initial level was 100 bpm on 12/12/1222)";
                        goalString = "My \"Heart Rate\" Goal is to increase its average by "+goalValue.split("[+]")[1]+
                                " "+measureUnit+" (Initial level was "+goalValue.split("[+]")[0]+" "+measureUnit+" on "+
                                goalDate.toString().split("T")[0]+")";
                    }else if(goal.getGoalValue().indexOf("-") != -1)
                    {
                        goalString = "My \"Heart Rate\" Goal is to decrease its average by "+goalValue.split("-")[1]+
                                " "+measureUnit+" (Initial level was "+goalValue.split("-")[0]+" "+measureUnit+" on "+
                                goalDate.toString().split("T")[0]+")";
                    }
                }
                stringList.add(goalString);
            }
        }catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return stringList;
    }

}
