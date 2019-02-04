/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televizor;

/**
 *
 * @author cpaad
 */
public class TV {
    public int channel;
    public int volumeLevel;
    public boolean on;
    
    public TV() 
    {
        channel = volumeLevel = 1;
        on = true;
    }
    
    public TV(int c, int v, boolean apr)
    {
        if((c>120 || c<1) || (v>7 || v<1))
        {
            throw new java.lang.Error("Channel is between 1 and 120 and volume between 1 and 7");
        }
        else 
        {
            this.channel = c;
            this.volumeLevel = v;
            this.on = apr;
        }
    }
    
    public void turnOn()
    {
        on = true;
    }
    
    public void turnOff()
    {
        on = false;
    }
    
    public void setChannel(int newChannel)
    {
        if(on == true)
        {
            if(newChannel>=1 || newChannel<=120)
            {
                channel = newChannel;
            }
        }
    }
    
    public void setVolume(int newVolumeLevel1)
    {
        if(on == true)
        {
            if(newVolumeLevel1 >= 1 || newVolumeLevel1 <=7)
            {
                volumeLevel = newVolumeLevel1;
            }
        }
    }
    
    public void channelUp()
    {
        if(on == true)
        {
            if(channel<120)
            {
                channel += 1;
            }   
        }
    }
    
    public void channelDown()
    {
        if(on == true)
        {
            if(channel>1)
            {
                channel -= 1;
            }  
        }
    }
    
      public void volumeUp()
    {
        if(on == true)
        {
            if(volumeLevel<7)
            {
                volumeLevel += 1;
            }   
        }
    }
    
    public void volumeDown()
    {
        if(on == true)
        {
            if(volumeLevel>1)
            {
                volumeLevel -= 1;
            }   
        }
    }
}
