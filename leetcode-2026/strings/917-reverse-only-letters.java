/*Approach
Convert the string into a character array for easy modification.

Use two pointers:

i → start of the array
j → end of the array
While i < j:

If both ch[i] and ch[j] are letters → swap them, then move both pointers.

If ch[i] is not a letter → move i forward.

If ch[j] is not a letter → move j backward.

Convert the modified character array back to a string and return it.

This ensures:
Letters are reversed correctly.
Special characters stay in their original positions.

Complexity
Time complexity:
O(n) - Each character is visited at most once.

Space complexity:
O(n) - Due to the character array used for modification. */
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }else if(!Character.isLetter(ch[i])){
                i++;
            }else {
                j--;
            }
        }
        return String.valueOf(ch);
    }
}