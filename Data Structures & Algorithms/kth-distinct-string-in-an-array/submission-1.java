class Solution {
    public String kthDistinct(String[] arr, int k) {

        
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String ch: arr){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        List<String> ls = new LinkedList<>();

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()==1)
                ls.add(entry.getKey());
        }

        if(k>ls.size())
            return "";

        if(!ls.isEmpty())
            return ls.get(k-1);
        return "";
    }
}