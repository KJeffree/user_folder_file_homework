package com.example.userfolderdata;

import com.example.userfolderdata.models.File;
import com.example.userfolderdata.models.Folder;
import com.example.userfolderdata.models.User;
import com.example.userfolderdata.repositories.FileRepository;
import com.example.userfolderdata.repositories.FolderRepository;
import com.example.userfolderdata.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserfolderdataApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateFileFolderAndUser(){

		User user = new User("Jane");
		userRepository.save(user);

		Folder folder = new Folder("Random Items", user);
		folderRepository.save(folder);

		File file = new File("Random Stuff", "java", 5, folder);
		fileRepository.save(file);
	}

}
