class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> scomp=new HashMap<>();
        Map<Character,Integer> tcomp=new HashMap<>();
        for(int i=0;i<s.length();i++)
         {   scomp.put(s.charAt(i),scomp.getOrDefault(s.charAt(i),0)+1);
    }
    for (int i=0;i<t.length();i++){
        tcomp.put(t.charAt(i),tcomp.getOrDefault(t.charAt(i),0)+1);
    }
    
        return scomp.equals(tcomp);
    }
}
