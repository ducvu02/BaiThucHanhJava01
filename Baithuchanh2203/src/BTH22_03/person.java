package BTH22_03;
import java.util.Scanner;
public class person {
    public Scanner sc = new Scanner(System.in);
   String PersonID , PersonName, Address;
   Boolean Gender;
   void NhapPersonID(){
       System.out.print("Nhập PersonID : ");
       PersonID = sc.nextLine();
   }
   void NhapPersonName(){
       System.out.print("Nhập Personname: " );
       PersonName = sc.nextLine();
   }
   void NhapGender(){
       System.out.print("Nhập Gender : ");
       Gender = sc.nextBoolean();
   }
   void NhapAddress(){
         System.out.print("Nhập Address : ");
          Address = sc.nextLine();
   }
   void inPersonID() {
    System.out.println("PersonID cua ban la : " + PersonID);
}
void inPersonName() {
    System.out.println("PersonName cua ban la : " + PersonName);
}
void inGender() {
    System.out.println("Gender cua ban la : " + Gender);
}
void inAddress() {
    System.out.println("Address cua ban la : " + Address);
   }
   
}
