package LW_02;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date();

        sdf = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(today));
    }


}
