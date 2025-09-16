package LW_02;

import java.text.SimpleDateFormat;
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(sdf.format(today));



    }
}
