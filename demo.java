
class studant{
    int rollno;
    String name;
    int marks;
}

public class demo {
    public static void main(String[] args) {
        
        studant s1 = new studant();
        s1.name = "krishan";
        s1.marks = 84;
        s1.rollno = 22;
        studant s2 = new studant();
        s2.name = "krishan";
        s2.marks = 84;
        s2.rollno = 22;
         
        studant s3 = new studant();
        s3.name = "krishan";
        s3.marks = 84;
        s3.rollno = 22;
         
       studant studants [] = new studant[3];
       studants[0] = s1;
       studants[1] = s2;
       studants[2] = s3;
       

       for (studant n :studants){
          System.out.println(n.name + " "+n.marks);
       }

    // int  nums [] = new int[4];

    //  nums[0] = 4;
    //  nums[1] = 4;
    //  nums[2] = 4;
    //  nums[3] = 4;



    //  for(int n:nums){
    //     System.out.println(n);
    //  }
}
}
