package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Files;
import com.example.zyberpasspro.model.Folder;

import java.util.List;

public interface IFolderService {

    List<Folder> findAll();
    public Folder createFolder(Folder folder);
    public Folder updateFolder(Folder folder, Long l);
    public Folder getFolder(Long l);
    public Long deleteFolder(Long l);
}
