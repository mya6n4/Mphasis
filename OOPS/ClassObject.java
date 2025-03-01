import java.security.KeyStore.PrivateKeyEntry;


public class ClassObject{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.tip = 10;
        System.out.println(p1.tip);

        Student s1= new Student();
        s1.name ="Palak Agarwal";
        System.out.println(s1.name );

        BanAccount bank = new BanAccount();
        bank.username = "deepika";
        bank.password = "sdfghjk";

        System.out.println(bank.password);
                System.out.println(bank.username);
        
                // bank.password = "" it shows error because pass is private;
                }
            }
            class BanAccount{
                public  String username;
                String password;
                public void setPassword(String pwd){
                    password = pwd;
        }

    }


    
    class Pen{
        String color;
        int tip;
        void setColor(String newColor){
            color = newColor;
        }
        void setTip (int newTip){
            tip = newTip;
        }

    }

    class Student{
        String name,address;
        int marks,rollno;
        void setName(String newName){
            name = newName;
        }
        
    }


