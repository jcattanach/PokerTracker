package com.jackcattanach.PokerTool.repository;

import com.jackcattanach.PokerTool.Repository.UserRepository;
import com.jackcattanach.PokerTool.entity.UserEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTests {

    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("JUnit test for save employee operation")
    public void givenUserEntity_whenSave_thenReturnSavedUser(){ // given_when_then

        // given - precondition or setup
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("Jack");
        userEntity.setEmail("jack@fakeEmail.com");

        // when - action or the behavior that we are going to test
        UserEntity savedUser = userRepository.save(userEntity);

        // then - verify the output
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getUserId()).isGreaterThan(0);

    }
}
