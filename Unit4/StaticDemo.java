package Unit4;

class ObjectCounter{
    static final int OBJECT_ODD = 1;
    static final int OBJECT_EVEN = 2;
    private int type = 0;

    private static int totalObjectsCount = 0;
    private int objectNumber = 0;

    ObjectCounter(){
        totalObjectsCount++;
        objectNumber = totalObjectsCount;
        if(objectNumber%2 == 0)
            type = OBJECT_EVEN;
        else
            type = OBJECT_ODD;
    }

    public static int getTotalObjectsCount()
    {
        return totalObjectsCount;
    }

    public String toString()
    {
        String str = "Object number: " + objectNumber + " ";
        if(type == OBJECT_EVEN)
            str = str + "(EVEN OBJECT)";
        else
            str = str + "(ODD OBJECT)";
        
        return str;
    }
}

public class StaticDemo {
    public static void main(String args[]) 
    {
        ObjectCounter oc1 = new ObjectCounter();
        ObjectCounter oc2 = new ObjectCounter();
        ObjectCounter oc3 = new ObjectCounter();
        ObjectCounter oc4 = new ObjectCounter();

        System.out.println("Total no of objects created: " + ObjectCounter.getTotalObjectsCount());
        System.out.println(oc1);
        System.out.println(oc2);
        System.out.println(oc3);
        System.out.println(oc4);
    }
}
