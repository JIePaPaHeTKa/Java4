public class BonusMilesService {
    public int calculate(int price) {
        int rub = 20;       // количество рублей в соотношении рублей к миле
        int miles = 1;      // количество миль в соотношении рублей к миле
        int bonus = price * miles / rub;  // формула подсчета количества бонусов
        System.out.println("Итоговый бонус составит: "); //итог
        return bonus;
    }
}
