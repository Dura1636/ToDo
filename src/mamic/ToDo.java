package mamic;

import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        Spisok list=new Spisok();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Выберите добавить,удалить или показать");
            String cmd=s.nextLine();
            switch (cmd){
                case"1":
                    System.out.println("Введите задачу");
                    String task=s.nextLine();
                    list.Add(task);
                    break;
                case"2":
                    System.out.println("Удалить задачу");
                    Integer t=Integer.parseInt(s.nextLine());
                    list.Delete(t);
                    break;
                case "3":
                    List<Stroka> strokas = list.view();
                    for (Stroka stroka : strokas) {
                        System.out.println(stroka.getId()+". "+stroka.getMassage());
                    }
                    break;

            }
        }
    }
}
