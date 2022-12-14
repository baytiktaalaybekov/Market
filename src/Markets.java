import java.util.List;

public interface Markets {
    String creatPerson() throws Exception;
    List<Person> getAllPerson();
    List<Product> getAllProducts();
    Magazine chooseMagazineByName();
    String deleteProductFromMarket(String name, List<Magazine> markets);
    String payMoney();
    String getMagazineAddress();
    List<Bank> getBank();
    void sortByPrice();
    void getProductMarket();
    List<Magazine> getAllMagazine();
    String creatMagazine();

}
