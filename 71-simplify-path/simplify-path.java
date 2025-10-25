class Solution {
    public String simplifyPath(String path) {
        	String[] directories = path.split("/");
		Stack<String> st = new Stack<>();
		for(String dir:directories) {
			if(dir.equals(".") || dir.isEmpty()) {
				continue;
			}else if(dir.equals("..")) {
				if(!st.isEmpty()) {
					st.pop();
				}
			}else {
				st.push(dir);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String dir:st) {
		sb.append("/").append(dir);
		}
		return sb.length()>0 ? sb.toString():"/";
    }
}