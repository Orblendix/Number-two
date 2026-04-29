import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TwoWindows {

    public static void main(String[] args) {
        // Первое диалоговое окно с полем для ввода имени
        String name = JOptionPane.showInputDialog(
            null,                          // родительское окно (null = центр экрана)
            "Введите ваше имя:",           // текст над полем ввода
            "Ввод имени",                  // заголовок окна
            JOptionPane.QUESTION_MESSAGE   // тип окна (вопрос)
        );

        // Если пользователь нажал Cancel или закрыл окно, name будет null
        if (name == null || name.trim().isEmpty()) {
            // Если имя не введено, показываем сообщение и завершаем программу
            JOptionPane.showMessageDialog(
                null,
                "Вы не ввели имя! Программа завершена.",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Второе информационное окно с введённым именем
        JOptionPane.showMessageDialog(
            null,
            "Привет, " + name + "!",
            "Информация",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
