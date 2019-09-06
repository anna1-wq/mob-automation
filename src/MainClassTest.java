import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test

    public void testGetLocalNumber()
    {
        int a= this.getLocalNumber();
        boolean b =false;
        if(a==14)
        {
            b=true;
        } else
        {
            b=false;
        }
        assert b;
    }

    @Test
    public void testGetClassNumber()
    {
        int a=this.getClassNumber();
        boolean b = false;
        if (a>45)
        {
            b = true;
        }
        else
        {
            b=false;
        }
        assert b;
    }

    @Test
    public void testGetClassString()
    {
        String s =this.getClassString();
        boolean isContain = s.contains("Hello");
        boolean isContain2= s.contains("hello");
        assert (isContain || isContain2);


    }
}
