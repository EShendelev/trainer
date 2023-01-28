package SprintFour.ThirdTheme.Ex8;

public abstract class Contact {
        // Класс должен содержать одно поле - имя пользователя name
        protected final String name;

        public String getName() {
                return name;
        }

        protected Contact(String name) {
            this.name = name;
        }

        // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
        public abstract void sendMessage();
        public abstract void print();
        }