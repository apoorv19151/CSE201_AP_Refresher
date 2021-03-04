import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

class frame extends JFrame{

    frame(){

        ArrayList<Patient> list = new ArrayList<Patient>();

        Date d1 = new Date(2020,3,1);
        Date d1_R = new Date(2020,3,23);
        Patient p1 = new Patient("Flora",6,'A',d1,d1_R);
        Patient p2 = new Patient("Denys",24,'B',d1,d1_R);
        Date d3 = new Date(2020,4,18);
        Date d3_R = new Date(2020,5,9);
        Patient p3 = new Patient("Jim",42,'C',d3,d3_R);
        Date d4 = new Date(2020,5,23);
        Date d4_R = new Date(2020,6,15);
        Patient p4 = new Patient("Hazel",87,'D',d4,d4_R);
        Date d5 = new Date(2020,5,1);
        Date d5_R = new Date(2020,5,23);
        Patient p5 = new Patient("Caery",72,'A',d5,d5_R);
        Date d6 = new Date(2020,5,14);
        Date d6_R = new Date(2020,6,6);
        Patient p6 = new Patient("David",7,'B',d6,d6_R);
        Date d7 = new Date(2020,5,5);
        Date d7_R = new Date(2020,5,27);
        Patient p7 = new Patient("Kevim",37,'D',d7,d7_R);
        Date d8 = new Date(2020,5,20);
        Date d8_R = new Date(2020,6,12);
        Patient p8 = new Patient("Tom",67,'D',d8,d8_R);
        Date d9 = new Date(2020,6,4);
        Date d9_R = new Date(2020,6,26);
        Patient p9 = new Patient("Bob",74,'A',d9,d9_R);
        Date d10 = new Date(2020,6,24);
        Date d10_R = new Date(2020,7,15);
        Patient p10 = new Patient("Rachel",48,'C',d10,d10_R);
        Date d11 = new Date(2020,5,11);
        Date d11_R = new Date(2020,6,3);
        Patient p11 = new Patient("Thomas",21,'C',d11,d11_R);
        Date d12 = new Date(2020,5,21);
        Date d12_R = new Date(2020,6,13);
        Patient p12 = new Patient("Mary",17,'D',d12,d12_R);
        Date d13 = new Date(2020,7,7);
        Date d13_R = new Date(2020,7,29);
        Patient p13 = new Patient("Smith",89,'A',d13,d13_R);
        Date d14 = new Date(2020,5,4);
        Date d14_R = new Date(2020,5,26);
        Patient p14 = new Patient("Pearson",47,'B',d14,d14_R);
        Date d15 = new Date(2020,6,27);
        Date d15_R = new Date(2020,7,18);
        Patient p15 = new Patient("Anderson",62,'B',d15,d15_R);
        Date d16 = new Date(2020,7,1);
        Date d16_R = new Date(2020,7,23);
        Patient p16 = new Patient("Johnson",10,'D',d16,d16_R);
        Date d17 = new Date(2020,7,9);
        Date d17_R = new Date(2020,7,31);
        Patient p17 = new Patient("Robertz",50,'A',d17,d17_R);
        Date d18 = new Date(2020,4,2);
        Date d18_R = new Date(2020,4,24);
        Patient p18 = new Patient("Julie",86,'B',d18,d18_R);
        Date d19 = new Date(2020,5,7);
        Date d19_R = new Date(2020,5,29);
        Patient p19 = new Patient("Edith",42,'D',d19,d19_R);
        Date d20 = new Date(2020,5,1);
        Date d20_R = new Date(2020,5,23);
        Patient p20 = new Patient("John",95,'D',d20,d20_R);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
        list.add(p11);
        list.add(p12);
        list.add(p13);
        list.add(p14);
        list.add(p15);
        list.add(p16);
        list.add(p17);
        list.add(p18);
        list.add(p19);
        list.add(p20);

        JLabel label1 = new JLabel("Day");
        JLabel label2 = new JLabel("Month");
        JLabel label3 = new JLabel("Year");

        JTextField f1 = new JTextField(12);
        JTextField f2 = new JTextField(12);
        JTextField f3 = new JTextField(12);

        JButton b1 = new JButton("Get Details");

        Checkbox c1 = new Checkbox("Tower A");
        Checkbox c2 = new Checkbox("Tower B");
        Checkbox c3 = new Checkbox("Tower C");
        Checkbox c4 = new Checkbox("Tower D");

        add(label1);
        add(f1);
        add(label2);
        add(f2);
        add(label3);
        add(f3);
        add(b1);

        FlowLayout fl = new FlowLayout();
        setLayout(fl);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dd = Integer.parseInt(f1.getText());
                int mm = Integer.parseInt(f2.getText());
                int yyyy = Integer.parseInt(f3.getText());
                Date d = new Date(yyyy,mm-1,dd);
                add(c1);
                add(c2);
                add(c3);
                add(c4);
                ArrayList<Patient> listA = new ArrayList<Patient>(4);
                ArrayList<Patient> listB = new ArrayList<Patient>(4);
                ArrayList<Patient> listC = new ArrayList<Patient>(4);
                ArrayList<Patient> listD = new ArrayList<Patient>(4);
                setVisible(true);
                for(int i = 0 ; i<list.size() ; i++){
                    if(list.get(i).Tower=='A'){
                        listA.add(list.get(i));
                    }
                    else if(list.get(i).Tower=='B'){
                        listB.add(list.get(i));
                    }else if(list.get(i).Tower=='C'){
                        listC.add(list.get(i));
                    }else{
                        listD.add(list.get(i));
                    }
                }
                c1.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        int recovered = 0;
                        int active = 0;
                        ArrayList<Patient> displayA = new ArrayList<Patient>(4);
                        for(int i = 0 ; i<listA.size() ; i++){
                            if(listA.get(i).date.before(d)){
                                displayA.add(listA.get(i));
                            }
                        }
                        int rows = displayA.size();
                        String column[] = {"Name","Age","Status","Tower","Recovery Date"};
                        String data[][] = new String[rows][5];
                        for(int j = 0 ; j<rows ; j++){
                            data[j][0] = displayA.get(j).Name;
                            data[j][1] = displayA.get(j).Age+"";
                            data[j][3] = displayA.get(j).Tower+"";
                            if(displayA.get(j).Rdate.before(d)){
                                data[j][2] = "Recovered";
                                String str = displayA.get(j).Rdate+"";
                                int k = str.indexOf(" 00");
                                data[j][4] = str.substring(0,k);
                                recovered++;
                            }else{
                                data[j][2] = "Active";
                                data[j][4] = "NA";
                                active++;
                            }
                        }
                        JTable table = new JTable(data,column);
                        JScrollPane jt = new JScrollPane(table);

                        JLabel TA_active = new JLabel("Active Cases "+active+"  ");
                        JLabel TA_recovered = new JLabel("Recovered Cases "+recovered);
                        add(jt);
                        add(TA_active);
                        add(TA_recovered);
                        setVisible(true);
                    }
                });
                c2.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        int recovered = 0;
                        int active = 0;
                        ArrayList<Patient> displayB = new ArrayList<Patient>(4);
                        for(int i = 0 ; i<listB.size() ; i++){
                            if(listB.get(i).date.before(d)){
                                displayB.add(listB.get(i));
                            }
                        }
                        int rows = displayB.size();
                        String column[] = {"Name","Age","Status","Tower","Recovery Date"};
                        String data[][] = new String[rows][5];
                        for(int j = 0 ; j<rows ; j++){
                            data[j][0] = displayB.get(j).Name;
                            data[j][1] = displayB.get(j).Age+"";
                            data[j][3] = displayB.get(j).Tower+"";
                            if(displayB.get(j).Rdate.before(d)){
                                data[j][2] = "Recovered";
                                String str = displayB.get(j).Rdate+"";
                                int k = str.indexOf(" 00");
                                data[j][4] = str.substring(0,k);
                                recovered++;
                            }else{
                                data[j][2] = "Active";
                                data[j][4] = "NA";
                                active++;
                            }
                        }
                        JTable table = new JTable(data,column);
                        JScrollPane jt = new JScrollPane(table);

                        JLabel TA_active = new JLabel("Active Cases "+active+"  ");
                        JLabel TA_recovered = new JLabel("Recovered Cases "+recovered);
                        add(jt);
                        add(TA_active);
                        add(TA_recovered);
                        setVisible(true);
                    }
                });
                c3.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        int recovered = 0;
                        int active = 0;
                        ArrayList<Patient> displayC = new ArrayList<Patient>(4);
                        for(int i = 0 ; i<listC.size() ; i++){
                            if(listC.get(i).date.before(d)){
                                displayC.add(listC.get(i));
                            }
                        }
                        int rows = displayC.size();
                        String column[] = {"Name","Age","Status","Tower","Recovery Date"};
                        String data[][] = new String[rows][5];
                        for(int j = 0 ; j<rows ; j++){
                            data[j][0] = displayC.get(j).Name;
                            data[j][1] = displayC.get(j).Age+"";
                            data[j][3] = displayC.get(j).Tower+"";
                            if(displayC.get(j).Rdate.before(d)){
                                data[j][2] = "Recovered";
                                String str = displayC.get(j).Rdate+"";
                                int k = str.indexOf(" 00");
                                data[j][4] = str.substring(0,k);
                                recovered++;
                            }else{
                                data[j][2] = "Active";
                                data[j][4] = "NA";
                                active++;
                            }
                        }
                        JTable table = new JTable(data,column);
                        JScrollPane jt = new JScrollPane(table);

                        JLabel TA_active = new JLabel("Active Cases "+active+"  ");
                        JLabel TA_recovered = new JLabel("Recovered Cases "+recovered);
                        add(jt);
                        add(TA_active);
                        add(TA_recovered);
                        setVisible(true);
                    }
                });
                c4.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        int recovered = 0;
                        int active = 0;
                        ArrayList<Patient> displayD = new ArrayList<Patient>(4);
                        for(int i = 0 ; i<listD.size() ; i++){
                            if(listD.get(i).date.before(d)){
                                displayD.add(listD.get(i));
                            }
                        }
                        int rows = displayD.size();
                        String column[] = {"Name","Age","Status","Tower","Recovery Date"};
                        String data[][] = new String[rows][5];
                        for(int j = 0 ; j<rows ; j++){
                            data[j][0] = displayD.get(j).Name;
                            data[j][1] = displayD.get(j).Age+"";
                            data[j][3] = displayD.get(j).Tower+"";
                            if(displayD.get(j).Rdate.before(d)){
                                data[j][2] = "Recovered";
                                String str = displayD.get(j).Rdate+"";
                                int k = str.indexOf(" 00");
                                data[j][4] = str.substring(0,k);
                                recovered++;
                            }else{
                                data[j][2] = "Active";
                                data[j][4] = "NA";
                                active++;
                            }
                        }
                        JTable table = new JTable(data,column);
                        JScrollPane jt = new JScrollPane(table);

                        JLabel TA_active = new JLabel("Active Cases "+active+"  ");
                        JLabel TA_recovered = new JLabel("Recovered Cases "+recovered);
                        add(jt);
                        add(TA_active);
                        add(TA_recovered);
                        setVisible(true);
                    }
                });
            }
        });

        setVisible(true);
        setSize(550,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Covid 19 Tracker");
    }
}
class Patient{
    String Name;
    int Age;
    char Tower;
    Date date;
    Date Rdate; // recovery date

    Patient(String n, int a, char T, Date d, Date Rd){
        Name = n;
        Age = a;
        Tower = T;
        date = d;
        Rdate = Rd;
    }
}
public class project1 {
    public static void main(String args[]){
        frame obj = new frame();
    }
}
