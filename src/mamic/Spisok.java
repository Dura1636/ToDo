package mamic;

import java.util.ArrayList;
import java.util.List;

public class Spisok {
    ArrayList<Stroka> strokas=new ArrayList<>();
    int count=1;
    int Add (String message){
        int id=count++;
        strokas.add(new Stroka(id, message));
        return id;
    }
    List<Stroka> view(){
        return strokas;
    }
    void Delete(int id){
        for (Stroka stroka : strokas) {
            if (stroka.getId() == id) {
                strokas.remove(stroka);
                break;
            }
        }
    }
}