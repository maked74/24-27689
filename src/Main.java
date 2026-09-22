//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    try (BufferedReader br = new BufferedReader(new FileReader("26.txt"))) {
        String line;
        while ((line = br.readLine()) != null)  // читаем файл построчно и заполняем массив
        {
            IO.println(line);
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
