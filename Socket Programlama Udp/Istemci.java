/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketistemci;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
/**
 *
 * @author hanife
 */
public class Istemci{
    private DatagramPacket gelenPaket;
    private byte[] dizi=new byte[256];
    public Istemci()
    {
    try
    {
        Arrays.fill(dizi, (byte)0);
        DatagramSocket soket=new DatagramSocket();
        InetAddress adres=InetAddress.getByName("localhost");
        DatagramPacket gidenPaket=new DatagramPacket(dizi,dizi.length);
        String ileti="ilk deneme..";
        gidenPaket.setData(ileti.getBytes());
        soket.send(gidenPaket);
        soket.receive(gelenPaket);
        System.out.println("gönderilen mesaj" + ileti);
        System.out.println("sunucudan gelen mesaj" + new String(dizi).trim());
                }
    catch(IOException e)
    {
        System.err.println(e);
    }
    }
}