//package mk.ukim.finki.devops_project.service.impl;
//
//import mk.ukim.finki.devops_project.model.User;
//import mk.ukim.finki.devops_project.model.exceptions.InvalidArgumentException;
//import mk.ukim.finki.devops_project.model.exceptions.InvalidUserCredentialsException;
//import mk.ukim.finki.devops_project.repository.jpa.UserRepositoryDB;
//import mk.ukim.finki.devops_project.service.AuthService;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthServiceClass implements AuthService {
//    private final UserRepositoryDB userRepository;
//
//    public AuthServiceClass(UserRepositoryDB userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//        public User login(String username, String password) {
//            if (username==null || username.isEmpty() || password==null || password.isEmpty()){
//                throw new InvalidArgumentException();
//            }
//            return userRepository.findByUsernameAndPassword(username,password).orElseThrow(InvalidUserCredentialsException::new);
//        }
//
//
//
////    @Override
////        public User register(String username, String password, String repeatPassword, UserFullname userFullname,LocalDate dateOfBirth) {
////            if (username==null || username.isEmpty() || password==null || password.isEmpty()){
////                throw new InvalidArgumentException();
////            }
////            if (!password.equals(repeatPassword)){
////                throw new PasswordsDoNotMatchException();
////            }
////            if (this.userRepository.findByUsername(username).isPresent()
////                    || !this.userRepository.findByUsername(username).isEmpty())
////                throw new UsernameAlreadyExistsException(username);
////
//////            User user=new User(username,name, surname, password,dateOfBirth);
////            User user=new User(username,userFullname, password,dateOfBirth);
////            return userRepository.save(user);
////
////        }
//}
//
//
