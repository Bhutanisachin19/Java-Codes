

// to get repeated numbers using collection

import java.util.*; 
class SetExample{ 
	public static void main(String[] args) 
	{ 
        int arr[] = {1,2,3,5,4,5,5,5,6,6,7,10,7,11,1,11,19};
		// Set demonstration using HashSet 

		Set s = new HashSet(); 

        System.out.println("Repeated Numbers are");
        
        for(int i=0;i<arr.length;i++)
        {
            if(s.add(arr[i])== false)
            {
                System.out.println(arr[i]);
            }
        }

        System.out.println("NON Repeated Numbers are");

        System.out.println(s);

	} 
} 
