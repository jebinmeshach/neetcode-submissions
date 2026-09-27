class Solution {
    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.isEmpty())
            return new ArrayList<>();

        List<String> result = new ArrayList<>();
        String[] s = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(digits, s, 0, result, new StringBuilder());
        return result;
    }

    public void backtrack(String digits, String[] s, int index, List<String> result, 
            StringBuilder current){
        
        if (index == digits.length()){
            result.add(current.toString());
            return;
        }

        String letters = s[digits.charAt(index)-'0'];
        for(int i=0; i<letters.length(); i++){
            current.append(letters.charAt(i));
            backtrack(digits, s, index+1, result, current);
            current.deleteCharAt(current.length()-1);
        }

    }
}
