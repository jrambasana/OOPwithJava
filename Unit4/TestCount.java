package Unit4;
class Count{
    int count;
    Count()
    {   count = 1;       }
    Count(int cnt)
    {   count = cnt;      }
}
public class TestCount {
    public static void main(String[] args) {
        Count c1 = new Count();
        int times = 0;
        for(int i=0 ; i < 100 ; i++)
        {    increment(c1, times);      }
        System.out.println("Count = " + c1.count);
        System.out.println("Times = " + times);        
    }
    static void increment(Count c, int n)
    {
        c.count++;
        n++;
    }
}
