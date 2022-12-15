class Solution {
    public String getHint(String secret, String guess) {
        
        int[] gu = new int[10];
		int[] sec = new int[10];
        
		int bull = 0;
        
		for (int i=0; i<secret.length(); i++){
			if (secret.charAt(i) == guess.charAt(i)){
				bull++;
			} 
            else{
				gu[guess.charAt(i) - '0']++;
				sec[secret.charAt(i) - '0']++;
			}
		}
        
		int cow = 0;
		for (int i=0; i<10; i++){
			cow = cow +  Math.min(gu[i], sec[i]);
		}
        
		return bull + "A" + cow + "B";
    }
}