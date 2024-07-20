class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }
}