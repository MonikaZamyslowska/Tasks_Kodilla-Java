package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public void setQuantityOfUsers(int quantityOfUsers) {
        if (quantityOfUsers >= 0) {
            this.quantityOfUsers = quantityOfUsers;
        }
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public void setQuantityOfPosts(int quantityOfPosts) {
        if (quantityOfPosts >= 0) {
            this.quantityOfPosts = quantityOfPosts;
        }
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public void setQuantityOfComments(int quantityOfComments) {
        if (quantityOfComments >= 0) {
            this.quantityOfComments = quantityOfComments;
        }
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public void setAvgPostsPerUser(double avgPostsPerUser) {
        if (avgPostsPerUser >= 0) {
            this.avgPostsPerUser = avgPostsPerUser;
        }
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public void setAvgCommentsPerUser(double avgCommentsPerUser) {
        if (avgCommentsPerUser >= 0) {
            this.avgCommentsPerUser = avgCommentsPerUser;
        }
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void setAvgCommentsPerPost(double avgCommentsPerPost) {
       if (avgCommentsPerPost >= 0) {
           this.avgCommentsPerPost = avgCommentsPerPost;
       }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = statistics.userNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        avgPostsPerUser = quantityOfPosts / quantityOfUsers;
        avgCommentsPerUser = quantityOfComments / quantityOfUsers;
        avgCommentsPerPost = quantityOfComments / quantityOfPosts;
        }

    public String showStatistic() {
        return "Average number of post per user: " + avgPostsPerUser + ", Average number of comments per post: " +
                avgCommentsPerPost + ", Average number of comment per user: " + avgCommentsPerUser;
    }
}