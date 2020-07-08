package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.Folder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FolderRepository extends CrudRepository<Folder, Long> {
}
