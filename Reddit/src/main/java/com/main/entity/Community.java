package com.main.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name = "community_tbl")
public class Community {
    private int communityId;
    private String communityName;
    private int owner;
    private String aboutCommunity;
    private String privacy;
    private String topic;
    @OneToMany(mappedBy = "community", cascade = CascadeType.ALL)
    private List<User> peopleList;
    //private List<User> moderators;
}
