package lab4.News;

import lab3.Things;
import lab4.Places.Flight;
import lab4.Places.AirplaneBoard;
import lab4.Places.Meeting;
import lab4.Places.Mine;
import lab4.SnowCylinders;

public class Bulletens implements Things {
    String type, action;
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    @Override
    public void SetType(String type) {
        this.type=type;
    }

    @Override
    public String GetType() {
        return type;
    }

    void Poslany(AirplaneBoard from){
        System.out.println(GetType()+" "+getAction()+" c "+from.GetPlace());
    }
    public void Informatsiya(Flight flight, Meeting meeting, Mine mine, SnowCylinders cylinders){
        System.out.println("В "+GetType()+" сообалось о "+flight.getFlight() + ", " +meeting.MeetingWhere()+", "+
                mine.GetPlace()+", "+ cylinders.GetType());
    }

    public Bulletens(String type, String  action, AirplaneBoard From, Flight flight,Meeting meeting, Mine mine,
                     SnowCylinders cylinders){
        SetType(type);
        setAction(action);
        Poslany(From);
        Informatsiya(flight,meeting,mine,cylinders);
    }
}
