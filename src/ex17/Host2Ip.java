package ex17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host2Ip {
    public static void main(String[] args) {
        String hostName = "www.naver.com";

        try {
            InetAddress address = InetAddress.getByName(hostName);
            System.out.println("IP주소: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(hostName + "의 IP주소를 찾을 수 없습니다.");
        }
    }
}
