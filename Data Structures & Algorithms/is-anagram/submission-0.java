class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch :  s.toCharArray()){
           map.put(ch , map.getOrDefault(ch , 0)+ 1);

        }
        HashMap<Character, Integer> map2 = new HashMap<>();
         for(char ch :  t.toCharArray()){
           map2.put(ch , map2.getOrDefault(ch , 0)+ 1);

        }
        return map.equals(map2);
    }
}
