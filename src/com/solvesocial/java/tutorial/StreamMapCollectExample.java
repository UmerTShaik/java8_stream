package com.solvesocial.java.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
    public static void main(String[] args) {

        //Before java 8 start
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Mark", "pswd", "m@m.com"));
        users.add(new User(4, "Antonry", "pswd1", "m1@m.com"));
        users.add(new User(2, "Ellis", "pswd2", "m2@m.com"));
        users.add(new User(3, "Belony", "pswd3", "m3@m.com"));

        List<UserDTO> usersDto = new ArrayList<UserDTO>();
        UserDTO dto = null;

        for(User user:users){
            usersDto.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }

        for(UserDTO dt:usersDto){
            System.out.println(dt);
        }
        // //Before java 8 end

        //Using stream API map and collect method in java 8.Here map takes Function <T,r >with apply method
        users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
            }
        });

        System.out.println("*****");
        //converting above to lambda expression
        users.stream().map((User user)-> new UserDTO(user.getId(), user.getUserName(), user.getEmail() )).collect(Collectors.toList())
                .forEach((userDto)->{
                    System.out.println(userDto);
                });



    }
}

class UserDTO{
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        super();
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ",  email='" + email + '\'' +
                '}';
    }
}



class User{
    private int id;
    private String userName;
    private String passwrod;
    private String email;

    public User(int id, String userName, String passwrod, String email) {
        super();
        this.id = id;
        this.userName = userName;
        this.passwrod = passwrod;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passwrod='" + passwrod + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
