package com.javapapers.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class DemoCommandPattern {
	public static void main(final String args[]) {

        // OnCommand is instantiated based on active device supplied by Remote
        ConsumerElectronics ce = UniversalRemote.getActiveDevice();
        OnCommand onCommand = new OnCommand(ce);
        Button onButton = new Button(onCommand);
        onButton.click();

        Television tv = new Television();
        SoundSystem ss = new SoundSystem();
        List<ConsumerElectronics> all = new ArrayList<ConsumerElectronics>();
        all.add(tv);
        all.add(ss);
        MuteAllCommand muteAll = new MuteAllCommand(all);
        Button muteAllButton = new Button(muteAll);
        muteAllButton.click();

    }
}
