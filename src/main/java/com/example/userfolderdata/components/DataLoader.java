package com.example.userfolderdata.components;

import com.example.userfolderdata.models.File;
import com.example.userfolderdata.models.Folder;
import com.example.userfolderdata.models.User;
import com.example.userfolderdata.repositories.FileRepository;
import com.example.userfolderdata.repositories.FolderRepository;
import com.example.userfolderdata.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        User user1 = new User("Kelly");
        userRepository.save(user1);

        Folder folder1 = new Folder("Tests", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Models", user1);
        folderRepository.save(folder2);

        File file1 = new File("Bear Test", "rb", 2, folder1);
        fileRepository.save(file1);

        File file2 = new File("River Test", "rb", 3, folder1);
        fileRepository.save(file2);

        File file3 = new File("Bear", "rb", 5, folder2);
        fileRepository.save(file3);

        File file4 = new File("River", "rb", 4, folder2);
        fileRepository.save(file4);
    }
}
