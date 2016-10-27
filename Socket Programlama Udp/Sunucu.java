/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketsunucu;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.util.Arrays;
/**
 *
 * @author hanife
 */
public class Sunucu{
    private byte[] dizi=new byte[256];
    public Sunucu()
    {
        try
        {
            DatagramSocket soket=new DatagramSocket(8888);
            DatagramPacket gelenveri=new DatagramPacket(dizi,dizi.length);
            DatagramPacket gidenveri=new DatagramPacket(dizi,dizi.length);
            while(true)
            {
                Arrays.fill(dizi, (byte)0);
                soket.receive(gelenveri);
                System.out.println("istemcinin ip adresi : " + gelenveri.getAddress().getHostName() + "istemcinin port "
                        + "numarası : " + gelenveri.getPort() +" istemciden gelen mesaj : " + new String(dizi).trim());
                String ileti=new String(dizi).trim();
                String gonderilen=ileti+"Deneme başarılı";
                gidenveri.setAddress(gelenveri.getAddress());
                gidenveri.setPort(gelenveri.getPort());
                gidenveri.setData(gonderilen.getBytes());
                soket.send(gidenveri);
            }
        }
        catch(IOException i)
        {
            System.err.println(i);
        }
    }
}
