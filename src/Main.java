import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);


        List<Magazine> magazines = new ArrayList<>();
        MarketImpl market = new MarketImpl();


        System.out.println("~~~~~~~ Choose ~~~~~~~~");
        System.out.println("""
                1 - creatPerson,
                2 - getAllPerson,
                3 - getAllProduct,
                4 - ChooseMagazineByName,
                5 - deleteProductFormatMagazine,
                6 - payMoney,
                7 - getMagazineAddress,
                8 - sortByPrice,
                9 - getProduct,
               10 - getProductMarket
               11 - creatMagazine,
               12 - getAllMagazine
                
                 """);

        while(true){
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println(market.creatPerson());
                    break;
                case 2:
                    System.out.println(market.getAllPerson());
                    break;
                case 3:{
                    for (Product allProd:market.getAllProducts()) {
                        System.out.printf("%s - price: %d sale: %1f\n",allProd,allProd.getPrice(),allProd.getSale());
                    }
                    break;
                }
                case 4:
                    System.out.println(market.chooseMagazineByName());
                    break;
                case 5:{
                    System.out.println("enter a product name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println(market.deleteProductFromMarket(name,magazines));
                }break;
                case 6:
                    System.out.println(market.payMoney());
                    break;
                case 7:
                    System.out.println(market.getMagazineAddress());
                    break;
                case 8:
                    System.out.println(market.sortByPrice);
                    break;
                case 9:
                    System.out.println(market.getAllProducts());
                    break;
                case 10:
                    market.getProductMarket();
                    break;
                case 11:
                    System.out.println(market.creatMagazine());
                    break;
                case 12:
                    System.out.println(market.getAllMagazine());
                    break;


            }
        }








    }
}