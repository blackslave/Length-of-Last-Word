/**
 * gpē|`CnöŖ|Cę¤ęńóIųvÉCßöįöóvÉs×0\¦ÅößvÉßCĀ¼ŚŌń
 * @author black
 *
 */
public class Solution {
	public int lengthOfLastWord(String s) {
		int result=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{		
				result++;
			}
			if(s.charAt(i)==' ' && result!=0)
			{
				return result;
			}
		}
		return result;
    }
}
