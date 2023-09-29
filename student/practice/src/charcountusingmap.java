import java.util.HashMap;

public class charcountusingmap {
    public static void main(String[] args) {
        String s = "Rutuja";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                if (map.containsKey(ch)) {
                    int count = map.get(ch);
                    map.put(ch, count + 1);
                } else {
                    map.put(ch, 1);
                }
            }

            }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && map.get(s.charAt(i)) != -1) {
                System.out.println(s.charAt(i) + "-" + map.get(s.charAt(i)));
                map.put(s.charAt(i), -1);
            }
        }
    }
}
