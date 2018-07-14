package edu.cpp.cs.cs356.MiniTwitter;


import java.util.*;

/**
 * Thanh T Doan
 * CS 356
 * Prof: Yu Sun
 * Project 2
 */

public class User extends Observable implements Observer, Tree {

    private String ID;
    private List<String> follows;
    private List<String> messages;
    private List<String> feeds;
    private List<User> followers;
    private boolean property;

    private int users = 0;
    private int positiveCount = 0;
    private int messageCount = 0;
    private String[] positiveWords = {"nice", "hello", "good", "cute"};

    public User(String ID) {
        this(ID, false);
        followers = new ArrayList();
        follows = new ArrayList();
        messages = new ArrayList();
        feeds = new ArrayList();
        users++;
    }

    public User(String ID, boolean property) {
        this.ID = ID;
        this.property = property;
        followers = new ArrayList();
        follows = new ArrayList();
        messages = new ArrayList();
        feeds = new ArrayList();
        users++;
    }

    public void follow(String user) {
        follows.add(user);
    }

    public void tweet(String message) {
        messages.add(message);
        setChanged();
        notifyObservers(message);
        feeds.add(0, "- " + ID + ": " + message);
        setChanged();
        notifyObservers(feeds);
        for (String word : positiveWords) {
            if (message.toLowerCase().contains(word)) {
                positiveCount++;
            }
        }
        messageCount++;
    }

    public int getMessageCount() {
        return messageCount;
    }
    
    public List<User> getObserver() {
        return followers;
    }

    public List<String> getMessages() {
        return messages;
    }

    public List<String> getFollows() {
        return follows;
    }
    
    public int getTotalUsers() {
        return users;
    }

    public int getPositiveCount() {
        return positiveCount;
    }

    public void attach(User user) {
        followers.add(user);
    }

    public List<String> getFeeds() {
        return feeds;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public boolean isProperty() {
        return property;
    }

    @Override
    public String toString() {
        return ID;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            feeds.add("[" + ((User) o).getID() + "] - " + (String) arg);
        }
    }
    
    public void  updateFeeds(String message) {
		feeds.add(message);
	}
}
