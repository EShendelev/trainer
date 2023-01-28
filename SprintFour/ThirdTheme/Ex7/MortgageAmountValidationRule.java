package SprintFour.ThirdTheme.Ex7;

public class MortgageAmountValidationRule extends ValidationRule<Integer> {

    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    @Override
    public boolean isValid() {
        if (value < 1_000_000 || value > 10_000_000) {
            return false;
        }
        return true;
    }

}