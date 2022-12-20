class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        List<String> ans = new ArrayList<>();
        ArrayList<String>[] list = new ArrayList[words.length+1];
        
        Arrays.sort(words);
        
        String prev = words[0];
        int count = 1;
        for(int i = 1 ; i<words.length ; i++){
            if(!words[i].equals(prev)){
                
                if(list[count]==null){
                    list[count] = new ArrayList<>();
                }
                
                list[count].add(prev);
                prev = words[i];
                count = 1;
            }
            else{
                count++;
            }
        }
        
        if(list[count]==null){
            list[count] = new ArrayList<>();
        }
        list[count].add(prev);
        
        for(int i = words.length ; i>0 && k>0 ; i--){
            if(list[i]!=null && list[i].size()>0){
                int j = 0;
                while(k>0 && j<list[i].size()){
                    ans.add(list[i].get(j));
                    j++;
                    k--;
                }
            }
        }
        
        return ans;
    }
}