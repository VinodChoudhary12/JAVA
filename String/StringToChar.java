class StringToChar
{
    public static void main(String[] args) {
        String s1 = "NitinMalviya";
        char[] arr= stringToChar(s1);
        
        for(char c : arr)
        {
            System.out.println(c + "");
        }
    }
    public static char[] stringToChar(String s1)
    {
        int length = s1.length();
        char[] arr1 = new char[length];
        for(int i=0;i<length;i++)
        {
            arr1[i] = s1.charAt(i);
        }
        return arr1;
    }
}