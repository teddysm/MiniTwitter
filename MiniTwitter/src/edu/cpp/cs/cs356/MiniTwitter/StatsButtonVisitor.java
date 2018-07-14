package edu.cpp.cs.cs356.MiniTwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Thanh T Doan
 * CS 356
 * Prof: Yu Sun
 * Project 2
 */

public class StatsButtonVisitor implements ButtonVisitor {

    private int users = 0;
    private int messages = 0;
    private int groups = 0;
    private double posPercent = 0.0;
    private int positive = 0;
    
    @Override
    public void userTotalVisit(User user) {
        setusers(user.getTotalUsers());
    }

    @Override
    public void totalMessagesVisit(User user) {
        setMessagesTotal(user);
    }

    @Override
    public void groupTotalVisit(Group group) {
        setgroups(group);
    }

    @Override
    public void positivePercentageVisit(User user) {
        List<User> users = new ArrayList();
        List<String> tweets = user.getMessages();
    }
    
    public void setusers(int users) {
        this.users = users;
    }
    
    public void setMessagesTotal(User user) {
        this.messages = user.getMessages().size();
    }
    
    public void setgroups(Group group) {
        this.groups = group.getTotalGroups();
    }
    
    public double getposPercent() {
        return ((positive / messages) * 100.0);
    }
    
    public void setposPercent(double percentage) {
        this.posPercent = 0.0;
    }
}
