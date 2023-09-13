package ke.co.learning.services;

public class Cipher {

    private String message;
  private int key;
    //public String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public Cipher(String message, int key) {
        this.message = message;
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }


    public String encrypt() {
        String keyerr="";
        char[] message = this.getMessage().toCharArray();
        String output = "";
        int shift = this.getKey();

        if (shift > 26 || shift < 0) {
            keyerr="The key should be between 0 and 26!";
            return keyerr;
        }
        for (int i = 0; i < message.length; i++) {
            char c = message[i];

            if (Character.isLetter(c)) {
//                if (Character.isLowerCase(c)) {
//                    alphabets.toLowerCase();
//                }//casing
                if (Character.isUpperCase(c)) {
                    c = (char) (c + shift);
                    if (c > 'Z') {
                        output += (char) (c - (26 - shift));
                    } else {
                        output += c;
                    }
                } else if (Character.isLowerCase(c)) {
                    c = (char) (c + shift);
                    if (c > 'z') {
                        output += (char) (c - (26 - shift));
                    } else {
                        output += c;
                    }
                }
            } else {

                output += c;
            }
        }
        return output;
    }



    }







