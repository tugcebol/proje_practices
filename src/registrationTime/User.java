package registrationTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class User {

    public static ArrayList getUser(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userNameList = new ArrayList<>();
        boolean enough = false;
        do {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime startTime = LocalDateTime.now();
            String time = startTime.format(dtf);
            // int startHour = startTime.getHour();
            // int startMin = startTime.getMinute();
            // int startSec = startTime.getSecond();
            // String startTimeFinal = startHour + ":" + startMin + ":" + startSec;
            System.out.println("Please enter an user name for register: " +
                    "\n(Press 'Q' when registration process is done)");
            String userName = scanner.nextLine();
            if (!userName.equalsIgnoreCase("q")){
            String userWithTime = userName  + " Register time: " + time;
            userNameList.add(userWithTime);
            }else{
                enough = true;
            }
        }while(!enough);

        return userNameList;
    }


}
