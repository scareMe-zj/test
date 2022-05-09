package homework;

public class StringDemo {
    public static void main(String[] args) {
//        String palindrome = "Dot saw I was Tod";
//        int len = palindrome.length();
//        char[] tempCharArray = new char[len];
//        char[] charArray = new char[len];
//        for (int i = 0; i < len; i++) {
//            tempCharArray[i] = palindrome.charAt(i);
//        }
//        for (int j = 0; j < len ; j++) {
//            charArray[j] = tempCharArray[len - 1 - j];
//        }
//        String reversePalindrome = new String(charArray);
//        System.out.println(reversePalindrome);
        String s="hello1234";
        char[] ch=s.toCharArray();
        int len=s.length();
        for(int i=0;i<len;i++){
            if(ch[i]>='a'&&ch[i]<='z'){
                ch[i]-=32;
            }
            if(ch[i]>='0'&&ch[i]<='9'){
                ch[i]+=1;
            }
        }
        for(char c:ch){
            System.out.print(c);
        }
    }

}
