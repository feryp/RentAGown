package com.example.rentagown.Model;

public class Review {
    String nameUser;
    String ratings;
    String timeReview;
    String commentReview;

    public Review(String nameUser, String ratings, String timeReview, String commentReview) {
        this.nameUser = nameUser;
        this.ratings = ratings;
        this.timeReview = timeReview;
        this.commentReview = commentReview;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getTimeReview() {
        return timeReview;
    }

    public void setTimeReview(String timeReview) {
        this.timeReview = timeReview;
    }

    public String getCommentReview() {
        return commentReview;
    }

    public void setCommentReview(String commentReview) {
        this.commentReview = commentReview;
    }
}
