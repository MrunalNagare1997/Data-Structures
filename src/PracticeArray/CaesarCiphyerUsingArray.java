package PracticeArray;

import java.util.Scanner;

class Encryption
{
    String planeText;
    char [] cipherText;
    char referenceArray [];

    Encryption()
    {
        planeText="";
        referenceArray=new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    }

    public void performEncryption(String text, int key)
    {
        cipherText=new char[text.length()];
        for(int i=0;i<text.length();i++)
        {
            for(int j=0;j<referenceArray.length;j++)
            {
                if(text.charAt(i)==referenceArray[j])
                    //System.out.println(i);
                    cipherText[i] = referenceArray[(j + key) % 26];
            }
        }
        System.out.println(cipherText);
    }


}

public class CaesarCiphyerUsingArray {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        int key;
        String planeText;

        System.out.println("Enter the plane text...");
        planeText=sc.next();

        System.out.println("Enter the Key for encryption...");
        key=sc.nextInt();

        Encryption encryptionObj= new Encryption();
        encryptionObj.performEncryption(planeText,key);
    }

}
