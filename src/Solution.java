/**
 * �g�p珚��|�`�C�n�������|�C椎��󔒓I�����v�ɁC�ߒ���������󔒊��v�ɕs��0�\���Ŕ��ߌv�ɉ߁C���ڕԉ�
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
