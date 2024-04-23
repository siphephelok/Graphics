package question;

public class ApplicationClass {
    public static void main(String[]args){
        SuperClass obj = new SuperClass();
        System.out.println(obj.num); //Point-1
        obj.g(2);
        System.out.println(obj.num); //Point-2
        obj.h(2);
        System.out.println(obj.num); //Point-3
        obj = new SubClass();
        System.out.println(obj.num); //Point-4
        obj.g(2);
        System.out.println(obj.num); //Point-5
        obj.h(2);
        System.out.println(obj.num); //Point-6
    }
}
