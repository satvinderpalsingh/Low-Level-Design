# Adapter Design Pattern

## Overview

The Adapter Design Pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that a client expects.

## Purpose

The main purpose of the Adapter Design Pattern is to enable the reuse of existing classes without modifying their source code. It allows for the integration of classes that otherwise could not work together due to incompatible interfaces.

## Structure

The Adapter Design Pattern typically involves the following components:

1. **Target Interface**: This is the interface that the client expects.
2. **Adaptee**: This is the existing class that needs to be adapted.
3. **Adapter**: This is the class that implements the target interface and translates the requests from the client to the adaptee.

## UML Diagram

```
+-----------+      +-----------+      +-----------+
|   Client  |----->|   Target  |<-----|  Adapter  |
+-----------+      +-----------+      +-----------+
                                      |   Adaptee |
                                      +-----------+
```

## Example

Here is a simple example to illustrate the Adapter Design Pattern:

### Target Interface

```java
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
```

### Adaptee

```java
public class AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
```

### Adapter

```java
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new AdvancedMediaPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new AdvancedMediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
```

### Client

```java
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
```

## Usage

To use the Adapter Design Pattern, create an instance of the client class and call its methods with the desired parameters. The adapter will handle the translation of requests to the adaptee.

```java
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
```

## Conclusion

The Adapter Design Pattern is a powerful tool for integrating existing classes with incompatible interfaces. It promotes code reusability and flexibility by allowing objects to work together without modifying their source code.
