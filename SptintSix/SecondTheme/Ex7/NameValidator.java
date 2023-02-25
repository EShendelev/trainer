package SptintSix.SecondTheme.Ex7;

public class NameValidator implements Validator{
    @Override
    public void validate(String value) throws ValidateException {
        if (value == null) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
// допишите код класса
}