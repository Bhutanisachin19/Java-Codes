


import java.util.*; 
class TreeSetExample{ 

	public static void main(String[] args) 
	{ 
        TreeSet obj = new TreeSet();

        obj.add(10);
        obj.add(100);
        obj.add(50);
        obj.add(150);
        obj.add(0);
        obj.add(60);
        obj.add(19);
        obj.add(1);
        obj.add(10);  //duplicates not allowed

        System.out.println(obj); // output -> acc to default sorting order i.e ascending

	} 
} 
