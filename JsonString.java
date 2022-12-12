import org.json.JSONArray;


public class JsonString {
     /**
     * Дана json строка
     * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
     * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
     * Студент [фамилия] получил [оценка] по предмету [предмет].
     * Студент Иванов получил 5 по предмету Математика.
     * Студент Петрова получил 4 по предмету Информатика.
     * Студент Краснов получил 5 по предмету Физика.
     */

public static void main(String[] args)
    {
       derivationOfGrades();
    }

public static void derivationOfGrades()
{
    JSONArray students = new JSONArray("[" +
            "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
            "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]");
    for (int i = 0; i < students.length(); i++)
    {
        StringBuilder lastName = new StringBuilder((String) students.getJSONObject(i).get("фамилия"));
        StringBuilder grade = new StringBuilder((String) students.getJSONObject(i).get("оценка"));
        StringBuilder subject = new StringBuilder((String) students.getJSONObject(i).get("предмет"));
        System.out.println("Студент(ка) " + lastName + " получил(а) " + grade + " по предмету " + subject);
    }
}
}