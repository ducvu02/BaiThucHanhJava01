import java.util.Scanner;
public class App90 {
    public static void main(String[] args) throws Exception {
    String a;
    char kt;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    a = scanner.nextLine();
    System.out.println("Các ký tự có trong chuỗi là: ");
      for (int i = 0; i < a.length(); i++) {
          kt = a.charAt(i);
          System.out.println(kt);
      }
      }
      
    
}
