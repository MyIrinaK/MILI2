public class BonusMilesService {
    public int calculate(int price) {
        int miles;//объявление переменной для количества миль.
        int percentInKopecks = 20;//стоимость одной бонусной мили в руб.
        miles = price / percentInKopecks;//расчет количества миль за покупку билета.
        return miles;// возвращает рассчитанное количество миль
    }
}

