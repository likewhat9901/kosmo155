package Test01;

//@Entity
//@Table(name = "users")
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false, unique = true)
    private String username;

//    @Column(nullable = false)
    private String password;

//    @Column(nullable = false)
    private String email;
}

