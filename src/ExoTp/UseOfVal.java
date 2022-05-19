package ExoTp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseOfVal {

    public static boolean isEmail(String email){
        return Pattern.matches(".+@.+\\..+", email);
    }

    public static boolean isLength(String mdp){
        if (mdp.length() >= 8 || mdp.length() <= 20){
            return true;
        }
        return false;
    }


}
