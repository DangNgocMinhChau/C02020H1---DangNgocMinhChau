package TaskCheckDuLieuDauVao;

import Modules.Customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class AgeComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        int i = Integer.parseInt(o1.birthDayCustomer);
        int j = Integer.parseInt(o2.birthDayCustomer);

        if(o1.birthDayCustomer == o2.birthDayCustomer){
            return 0;
        }else if(i > j){
            return 1;
        }else {
            return -1;
        }

    }
}
