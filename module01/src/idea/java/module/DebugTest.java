package idea.java.module;

import java.util.HashMap;

/**
 * @author tiangq
 * @date 2020/5/21 - 22:06
 */
public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String , String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","qinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);


    }
}
