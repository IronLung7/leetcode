class Solution {
    public int strStr(String haystack, String needle) {
        return haystack == null?  -1 : haystack.indexOf(needle);
    }
}
