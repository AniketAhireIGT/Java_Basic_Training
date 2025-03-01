package ExceptionHandling;

import java.io.*;
import java.sql.*;
class clA
{
    void display() throws IOException,SQLException,ABCException
    {
        for(int i=0;i<=20;i++)
        {
            System.out.println("I :"+i);
            if(i==18) throw new NullPointerException();
            if(i==16) throw new ArrayIndexOutOfBoundsException();
            if(i==14) throw new IOException();
            if(i==13) throw new ArithmeticException();
            if(i==11) throw new SQLException();
            if(i==10) throw new ABCException("Abc Excpetrion ");
 
        }
    }
}
class Demo7
{
    public static void main(String args[])
    {
        try
        {
            clA a= new clA();
            a.display();
            try
            {  
            }
            catch(Exception e)
            {
            }
 
            try
            {  
            }
            catch(Exception e)
            {
            }
            finally
            {
            }
 
 
 
            try
            {  
            }
            finally
            {
            }
 
 
           
 
        }
        catch(NullPointerException np)
        {
            System.out.println("Nullpoiner raised ");
            try
            {  
            }
            catch(Exception e)
            {
            }
        }
        catch(ArrayIndexOutOfBoundsException ai)
        {
                System.out.println("ArrayIndexOutOfBoundsException raised ");
        }
        catch(IOException io)
        {
            System.out.println("Io Exception  raised ");
        }
        catch(ArithmeticException ae)
        {
            System.out.println(" ArithmeticException  raised ");
 
        }
        catch(SQLException sq)
        {
            System.out.println(" SQLException  raised ");
 
        }
        catch(ABCException abc)
        {
            System.out.println(abc.getMessage());
        }
        finally
        {
            System.out.println("Thank yuou ");
            try
            {  
            }
            catch(Exception e)
            {
            }
 
        }
    }
}
class ABCException extends Exception
{
    ABCException(String msg)
    {
        super(msg);
    }
 
}
 