import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * The MedicalRecordAdapter adapts the old health record format to the 
 * new medical record format using an old health record format.
 * @author Justin Siegfried
 */
public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;

    /**
     * The medicalrecordadapter constructor takes the instance variable 
     * record and sets it to the parameter.
     * @param record The record to be converted from old system format to new
     *               format.
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * The getFirstName method gets the name from the record 
     * and parses the first name from the full name.
     * @return Returns the parsed first name from the record.
     */
    @Override
    public String getFirstName() {
        String[] name = record.getName().split(" ");
        return name[0];
    }

    /**
     * The getLastName method gets the name from the record 
     * and parses the last name from the full name.
     * @return Returns the parsed last name from the record.
     */
    @Override
    public String getLastName() {
        String[] name = record.getName().split(" ");
        return name[name.length - 1];
    }

    /**
     * The getBirthday method gets the birthday from the 
     * record.
     * @return Returns a date.
     */
    @Override
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * Gets the gender from the record and converts it 
     * to gender enum.
     * @return Returns a gender enum
     */
    @Override
    public Gender getGender() {
        String gender = record.getGender();
        if (gender.equals("Male")) {
            return Gender.MALE;
        } else if (gender.equals("Female")) {
            return Gender.FEMALE;
        }
        return Gender.OTHER;
    }

    /**
     * Adds a visit the the record.
     */
    @Override
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }

    /**
     * Gets the previous visit history from the record and 
     * parses each visit to a visit object list and saves that in
     * a list.
     * @return Returns an arraylist of visit objects.
     */
    @Override
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<Visit> visitHistory = new ArrayList<Visit>();
        ArrayList<String> healthHistory = record.getHistory();
        
        for (String a: healthHistory) {
            String[] history = a.split("[: ,\\r?\\n]+", 10);
            Date date = makeDate(Integer.parseInt(history[4]), 
                            Integer.parseInt(history[3]), 
                            Integer.parseInt(history[2]));
            boolean well = (history[7].equals("true") ? true : false);
            String description = history[9];
            visitHistory.add(new Visit(date, well, description));
        }

        return visitHistory;
    }


    /**
     * Formats the date for the toString method.
     * @return a birthdate in MM/dd/yyyy format.
     */
    private String getFormattedBirthday(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(getBirthday());
    }

    /**
     * Formats the gender for toString.
     * @return a string of the gender with first letter capitalized and rest lower case.
     */
    private String getFormattedGender(){
        String genderText = getGender().toString();
        return genderText.substring(0,1).toUpperCase() + genderText.substring(1).toLowerCase();
    }


    /**
     * Creates a new Date
     * 
     * @param year  The Year of the date
     * @param month The month of the date
     * @param day   The day of the date
     */
    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }

    /**
     * Returns a string representation of the object.
     * @return a string of the record converted to new format.
     */
    @Override
    public String toString() {
        ArrayList<Visit> visits = getVisitHistory();
        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        result += "Birthday: " + getFormattedBirthday() + "\n";
        result += "Gender: " + getFormattedGender() + "\n";
        result += "Medical Visit History: \n";

        if(visits.size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : visits){
                result += visit.toString();
            }
        }

        return result;
    }
}