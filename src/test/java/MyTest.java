import com.qiang.utils.MD5Util;
import org.junit.Test;

public class MyTest {

    @Test
    public void testMD5(){

        String admin = MD5Util.getMD5("000000");
        System.out.println(admin);

    }
}
