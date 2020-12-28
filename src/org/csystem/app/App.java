package org.csystem.app;


import org.csystem.util.Console;


import java.util.Arrays;



public class App {
    public static void main(String [] args)
    {
        var device = new DeviceInfo("weathersensor", "192.168.1.234", 50500, 1234, 7890, 3030, 8900);
        Console.writeLine(device.toString());

    }
}

class DeviceInfo {
    private String m_name;
    private String m_host;
    private int [] m_ports;
    public DeviceInfo(String name, String host, int...ports)
    {
        //...
        m_name = name;
        m_host = host;
        m_ports = Arrays.copyOf(ports, ports.length);
        Arrays.sort(m_ports);
    }
    //...
    public String toString()
    {
        return String.format("%s:%s:%s", m_name, m_host,
                Arrays.toString(m_ports));
    }
}

