// Программа выводит Hello один раз: точка с запятой завершает цикл,
// поэтому блок println после него выполняется только один раз.
public class task6 {
    public static void main(String[] args) {
        for (int i = 0; i < 999; i++);
        {
            System.out.println("Hello");
        }
    }
}