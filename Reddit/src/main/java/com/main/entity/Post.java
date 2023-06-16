package com.main.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "post_tbl")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;
    private String postTitle;
    private String postContent;
    private boolean isPostPublished;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private boolean isCommunity;
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public String getPostTitle() {
        return postTitle;
    }
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public boolean isPostPublished() {
        return isPostPublished;
    }

    public void setPostPublished(boolean postPublished) {
        isPostPublished = postPublished;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isCommunity() {
        return isCommunity;
    }

    public void setCommunity(boolean community) {
        isCommunity = community;
    }
}
