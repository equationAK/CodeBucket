import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        // give the words here
        String a = "ppaaagg";
        String b = "gagaapp";
        String c = "hello";
        String d = "hellllo";
        System.out.println(isAnagram(a,b) ? "yes" : "no");
        System.out.println(isAnagram(c,d) ? "yes" : "no");
    }

    // boolean method to check if two given string are anagrams
    // two strings are anagrams if they contain the same number for each character
    public static boolean isAnagram(String a, String b) {
        Map<Character,Integer> mapA = new HashMap<>();
        Map<Character,Integer> mapB = new HashMap<>();

        for(Character ch : a.toCharArray()) {
            if (mapA.containsKey(ch)) {
                mapA.put(ch, mapA.get(ch) + 1);
            } else {
                mapA.put(ch, 1);
            }
        }
        for(Character ch : b.toCharArray()) {
            if (mapB.containsKey(ch)) {
                mapB.put(ch, mapB.get(ch) + 1);
            } else {
                mapB.put(ch, 1);
            }
        }
        return mapA.equals(mapB);
    }
}