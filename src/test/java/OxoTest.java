import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class OxoTest {


    @Test
    public void test1stRowWin() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.O,Oxo.State.O,Oxo.State.O},{Oxo.State.X,Oxo.State.X,Oxo.State.O}
                                ,{Oxo.State.X,Oxo.State.O,Oxo.State.O}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.O),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),false);
    }
    @Test
    public void test2ndRowWin() throws Exception{
        Oxo.State [][] oxoinput = {{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.EMPTY}
                                ,{Oxo.State.X,Oxo.State.X,Oxo.State.X},{Oxo.State.X,Oxo.State.O,Oxo.State.O}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.O),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),true);
    }
    @Test
    public void test3rdRowWin() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.EMPTY}
                                ,{Oxo.State.X,Oxo.State.X,Oxo.State.O},{Oxo.State.O,Oxo.State.O,Oxo.State.O}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.O),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),false);
    }
    @Test
    public void test1stColWin() throws Exception{
        Oxo.State [][] oxoinput = {{Oxo.State.X,Oxo.State.EMPTY, Oxo.State.O}
                                ,{Oxo.State.X,Oxo.State.X,Oxo.State.O},{Oxo.State.X, Oxo.State.EMPTY, Oxo.State.X}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid, Oxo.State.O),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid, Oxo.State.X),true);
    }
    @Test
    public void test2ndColWin() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.EMPTY,Oxo.State.O,Oxo.State.O},{Oxo.State.X,Oxo.State.O
                                ,Oxo.State.O},{Oxo.State.X,Oxo.State.O,Oxo.State.X}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.O),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),false);
    }
    @Test
    public void test3rdColWin() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.EMPTY,Oxo.State.O,Oxo.State.O},{Oxo.State.EMPTY
                                    ,Oxo.State.O,Oxo.State.O},{Oxo.State.EMPTY,Oxo.State.X,Oxo.State.O}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.O),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),false);
    }

    @Test
    public void testDiagWin() throws Exception{
        Oxo.State [][] oxoinput = {{Oxo.State.X,Oxo.State.EMPTY,Oxo.State.O}
                            ,{Oxo.State.O,Oxo.State.X,Oxo.State.O},{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.X}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.O),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),true);
    }
    @Test
    public void testAntiDiagWin() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.O,Oxo.State.EMPTY,Oxo.State.O}
                    ,{Oxo.State.X,Oxo.State.O,Oxo.State.O},{Oxo.State.O,Oxo.State.EMPTY,Oxo.State.X}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.O),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),false);
    }
    @Test
    public void NoWin() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.O,Oxo.State.EMPTY,Oxo.State.O}
                        ,{Oxo.State.EMPTY,Oxo.State.X,Oxo.State.O},{Oxo.State.O,Oxo.State.EMPTY,Oxo.State.X}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid, Oxo.State.O),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid, Oxo.State.X),false);
    }
    @Test
    public void Allnulls() throws Exception{
        Oxo.State [][] oxoinput = {{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.EMPTY}
        ,{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.EMPTY},{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.EMPTY}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid, Oxo.State.O),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid, Oxo.State.X),false);
    }
    @Test
    public void NoWin_1() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.O,Oxo.State.X,Oxo.State.O}
                                ,{Oxo.State.EMPTY,Oxo.State.X,Oxo.State.EMPTY},{Oxo.State.O,Oxo.State.O,Oxo.State.EMPTY}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid, Oxo.State.O),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),false);
    }
    @Test
    public void NoWin_2() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.O,Oxo.State.X,Oxo.State.EMPTY}
        ,{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.EMPTY},{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.EMPTY}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid, Oxo.State.O),false);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),false);
    }
    @Test
    public void Win_diag_with_nulls() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.O,Oxo.State.EMPTY,Oxo.State.EMPTY}
                        ,{Oxo.State.EMPTY,Oxo.State.O,Oxo.State.EMPTY},{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.O}};
        Oxo oxogrid = new Oxo(oxoinput);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.O),true);
        Assertions.assertEquals(Oxo.findWinners(oxogrid,Oxo.State.X),false);
    }
    @Test
    public void GridSizeExceptionThrow() throws Exception{
        Oxo.State[][] oxoinput = {{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.EMPTY},{Oxo.State.EMPTY,Oxo.State.EMPTY,Oxo.State.EMPTY}};
        Oxo oxogrid;
        Assertions.assertThrows(ClassCastException.class,()->new Oxo(oxoinput));
    }
}
