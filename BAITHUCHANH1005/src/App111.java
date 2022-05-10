import java.util.Scanner;
import java.util.LinkedList;
import java.text.DecimalFormat;
public class App111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, node, sum = 0, count = 0;
    double tbCong;
    DecimalFormat dcf = new DecimalFormat("#.##");
    LinkedList<Integer> linkedList = new LinkedList<>();
         
    System.out.println("Nhập vào số phần tử của danh sách: ");
    n = scanner.nextInt();
         
    for (int i = 0; i < n; i++) {
        System.out.println("Nhập vào phần tử thứ " + i + ": ");
        node = scanner.nextInt();
        linkedList.add(node);
    }
         
    for (int i = 0; i < n; i++) {
        if (linkedList.get(i) % 2 == 0) {
            sum += linkedList.get(i);
            count++;    
        }
    }
         
    tbCong = (double)sum / count;
    System.out.println("Trung bình cộng của các số chẵn trong danh sách = " + 
        dcf.format(tbCong));
} 
    }


