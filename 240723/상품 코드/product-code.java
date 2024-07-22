import java.util.Scanner;
class Product{
    String productName;
    int productCode;
    Product(){
        this.productName = "";
        this.productCode = 0;
    }
    Product(String productName, int productCode){
        this.productName = productName;
        this.productCode = productCode;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Product product1 = new Product();
        product1.productName = "codetree";
        product1.productCode = 50;
        String productName = sc.next();
        int productCode = sc.nextInt();
        Product product2 = new Product(productName, productCode);
        System.out.println("product " + product1.productCode + " is " + product1.productName);
        System.out.println("product " + product2.productCode + " is " + product2.productName); 
    }
}