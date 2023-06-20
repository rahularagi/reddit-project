package com.main.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.List;


    @Entity
    @Table(name = "post_tbl")
    @Getter
    @Setter
    @NoArgsConstructor
    public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "post_id")
        private Long postId;

        @Column(name = "title")
        private String title;

        @Column(name = "content")
        private String content;

        @Column(name = "is_published")
        private Boolean isPublished;

        @Column(name = "published_at")
        @CreationTimestamp
        private Timestamp publishedAt;

        @Column(name = "updated_at")
        @UpdateTimestamp
        private Timestamp updatedAt;

        @Column(name = "is_community")
        private Boolean isCommunity;

        @ManyToOne(targetEntity = Community.class)
        @JoinColumn(name ="community_id")
        private Community community;

        @ManyToOne(targetEntity = User.class)
        @JoinColumn(name = "user_id")
        private User user;

        @OneToMany(mappedBy = "post")
        private List<Comment> comments;

        @OneToMany(mappedBy = "post")
        private List<Reply> replies;

        @OneToMany(mappedBy = "post")
        private List<Vote> postVotes;
    }