package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Folder;
import com.example.zyberpasspro.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FolderService implements IFolderService {
    @Autowired
    private FolderRepository folderRepository;
    @Override
    public List<Folder> findAll() {
        return (List<Folder>) folderRepository.findAll() ;
    }

    @Override
    public Folder createFolder(Folder folder) {
       return  folderRepository.save(folder);
    }

    @Override
    public Folder updateFolder(Folder folder, Long l) {
        return null;
    }

    @Override
    public Folder getFolder(Long l) {
        return folderRepository.findById(l).orElseThrow(() -> new AdminNotFoundException(l));
    }

    @Override
    public Long deleteFolder(Long l) {
          folderRepository.deleteById(l);
          return l;

    }
}
