
import java.util.*;
class sort {
    public static void main(String args[]) {
       ArrayList<String> j=new ArrayList<>();
       
       j.add("Pratik Thapa");
       j.add("Hari Kumar Karki");
       j.add("Shyam Govind Sharma");
       j.add("Wilson Karki");
       j.add("Baladev Thapa");
       System.out.print("Input  ");
       System.out.println(j);
       Collections.sort(j, new Comparator<String>() {
 
            public int compare(String o1, String o2) {
                    String[] split1 = o1.split(" ");
                    String[] split2 = o2.split(" ");
                    String lastName1 = split1[split1.length-1];
                    String lastName2 = split2[split2.length-1];
                    if(lastName1.compareTo(lastName2) == 0){
                        return 0;
                    }
                    else if (lastName1.compareTo(lastName2) > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                
            }
        });
        System.out.println();
        System.out.print("output  ");
        System.out.println(j);
        
    }
}