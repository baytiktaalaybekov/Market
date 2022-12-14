import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MarketImpl implements Markets {
    List<Magazine> magazines = new ArrayList<>();
    List<Product> products = new ArrayList<>();
    List<Person> persons = new ArrayList<>();


    @Override
    public String creatPerson() throws Exception {
        try {
            System.out.println("~~~REGISTER FOR A CARD~~~");
            System.out.println("ENTER YOUR NAME: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("ENTER YOUR ID: ");
            long id = new Scanner(System.in).nextLong();
            System.out.println("ENTER YOUR PASSWORD: ");
            String password = new Scanner(System.in).nextLine();
            System.out.println("ENTER YOUR AGE: ");
            int age = new Scanner(System.in).nextInt();
            System.out.println("ENTER YOUR BankAccount: ");
            String bank = new Scanner(System.in).nextLine();
            System.out.println("ENTER YOUR BankAccount MONEY: ");
            double bankAccount = new Scanner(System.in).nextDouble();
            for (Person per : persons) {
                if (per.getName().equals(name)) {
                    throw new Exception("YOUR name is Incorrect!");
                }
                if (per.getId() == id) {
                    throw new Exception("Your id is incorrect");
                }
                if (per.getAge() < 17) {
                    throw new Exception("You aren't old enough to get an card!");
                }
                if (bank.isEmpty()) {
                    throw new Exception("Your bank is incorrect");
                }
                if (bankAccount < 0) {
                    throw new Exception("There is no money in your account, please replenish the money");
                }
            }
            BankAccount bankAccount1 = new BankAccount(Bank.valueOf(bank), bankAccount);
            Person person = new Person(name, id, password, age, bankAccount1);
            persons.add(person);
            return "Successfully";
        } catch (Exception e) {
            System.out.println("your are not registered");
        }
        return "You have successfully completed!";
    }

    @Override
    public List<Person> getAllPerson() {
        return persons;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of(Product.values());
    }

    @Override
    public Magazine chooseMagazineByName() {
        try {
            System.out.println("Enter a magazine name");
            String name = new Scanner(System.in).nextLine();
            for (Magazine mag : magazines) {
                if (mag.getName().equals(name)) {
                    return mag;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String deleteProductFromMarket(String name, List<Magazine> markets) {
        for (Magazine ma : magazines) {
            if (ma.getName().equals(name)) {
                magazines.remove(name);
            }
        }
        return "Name deleted!";
    }

    @Override
    public String payMoney() {
        System.out.println("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        for (Person pe : persons) {
            if (pe.getName().equals(name)) {
                System.out.println("Enter a magazine name: ");
                String magaName = new Scanner(System.in).nextLine();
                for (Magazine m : magazines) {
                    if (m.getName().equals(magaName)) {
                        List<String> saleProduct = new ArrayList<>();
                        double saleProductPrice = 0;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String getMagazineAddress() {
        System.out.println("Enter a magazine name: ");
        String name = new Scanner(System.in).nextLine();
        for (Magazine mag : magazines) {
            if (mag.getName().equals(name))
            return mag.getAddress();
        }
        return "OOPS, the address of the magazine was not found!";

    }


    @Override
    public List<Bank> getBank() {
        return List.of(Bank.values());
    }

    @Override
    public void sortByPrice() {
        products.sort(sortByPrice);
        System.out.println(products);
    }
    Comparator<Product> sortByPrice = new Comparator<>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };

    @Override
    public void getProductMarket() {
            try {
                System.out.println("Enter a market name: ");
                String marketName = new Scanner(System.in).nextLine();

                for (Magazine maga : magazines) {
                    if (maga.getName().equals(marketName)) {
                        System.out.println(maga.getProducts());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    @Override
    public List<Magazine> getAllMagazine() {
        return magazines;

    }

    @Override
    public String creatMagazine() {
        System.out.println("Magazine :");
        System.out.println("Enter a magazine name");
        String magazineName = new Scanner(System.in).nextLine();
        System.out.println("Enter your id: ");
        long id = new Scanner(System.in).nextLong();
        System.out.println("Magazine address: ");
        String addressMagazine = new Scanner(System.in).nextLine();

        Magazine magazine = new Magazine(magazineName, id, addressMagazine,products);
        magazines.add(magazine);

        return "Successfully";

    }
}