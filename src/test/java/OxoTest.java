import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class OxoTest {
    @Test
    public void testGridValidity() throws Exception{
        String[][] oxoinput = {{"O","O","O"},{"X","X","O"},{"X","J","O"}};
        Oxo oxogrid;
        Assertions.assertThrows(ClassCastException.class,()->new Oxo(oxoinput));
    }

    @Test
    public void test1stRowWin() throws Exception{
        String[][] oxoinput = {{"O","O","O"},{"X","X","O"},{"X","O","O"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),false);
    }
    @Test
    public void test2ndRowWin() throws Exception{
        String[][] oxoinput = {{null,null,null},{"X","X","X"},{"X","O","O"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),true);
    }
    @Test
    public void test3rdRowWin() throws Exception{
        String[][] oxoinput = {{null,null,null},{"X","X","O"},{"O","O","O"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),false);
    }
    @Test
    public void test1stColWin() throws Exception{
        String[][] oxoinput = {{"X",null,"O"},{"X","X","O"},{"X",null,"X"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),true);
    }
    @Test
    public void test2ndColWin() throws Exception{
        String[][] oxoinput = {{null,"O","O"},{"X","O","O"},{"X","O","X"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),false);
    }
    @Test
    public void test3rdColWin() throws Exception{
        String[][] oxoinput = {{null,"O","O"},{null,"O","O"},{null,"X","O"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),false);
    }

    @Test
    public void testDiagWin() throws Exception{
        String[][] oxoinput = {{"X",null,"O"},{"O","X","O"},{null,null,"X"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),true);
    }
    @Test
    public void testAntiDiagWin() throws Exception{
        String[][] oxoinput = {{"O",null,"O"},{"X","O","O"},{"O",null,"X"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),false);
    }
    @Test
    public void NoWin() throws Exception{
        String[][] oxoinput = {{"O",null,"O"},{null,"X","O"},{"O",null,"X"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),false);
    }
    @Test
    public void Allnulls() throws Exception{
        String[][] oxoinput = {{null,null,null},{null,null,null},{null,null,null}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),false);
    }
    @Test
    public void GridSizeExceptionThrow() throws Exception{
        String[][] oxoinput = {{null,null,null},{null,null,null}};
        Oxo oxogrid;
        Assertions.assertThrows(ClassCastException.class,()->new Oxo(oxoinput));
    }
    @Test
    public void LowerCaseTest() throws Exception{
        String[][] oxoinput = {{"o",null,"o"},{null,"x","o"},{"o",null,"x"}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),false);
    }
//    @Test
//    public void DashRepresentation() throws Exception{
//        String[][] oxoinput = {{"o","-","o"},{"-","x","o"},{"o","-","x"}};
//        Oxo oxogrid = new Oxo(oxoinput);
//        Assertions.assertEquals(Oxo.findWinners(oxogrid,"O"),false);
//        Assertions.assertEquals(Oxo.findWinners(oxogrid,"X"),false);
//    }
}
