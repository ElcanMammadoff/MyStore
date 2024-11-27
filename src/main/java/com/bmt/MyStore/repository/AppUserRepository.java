package com.bmt.MyStore.repository;

import com.bmt.MyStore.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Integer> {

    public AppUser findByEmail(String email);

}
