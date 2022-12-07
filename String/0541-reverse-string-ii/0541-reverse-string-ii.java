class Solution {
    public String reverseStr(String str, int k) {
        char[] s = str.toCharArray();

	for(int i = 0; i<s.length; i += 2 * k) {
		int left = i; // first character of 2k characters 
		int right = Math.min(i + k - 1, s.length - 1);  // calculate right element (last character of 2k characters), if (i + k) - 1 index > str.length(), than use (s.length) - 1 index => last one
		swap(s, left, right);
	}
	return String.valueOf(s);
}

    public void swap(char[] s, int l, int r){
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}