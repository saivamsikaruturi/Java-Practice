import InterviewQuestions.Entity;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap {
    public static void main(String[] args) throws Exception {
        List<String> arrayList = Arrays.asList("Vamsi", "Krishna", "Sai");
        arrayList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        Map<String, Integer> m = new HashMap<>();
        m.put("A", 13);
        m.put("B", 197);
        m.put("C", 56);
        m.put("D", 34);
        m.entrySet().removeIf(e -> e.getValue() > 50);
        Iterator<Map.Entry<String, Integer>> iterator = m.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(197)) {
                iterator.remove();
            }
        }

        System.out.println(m.entrySet().stream().collect(Collectors.toList()));
        Entity entity = new Entity(1, "Sai", 25000);
        Entity entity1 = new Entity(1, "Krishna", 25000);
        Entity entity2 = new Entity(1, "Vamsi", 35000);
        List<Entity> entities = Arrays.asList(entity, entity1, entity2);
        entities.stream().sorted(Comparator.comparing(Entity::getSalary).reversed().thenComparing(Comparator.comparing(Entity::getName))).forEach(System.out::println);

    }
}
