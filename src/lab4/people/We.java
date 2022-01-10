package lab4.people;

import lab3.Human;
import lab4.Phantoms;
import lab4.Places.Tops;


public class We implements Human {
    String name="";
    String action="";
    String abstractAction="";
    public String getAbstractAction() {
        return abstractAction;
    }

    public void setAbstractAction(String abstractAction) {
        this.abstractAction = abstractAction;
    }
    public void SetAction(String action){
        this.action = action;
    }
    public String GetAction(){
        return action;
    }
    @Override
    public void SetName(String name) {
        this.name = name;
    }

    @Override
    public String GetName() {
        return name;
    }
    void Vivod(Phantoms s){
        System.out.println(GetName()+ " "+ GetAction()+" за " + s.getName()+", "+s.getAction()+" "+s.getActionWhere());
    }
    void Vivod(){
        System.out.println(GetName()+" "+ GetAction());
        if(!abstractAction.equals(""))
        System.out.println(GetName()+" "+ getAbstractAction());
    }
    void Vivod(Tops tops){
        System.out.println(GetName()+" "+ GetAction()+" "+tops.GetPlace());
        System.out.println(tops.GetPlace()+" "+tops.getDescription1()+", "+tops.getDescription2()+", "+
                tops.getDescription3()+", "+tops.getDescription4());
    }
    public We(String name, String action, Phantoms a){
        SetName(name);
        SetAction(action);
        Vivod(a);
    }
    public We(String name, String action, String abstractAction){
        SetName(name);
        SetAction(action);
        setAbstractAction(abstractAction);
        Vivod();
    }
    public We(String name,String action){
        SetName(name);
        SetAction(action);
        Vivod();
    }
    public We (String name, String action, Tops tops){
        SetName(name);
        SetAction(action);
        Vivod(tops);
    }
}
