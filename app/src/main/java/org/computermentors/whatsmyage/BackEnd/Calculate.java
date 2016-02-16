package org.computermentors.whatsmyage.BackEnd;

import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by CryoFlar3 on 2/14/2016.
 */
public class Calculate {

    // Returns the date entered in to the datepicker
    public Date getDate (DatePicker datePicker){
        Date date = new Date(datePicker.getYear() - 1900, datePicker.getMonth(), datePicker.getDayOfMonth());

        return date;
    }

    // Returns the age of the user in years
    public int getAge (Date date){

        Calendar dob = Calendar.getInstance();
        dob.setTime(date);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
            age--;
        } else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
                && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
            age--;
        }

        return age;
    }
}
