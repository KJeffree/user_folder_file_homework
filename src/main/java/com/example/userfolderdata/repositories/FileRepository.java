package com.example.userfolderdata.repositories;

import com.example.userfolderdata.models.File;
import com.example.userfolderdata.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection =  EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
