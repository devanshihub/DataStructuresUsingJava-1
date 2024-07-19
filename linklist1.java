package data_structures_java;
import java.util.*;
class node
{
    int data;
    node next;
    node(int a)
    {
        data=a;
        next=null;
    }
}

class link
{
     node start=null;

     void addlast(int x)
      {
         node ptr=new node(x);
         if (start==null)
         start=ptr;

         else
         {
          node t=start;
          while(t.next!=null)
          {
            t=t.next;
          }
          t.next=ptr;
         }
       }
      void addfirst(int x)
      {
        node ptr=new node(x);
         if (start==null)
         start=ptr;

         else
         {
            ptr.next=start;
            start=ptr;
         }
      }

      void disp()
      {
        if (start==null)
        System.out.println("\nlist is empty");

        else 
        {
            node t=start;
            System.out.println("\nlist is : ");
            while(t!=null)
            {
                System.out.print(t.data+" ");
                t=t.next;
            }
        }
      }

      void getfirst()
      {
        if (start==null)
        System.out.println("\nlist is empty");

        else 
        {
          System.out.println("\nfirst node data : "+start.data);
        }

      }
      void getlast()
      {
        if (start==null)
        System.out.println("\nlist is empty");

        else 
        {
          node t=start;
          while(t.next!=null)
          {
            t=t.next;
          }
          System.out.println("\nlast node data : "+t.data);
        }

      }
      int count()
      {
        int c=0;
        node t=start;
        while(t!=null)
        {
          c++;
          t=t.next;
        }
        return c;
      }

      int sum()
      {
        int s=0;
        node t=start;
        while(t!=null)
        {
          s+=t.data;
          t=t.next;
        }
        return s;
      }

      int big()
      {
        int bnum=Integer.MIN_VALUE;
        if (start==null)
        {
          System.out.println("\nlist is empty");
          bnum=0;
        }
        else
        {
         node t=start;
         while(t!=null)
         {
          if (bnum<t.data)
            bnum=t.data;

           t=t.next;
         }
        }
        return bnum;
      }
      void removefirst()
      {
        if (start==null)
        System.out.println("\nlist is empty");
        else
        {
          node ptr=start;
          start=start.next;
          ptr=null;
        }
      }
      void removelast()
      {
        if (start==null)
        System.out.println("\nlist is empty");
        else if(start.next==null)
        {
          start=null;
        }
        else
        {
          node t=start;
          node r=start.next;

          while(r.next!=null)
          {
            t=r;
            r=r.next;
          }
          t.next=null;
          r=null;
        }
      }
      int search(int item)
      {
        int p=-1;
        node t=start;
       int i=0;
       
        while(t!=null)
        {
          if (t.data==item)
          {
            p=i;
            break;
          }
          i++;
          t=t.next;
        }
        return p;
      }
      void reverse()
      {
        node t=start;
        node previous=null;
        node current=null;

        while(t!=null)
        {
          current=t.next;
          t.next=previous;
          previous=t;
          t=current;
        }
        start=previous;
      }
      void addatindex(int p,int x)
      {
        if(p<0 || p>count())
        System.out.println("\ncan not add at given index");

        else if (p==0)
        addfirst(x);

        else if(p==count())
        addlast(x);

        else
        {
          node ptr=new node(x);
          node t=start;
          int i;
          for(i=1;i<p;i++)
          {
            t=t.next;
          }
          ptr.next=t.next;
          t.next=ptr;
        }

      }

      int getatindex(int p)
      {
        int value=-1;
        if(p<0 || p>count()-1)
        System.out.println("\ncan not add at given index");

        else
        {
          int i=0;
          node t=start;
          for(i=0;i<p;i++)
          {
            t=t.next;
          }
          value=t.data;
          
        }
        return value;

      }
      void removeatindex(int p)
      {
        if(p<0 || p>count()-1)
        System.out.println("\ncan not remove at given index");

        else if(p==0)
        removefirst();

        else if (p==count()-1)
        removelast();

        else
        {
          int i=0;
          node t=start;
          for(i=0;i<p-1;i++)
          {
            t=t.next;
          }
          
          t.next=t.next.next;
        }
      }
}

public class linklist1
{
   public static void main(String k[])
   {
    link ob1=new link();
  
   int ans=1;

   while(ans==1)
   {
    Scanner ob=new Scanner (System.in);
    int choice;
    System.out.println("\n----------COMMANDS----------");
    System.out.println("1. add value at last index-----void addlast(int x)");
    System.out.println("2. add value at first index-----void addfirst(int x)");
    System.out.println("3. display data of all nodes-----void disp()");
    System.out.println("4. to get first element-----void getfirst()");
    System.out.println("5. to get last element-----void getlast()");
    System.out.println("6. to count no of nodes-----int count()");
    System.out.println("7. to get sum of all nodes data-----int sum()");
    System.out.println("8. get biggest element-----int big()");
    System.out.println("9. remove first element-----void removefirst()");
    System.out.println("10. to remove last element-----void removelast()");
    System.out.println("11. to get index of an element-----int search(int item)");
    System.out.println("12. reverse a linklist-----void reverse()");
    System.out.println("13. add element at a index -----void addatindex(int p,int x)");
    System.out.println("14. get element at a index -----int getatindex(int p)");
    System.out.println("15. remove at index-----void removeatindex(int p)");
    System.out.println("-------------END------------\n");
    System.out.println("enter your choice : ");
    choice=ob.nextInt();

    if (choice==1)
    {
        int val;
        System.out.println("enter value");
        val=ob.nextInt();
        ob1.addlast(val);
    }
    else if (choice==2)
    {
        int val;
        System.out.println("enter value");
        val=ob.nextInt();
        ob1.addfirst(val);
    }
    else if (choice==3)
    {
        ob1.disp();
    }
    else if (choice==4)
    {
        ob1.getfirst();
    }
    else if (choice==5)
    {
        ob1.getlast();
    }
    else if (choice==6)
    {
       int c=ob1.count();
        System.out.println("\nno of nodes are : "+c);
        
    }
    else if (choice==7)
    {
        int s=ob1.sum();
        System.out.println("\nsum of  elements is : "+s);
    }
    else if (choice==8)
    {
       int b=ob1.big();
        System.out.print("\nbiggest element is : "+b);
    }
    else if (choice==9)
    {
       ob1.removefirst();
        
    }
    else if (choice==10)
    {
       ob1.removelast();
        
    }
    else if (choice==11)
    {
      int val;
      System.out.print("\nenter element to be saerched : ");
      val=ob.nextInt();
       int p=ob1.search(val);

       if (p==-1)
       System.out.print("\nnot found");
       else
       System.out.print("\n found at index "+p);
        
    }
    else if (choice==12)
    {
       ob1.reverse();
        
    }
    else if (choice==13)
    {

      int val,pos;
      System.out.print("\nenter element and index : ");
      val=ob.nextInt();
      pos=ob.nextInt();
      ob1.addatindex(pos,val);
        
    }
    else if (choice==14)
    {

      int val,pos;
      System.out.print("\nenter index : ");
      pos=ob.nextInt();
      val=ob1.getatindex(pos);
      System.out.print("\nvalue is  : "+val);
        
    }
    else if (choice==15)
    {

      int pos;
      System.out.print("\nenter index : ");
      pos=ob.nextInt();
      ob1.removeatindex(pos);
        
    }
    System.out.print("\nwant to continue: true-1 / false-0");
    ans=ob.nextInt();
   }
   }
}