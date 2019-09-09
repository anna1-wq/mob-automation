import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test

    public void testGetLocalNumber()
    {
        int a= this.getLocalNumber();
        boolean b =false;
        assert a==14;

    }

    @Test
    public void testGetClassNumber()
    {
        int a=this.getClassNumber();
        assert a>45;
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
