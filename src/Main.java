public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        System.out.println("Спасибо, что выбрали нашу Авиакомпанию.Ваши бонусные мили составили");
        int price = 15_000;
        int miles = service.calculate(price); //количество бонусных миль
        System.out.println(miles);
    }

}