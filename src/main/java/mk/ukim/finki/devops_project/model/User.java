//package mk.ukim.finki.devops_project.model;
//
//import lombok.Data;
//import org.springframework.format.annotation.DateTimeFormat;
//
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//
//@Data
//@Entity
//@Table(name = "balloon_users")
//public class User  {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String username;
//    //private String name;
//    //private String surname;
//    @Convert(converter = UserFullnameConvertor.class)
//    private UserFullname userFullname;
//    private String password;
//    @DateTimeFormat(pattern = "dd-MM-yyyy")
//    private LocalDate dateOfBirth;
//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    private List<ShoppingCart> carts;
//
//    private boolean isAccountNonExpired=true;
//    private boolean isAccountNonLocked=true;
//    private boolean isCredentialsNonExpired=true;
//    private boolean isEnabled=true;
//
////    @Enumerated(value = EnumType.STRING)
////    private Role role;
//
//
//    public User(String username, UserFullname userFullname, String password, LocalDate dateOfBir) {
//        this.username = username;
////        this.name = name;
////        this.surname =
//        this.userFullname=userFullname;
//        this.password = password;
//        this.dateOfBirth = dateOfBirth;
//        this.role=role;
//
//    }
//
//    public User() {
//
//    }
//
//
//
//
//}
