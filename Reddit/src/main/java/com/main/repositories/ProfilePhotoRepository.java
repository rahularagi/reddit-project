package com.main.repositories;

import com.main.entity.ProfilePhoto;
import com.main.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilePhotoRepository extends JpaRepository<ProfilePhoto,Integer> {

}
