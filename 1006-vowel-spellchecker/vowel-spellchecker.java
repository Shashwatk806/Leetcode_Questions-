class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
         Set<String> exact = new HashSet<>();
	 HashMap<String,String> caseinsensitive = new HashMap<>();
	 HashMap<String,String> consonate = new HashMap<>();
	 for(String word:wordlist) {
		 exact.add(word);
		 caseinsensitive.putIfAbsent(word.toLowerCase(), word);
		 consonate.putIfAbsent(replacevowel(word.toLowerCase()), word);
		 }
	 String[] ans = new String[queries.length];
	 for(int i = 0;i<queries.length;i++) {
		  String query = queries[i];
		 String qlower = query.toLowerCase();
		 String devowel = replacevowel(qlower);
		 if(exact.contains(query)) {
			 ans[i] = query;
		 }else if(caseinsensitive.containsKey(qlower)) {
			 ans[i] = caseinsensitive.get(qlower);
		 }else if(consonate.containsKey(devowel)) {
			ans[i] = consonate.get(replacevowel(devowel));
		 }else {
			 ans[i] = "";
		 }
	 }
	 return ans;
	}
	 private static String replacevowel(String word) {
	        // Replace all vowels (both uppercase and lowercase) with '*'
	         StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}