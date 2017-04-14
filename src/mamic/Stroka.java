package mamic;


public class Stroka {
    int id;
    String massage;

    public Stroka(int id, String massage) {
        this.id = id;
        this.massage = massage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
