public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int res=0;
//     for(int i=0;i<32;i++) {
//         res=res<<1;
        
//     }
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(n));
        sb=sb.reverse();
        while(sb.length()<32)
            sb.append(0);
        //System.out.println(sb);
        long reverse=Long.parseLong(sb.toString(),2);
        res=(int)reverse;
        return res;
    }
}