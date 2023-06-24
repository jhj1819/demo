package com.example.demo.entity;


import com.example.demo.domain.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "user_table")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(unique = true)
    private String userPassword;
    @Column
    private String userPhone;
    @Column
    private String userName;
    @Column
    private String userAdrress;
    @Column
    private String userBirthDate;

    public  static UserEntity toUserEntity(User user){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserPassword(user.getUserPassword());
        userEntity.setUserPhone(user.getUserPhone());
        userEntity.setUserName(user.getUserName());
        userEntity.setUserAdrress(user.getUserAddress());
        userEntity.setUserBirthDate(user.getUserBirthDate());
        return userEntity;

    }


}
