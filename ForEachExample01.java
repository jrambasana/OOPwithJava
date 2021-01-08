public class ForEachExample01 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        for(int i : arr)
        {
            if(i>30)
                System.out.println("If Marks>30 Then You are Pass. Marks: "+i);
            else    
                System.out.println("If Marks<30 Then You are Fail. Marks: "+i);
        }
    }    
}
