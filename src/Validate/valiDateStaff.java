package Validate;

import java.util.Scanner;

public class valiDateStaff {
    public static Scanner input = new Scanner(System.in);
    public static String inputCheck(){
        String regex = "^[a-z A-Z 0-9]{2,9}$";
        String name;
        do {
            System.out.println("2 - 9 alphabet : ");
            name = input.nextLine();
            if (name.matches(regex)){
                break;
            }else {
                System.out.println("!! Error....Nhap 2 - 9 alphabet :");
            }
        }while (true);
        return name;
    }
//    public static String inputStatus(){
//        String regex = "^[a-zA-Z0-9]{2,9}$";
//        String status;
//        do {
//            System.out.println("1 - 9 chu cai : ");
//            status = input.nextLine();
//            if (status.matches(regex)){
//                break;
//            }else {
//                System.out.println("!! Error....Nhap ten 1 - 9 chu cai :");
//            }
//        }while (true);
//        return status;
//    }
//    public static String inputWorkTime(){
//        String regex = "^[a-zA-Z0-9]{2,9}$";
//        String workTime;
//        do {
//            System.out.println("1 - 9 chu cai : ");
//            workTime = input.nextLine();
//            if (workTime.matches(regex)){
//                break;
//            }else {
//                System.out.println("!! Error....Nhap ten 1 - 9 chu cai :");
//            }
//        }while (true);
//        return workTime;
//    }
}
