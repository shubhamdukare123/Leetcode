class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch-97; //calculating array index
            arr[index] = arr[index] + 1;
            
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            int index = ch-97;
            if(arr[index] != 0) {
                arr[index] = arr[index] - 1;
            }
        }

        int count = 0;

        for(int i=0; i<26; i++) {
            count = count + arr[i];
        }

        return count;

    }
}

T.C -  O(N+N+26) = O(N)
S.C - O(26) = O(1)
