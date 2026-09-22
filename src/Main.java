//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    try (BufferedReader br = new BufferedReader(new FileReader("24_demo.txt")))
    {
        String text = "";
        String line;
        while ((line = br.readLine()) != null)  // читаем файл построчно и заполняем текст
        {
            text = text.concat(line);
        }

        char cBefore = text.charAt(0); // Первый символ. Он же предыдущий

        int iCount = 1; // Счетчик
        int countMax = 0; // Максимальное значение счетчика

        for (int i = 1; i < text.length(); i++)
        {
            char c = text.charAt(i); // Получаем текущий символ

            if (c == 'X' && cBefore == 'Z' || c == 'Y' && cBefore == 'X' || c == 'Z' && cBefore == 'Y') // Сравниваем с предыдущим
            {
                iCount++;
            }
            else
            {
                if (countMax < iCount) countMax = iCount;
                iCount = 1;
            }

            cBefore = c;
        }
        IO.println(countMax);

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
