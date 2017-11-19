package com.example.demo.repository;

import com.example.demo.model.SeedBuyList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by song on 2017/10/23.
 */
@RepositoryRestResource
@CrossOrigin
public interface SeedBuyListRepository extends BaseRepository<SeedBuyList, Long> {
    @PreAuthorize("hasRole('ROLE_ADMIN') or #username == authentication?.name")
    public Page<SeedBuyList> findByUsername(@Param("username") String username, Pageable pageable);
    @PreAuthorize("hasRole('ROLE_ADMIN') or #seedBuyList.username == authentication?.name")
    public SeedBuyList save(SeedBuyList seedBuyList);
}  
