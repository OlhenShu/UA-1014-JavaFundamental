package homework10;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;


public class homeworkTask2 {
    public static void main(String[] args){
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Сидаров","Иван");
        personMap.put("Иванов","Иван");
        personMap.put("Смирнова","Юля");
        personMap.put("Козлов", "Сидр");
        personMap.put("Попов", "Евгений");
        personMap.put("Васильева", "Мария");
        personMap.put("Кузнецов", "Александр");
        personMap.put("Морозова", "Елена");
        personMap.put("Николаев", "Олег");


        for (Map.Entry<String, String>  person : personMap.entrySet()){
            System.out.println(person.getKey() +" " + person.getValue());
        }
        System.out.println(" ");

        Set<String> names = new HashSet<>();
        Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> en = it.next();
            String name = en.getValue();
            if (names.contains(name)) {
                it.remove();
            } else {
                names.add(name);
            }
        }
        for (Map.Entry<String, String>  person : personMap.entrySet()){
            System.out.println(person.getKey() +" " + person.getValue());
        }
    }
}
