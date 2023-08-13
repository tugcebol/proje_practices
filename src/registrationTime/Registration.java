package registrationTime;

import java.util.ArrayList;

public class Registration {

    public static void main(String[] args) {

        ArrayList registerList = new ArrayList<>();
        registerList = register();
        System.out.println("Register List: " + registerList);
        isTheyHappy(registerList);
    }

    public static ArrayList register() {

        ArrayList<String> list = new ArrayList<>();
        list = User.getUser();

        return list;
    }

    public static void isTheyHappy(ArrayList<String> list) {
        String seconds = "";
        for (String each : list) {
            int indexOfSpace = each.indexOf(" ");
            String name = each.substring(0, indexOfSpace);
            seconds = each.substring(each.length() - 2);
            int intSec = Integer.parseInt(seconds);
            if (intSec >= 0 && intSec <= 10) {
                System.out.println("*** CONGRATULATIONS " + name.toUpperCase() + "! ***" +
                        " \n\tYOU ARE A HAPPY USER :)");
            }
        }
    }
}
