public class AddBorder {

  public static String[] addBorder(String[] picture){
    String[] r=new String[picture.length+2];

    for(int i=0;i<picture.length;i++){
      r[i+1] = "*" + picture[i] + "*";
    }

    r[picture.length+1]= r[1].replaceAll(".","*");
    r[0]=r[picture.length+1];

    return r;
  }

  public static void main(String[] args) {
    String[] a={"abc","ded"};
    String[] res= addBorder(a);
    for(int i=0;i<res.length;i++){
      System.out.println(res[i]);
    }
  }

}
/*
Output:

    *****
    *abc*
    *ded*
    *****
*/