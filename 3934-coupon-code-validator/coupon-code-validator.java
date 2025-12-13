class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
         List<String> order = Arrays.asList(
                "electronics", "grocery", "pharmacy", "restaurant" );
        Map<String, Integer> priority = new HashMap<>();
        for (int i = 0; i < order.size(); i++) {
            priority.put(order.get(i), i);
        }
        List<String[]> validCoupons = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (!isActive[i]) continue;
            if (!priority.containsKey(businessLine[i])) continue;
            if (code[i] == null || code[i].isEmpty()) continue;
            if (!code[i].matches("[A-Za-z0-9_]+")) continue;
            validCoupons.add(new String[]{
                    businessLine[i],
                    code[i]
            });
        }
        Collections.sort(validCoupons, (a, b) -> {
            int cmp = Integer.compare(
                    priority.get(a[0]),
                    priority.get(b[0])
            );
            if (cmp != 0) return cmp;
            return a[1].compareTo(b[1]);
        });
        List<String> result = new ArrayList<>();
        for (String[] coupon : validCoupons) {
            result.add(coupon[1]);
        }

        return result;
    }
}