package ke.co.learning.services;

import ke.co.learning.models.testDataModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    public void encryptCorrectly()
    {
        testDataModel tm=new testDataModel();
        tm.key=2;
        tm.message="HI";
        Cipher cipher=new Cipher(tm.message,tm.key);
        String t= cipher.encrypt();
        assertEquals("JK",t);

    }
    @Test
    public void keyShouldbeBetweenOneandTwentyFive()
    {
        testDataModel tm=new testDataModel();
        tm.key=45;
        tm.message="JK";
        Cipher cipher=new Cipher(tm.message,tm.key);
        String t= cipher.encrypt();
        assertEquals("The key should be between 0 and 26!",t);

    }

    @Test
    public void textWithSpecialCharacters()
    {
        testDataModel tm=new testDataModel();
        tm.key=2;
        tm.message="{{HI=={";
        Cipher cipher=new Cipher(tm.message,tm.key);
        String t= cipher.encrypt();
        assertEquals("{{JK=={",t);

    }

}