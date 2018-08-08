/**
 * 使用迴圈掃描，從尾到頭掃，讀取非空白的字串計數，過程中若遇到空白且計數不為0表示最尾已計數過，可直接返回
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
