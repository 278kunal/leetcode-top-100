class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null && t==null)
            return true;
        else if((s==null && t!=null) || (s!=null && t==null))
            return false;
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2)
            return false;
        int count[]=new int[256];
        for(int i=0;i<l1;i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}