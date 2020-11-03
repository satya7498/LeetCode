/*Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.

Return the power of the string.*/


class Solution {
    public int maxPower(String s) {
        int n=s.length();
        int power[]=new int[n];
        
        int k=0;
        
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    c++;
                else
                    break;
                
            }
            power[k++]=c;
            
        }
        Arrays.sort(power);
        return(power[n-1]+1);
        
    }
}