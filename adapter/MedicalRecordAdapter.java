import java.util.ArrayList;
import java.util.Date;

public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    @Override
    public String getFirstName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getLastName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Date getBirthday() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Gender getGender() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addVisit(Date date, boolean well, String description) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ArrayList<Visit> getVisitHistory() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        return "";
    }
}