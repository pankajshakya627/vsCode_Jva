import java.util.ArrayList;
import java.util.LinkedList;

// Implementation of chaining 

public class ChainingImp {
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    ChainingImp(int b)
    {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i=0; i<b; i++)
            table.add(new LinkedList<Integer>());
    }
    void insert(Integer key)
    {
        int i = key%BUCKET;
        table.get(i).add(key);
    }

    void remove(int key)
    {
        int i = key%BUCKET;
        table.get(i).remove((Integer)(i));
    }

    boolean search(int key)
    {
        int i =key%BUCKET;
        return table.get(i).contains(key);
    }



    public static void main(String[] args) 
	{ 
	    ChainingImp mh = new ChainingImp(10);
	    mh.insert(5);
	    mh.insert(10);
	    mh.insert(15);
	    mh.insert(30);
	    System.out.println(mh.search(10));
	    mh.remove(5);
	    System.out.println(mh.search(5));
	}
}
