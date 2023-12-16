package StructuralDP.AdapterDP;

public class Adapter {
    class OldUser {
        int id;
        String username;
        String name;
        String LastName;
    }

    interface OldUserService { // eski sistemin servis katmanı
        OldUser getUser(int id);//id üzerinden sorgu yapılır

    }

    class User {
        int id;
        String email;
        String username;
        String name;
        String lastName;
        String location;
        Boolean isActive;
    }

    //yeni sistem repo
    interface UserRepository {
        User getuser(String email);
    }

    //yeni sistem service
    interface UserService {
        User getuser(String email);
    }

    class UserServiceAdapter implements UserService {

        UserRepository userRepository;
        OldUserService oldUserService;

        @Override
        public User getuser(String email) {
            User user = userRepository.getuser(email);
            OldUser oldUser = oldUserService.getUser(user.id);
            user.username = oldUser.username;
            user.lastName = oldUser.LastName;
            return user;
        }
    }

    public void adapterDemo() {
        UserService userService = new UserServiceAdapter();
        User user = userService.getuser("aaaaa@bbb.com");
        System.out.println(user);
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.adapterDemo();
    }
}
