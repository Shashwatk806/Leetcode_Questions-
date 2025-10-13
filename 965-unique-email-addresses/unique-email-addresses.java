class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> ans = new HashSet<>();
		for(String email : emails) {
			String[] parts = email.split("@");
			String local = parts[0];
			String domain = parts[1];
			if(local.contains("+")) {
				local = local.substring(0, local.indexOf('+'));
			}
			local = local.replace(".", "");
			String str = local+ "@"+ domain;
			ans.add(str);
		}
		return ans.size();
    }
}