package com.example.userfolderdata.projections;

import com.example.userfolderdata.models.File;
import com.example.userfolderdata.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();

}
