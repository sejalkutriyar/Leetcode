class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        String [] codes = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};        
        List <String> ans = new ArrayList<>();
        ans = getallcombination(digits ,codes);
        return ans;
    }
    public ArrayList<String> getallcombination(String digits , String [] codes){
        if(digits.length()==0){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        char ch = digits.charAt(0);
        String remaining = digits.substring(1);
        ArrayList <String> subanswer = new ArrayList<>();
        ArrayList <String> result = new ArrayList<>();
        subanswer = getallcombination(remaining,codes);
        String digitcode = codes[ch-'0'];
        for(char temp : digitcode.toCharArray()){
            for(int i = 0 ; i < subanswer.size(); i++){
                result.add(temp+subanswer.get(i));
            }
        }
        return result;
    }
}