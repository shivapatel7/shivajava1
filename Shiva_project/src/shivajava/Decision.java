package shivajava;

public class Decision {
    public static void main(String[] args) {
        int marks = 3;
        if ( marks <36 ){
            System.out.println(" student is failed ");
        } else if (marks >=90) {
            System.out.println("student is passed and A+ grade");

        } else
            System.out.println("student is passed");

        int dayNum = 0;
        switch (dayNum){
            case 1:{
                System.out.println("mon");
                break;
            }
            case 2:{
                System.out.println("tue");
                break;}
            case 3:{
                System.out.println("wed");
                break;}
            case 4:{
                System.out.println("thu");
                break;}
            case 5:{
                System.out.println("fri");
                break;}
            case 6:{
                System.out.println("sat");
                break;}case 7:{
                System.out.println("sun");
                break;}
            default:
                System.out.println("invalid date");
        }

    }
}


