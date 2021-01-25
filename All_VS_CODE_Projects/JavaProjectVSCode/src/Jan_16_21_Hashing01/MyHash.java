// Implementation of Open Chaining 

public class MyHash 
{
    int[] arr;
    int cap;
    int size;

    // Constructor for initializing Capacity of MyHash
    MyHash(int c)
    {
        cap = c;
        size=0;
        arr = new int[cap];
        for(int i=0; i<cap; i++)
            arr[i] = -1;
    }

    int hash(int key){   
        return key%cap;
    }    

    // Search dunction for MyHash take key(Integer) as arg
    boolean search(int key)
    {
        int h = hash(key);
        int i = h;
        while(arr[i]!=-1)
        {
            if(arr[i] == key)
                return true;
            i = (i+1)%cap;
            if(i==h)
                return false;
        }
        return false;
    }

    boolean insert(int key)
    {
        if(size == cap)
            return false;
        int i = hash(key);

        // Check if the MyHash is emppty(-1) delete(-2)
        while(arr[i] != -1 && arr[i]!=-2 && arr[i]!=key)
            i = (i+1)%cap;
        if(arr[i]==key)
            return false;
        else{
            arr[i] = key;
            size++;
            return true;
        }
    }

    boolean erase(int key)
    {
        int h = hash(key);
        int i=h;
        while (arr[i]!=-1) 
        {
            if(arr[i]==key)
            {
                arr[i] = -2;
                return true;
            }
            i = (i+1)%cap;
            if(i==h)
                return false;
        }
        return false;
    }


    public static void main(String[] args) 
    {
        MyHash h = new MyHash(10);
        h.insert(20);
        h.insert(40);
        h.insert(60);
        h.insert(80);
        
        if(h.search(60))
            System.out.println("Yes");
        else    
            System.out.println("No");
        h.erase(20);
        if(h.search(20))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
    
}
