
import com.mycompany.actionsdemo.CurrentTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;


public class TimeTest {
    
    CurrentTime currentTime = new CurrentTime();
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
    private final Date date = new Date();
    private final String testTime = formatter.format(date);
    
    @Test
    public void timeIsCorrect(){
        assertEquals(testTime, currentTime.get());
    }
}
