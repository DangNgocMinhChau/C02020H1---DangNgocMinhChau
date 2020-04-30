package TaskCheckDuLieuDauVao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void checkStandardizedName(String serviceName) {
        String checkTen = "^[A-Z].+$";
        while (Pattern.matches(checkTen, serviceName) != true) {
            System.out.println("chữ cái đầu tien phải viết hoa : ");
            serviceName = new Scanner(System.in).nextLine();
        }
    }

    public static void checkAreaUsedAndAreaPool(double areaUsed) {
        while (areaUsed < 30) {
            System.out.println("Diện tích phải lớn hơn 30m2");
            areaUsed = new Scanner(System.in).nextDouble();
        }
    }

    public static void checkRentalCosts(double cost) {
        while (cost < 0) {
            System.out.println("Chi phí thuê phải là số dương : ");
            cost = new Scanner(System.in).nextDouble();
        }
    }

    public static void checkMaximumNumberOfPeople(int amount) {
        while (amount < 0 || amount > 20) {
            System.out.println("Số lượng người tối đa phải >0 và < 20 người");
            amount = new Scanner(System.in).nextInt();
        }
    }

    public static void checkNumberOfFloors(int number) {
        while (number < 0) {
            try {
                System.out.println("Số tầng phải là số nguyên dương- mời bạn nhập lại : ");
                number = new Scanner(System.in).nextInt();
            } catch (Exception ex) {
                System.out.println("mời nhập lại");
                number = new Scanner(System.in).nextInt();
            }
        }

    }

//    public  static  String checkName(String s){
//        String  checkName = s;
//        checkName = checkName.trim();
//
//        String [] arrayNew = checkName.split(" ");
//        checkName ="";
//        for (String name : arrayNew){
//            String newWord = name.toLowerCase();
//
//            if(name.length() > 0){
//                newWord = newWord.replaceFirst((newWord.charAt(0) + ""),(newWord.charAt(0) + "").toUpperCase());
//                checkName += newWord + " ";
//            }
//        }
//
//
//        return checkName.trim();
//
//    }

    public static void checkEmail(String email) {
        String regex = "^[a-zA-Z]+[a-z0-9]*@{1}\\w+mail.[comvn]{2,3}$";
        while (Pattern.matches(regex, email) != true) {
            System.out.println("nhập lại email đúng định dạng");
            email = new Scanner(System.in).nextLine();
        }
    }

    public static void checkName(String name) {
        String regex = "(^[\\p{Lu}]{1}[\\p{Ll}]+\\s{1}){1}([\\p{Lu}]{1}[\\p{Ll}]+\\s{1}){0,4}([\\p{Lu}]{1}[\\p{Ll}]+$)";
        while (Pattern.matches(regex, name) != true) {
            System.out.println("nhập lại đúng định dạng");
            name = new Scanner(System.in).nextLine();
        }
    }

    public static void checkIdCard(String id) {
        String regex = "^[0-9]{9}";
        while (Pattern.matches(regex, id) != true) {
            System.out.println(" Mời bạn nhập ID đúng định dạng : XXXXXXXXX");
            id = new Scanner(System.in).nextLine();
        }
    }


    public static boolean checkBirthday(String test) {
        try {
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date birthday = sdf.parse(test);
            cal.setTime(birthday);
            int yearNs = cal.get(Calendar.YEAR);
            while (yearNs < 1990 && (year - yearNs) > 18) {
                yearNs = getYearNs(cal, sdf);
            }
            int tuoi = year - yearNs;
            System.out.println("ban " + tuoi + " tuổi");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static int getYearNs(Calendar cal, SimpleDateFormat sdf) throws ParseException {
        String test;
        Date birthday;
        int yearNs;
        System.out.println("mời bạn nhập lại đúng định dạng");
        test = new Scanner(System.in).nextLine();
        birthday = sdf.parse(test);
        cal.setTime(birthday);
        yearNs = cal.get(Calendar.YEAR);
        return yearNs;
    }


    public static void checkGender(String gender) {
        String regex = "(Male)*(Female)*(Unknow)*$";
        Pattern.matches(regex, gender);
        while (Pattern.matches(regex, gender) != true) {
            System.out.println("Mời nhập lại đúng định dạng ");
            gender = new Scanner(System.in).nextLine();
        }
    }


    public static void checkAccompaniedService(String service) {
        String regex = "(massage)*(karaoke)*(food)*(drink)*(car)*$";
        Pattern.matches(regex, service);
        while (Pattern.matches(regex, service)) {
            System.out.println("Mời nhập lại dịch vụ cho đúng");
            service = new Scanner(System.in).nextLine();
        }
    }

}


