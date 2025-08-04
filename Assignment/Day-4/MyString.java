/* */

import java.util.Scanner;

public class MyString {
   String str;
   char[] chr;
   MyString(){}
   MyString(String str)
  {
     this.str=str;
     chr=str.toCharArray();
  }

  int len()
  {
   int count=0;
 
    for(char a:chr)
    {
     count++;   
    }
    return count;
   }

   char charAt(int index)
   {
     return chr[index];
   }

   boolean equal(MyString others)
   {
     if(this.len()!=others.len()) 
      { 
       return false;
      }
        
     for(int i=0;i<others.len();i++)
     {
       if(str.charAt(i)!=others.charAt(i))
       {
          return false;
       }
     }
    return true; 
   } 

   String toUpper()
   {
     String out="";
     for(int i=0;i<this.len();i++)
       {
         char check=this.charAt(i);
           if(check>='a' && check<='z') 
              out+=(char)(check-32);
            else
              out+=check;             
       }
     return out;
    }

   String toLower()
   {
     String out="";
     for(int i=0;i<this.len();i++)
       {
         char check=this.charAt(i);
           if(check>='A' && check<='Z') 
              out+=(char)(check+32);
            else
              out+=check;             
       }
     return out;
    }

   String substr(int start, int end) 
     {
       String res="";
       for(int i=start;i<end;i++)
         {
           res+=this.charAt(i);
         } 
        return res;
     }

   String substr(int start) 
     {
       String res="";
       for(int i=start;i<this.len();i++)
         {
           res+=this.charAt(i);
         } 
        return res;
     }

   String concat(MyString other)
   {
       return this.str+other.str;
   }
   
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the String : ");
    String str=obj.nextLine();
    MyString st=new MyString(str);
    System.out.println("The String length : "+st.len());
    System.out.println("Enter the Index : ");
    int index=obj.nextInt();
    System.out.println("Specific index of "+index +" in "+str+ " is "+st.charAt(index));
    MyString other=new MyString("Hellow");
    System.out.println(st.equal(other));
   System.out.println("The UpperCase is : "+st.toUpper());
   System.out.println("The LowerCase is : "+st.toLower());
   System.out.println("The Substring is : "+st.substr(2));
   System.out.println("The Substring is : "+st.substr(2,4));
   
   System.out.println("The Whole String is : "+st.concat(other));
     
  }
}
