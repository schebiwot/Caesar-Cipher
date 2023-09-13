package ke.co.learning.services;

import ke.co.learning.models.testDataModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class DecipherTest {


    @Test
    public void decryptCorrectly()
    {
        testDataModel tm=new testDataModel();
        tm.key=1;
        tm.message="b";
        Decipher decipher=new Decipher(tm.message,tm.key);
        String t= decipher.decrypt();
        assertEquals("a",t);

    }
    @Test
    public void keyShouldbeBetweenOneandTwentyFive()
    {
        testDataModel tm=new testDataModel();
        tm.key=45;
        tm.message="JK";
        Decipher decipher=new Decipher(tm.message,tm.key);
        String t= decipher.decrypt();
        assertEquals("The key should be between 0 and 26!",t);

    }

    @Test
    public void textWithSpecialCharacters()
    {
        testDataModel tm=new testDataModel();
        tm.key=2;
        tm.message="J*k";
        Decipher decipher=new Decipher(tm.message,tm.key);
        String t= decipher.decrypt();
        assertEquals("H*i",t);

    }

}