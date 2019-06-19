class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        for(int a = 0; a<J.length(); a++){
            char x = J.charAt(a);
            for(int b = 0; b<S.length(); b++){
                if(x==S.charAt(b)) sum++;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(new Solution().numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(new Solution().numJewelsInStones("zz", "ZZAbbbb"));
        System.out.println(new Solution().numJewelsInStones("aA", "aAAabAb"));
        System.out.println(new Solution().numJewelsInStones("aA", "aAAbbbb"));
    }
}