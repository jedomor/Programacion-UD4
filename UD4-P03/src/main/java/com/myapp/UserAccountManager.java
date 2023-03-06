package com.myapp;
//Edo Moreno, Joan. DAW1-A
//Importamos las utilidades de java (para evitar que nos falte alguna usaremos el * que vale para todas)

import java.util.*;

public class UserAccountManager {

    //Diccionario de registered users, almacena a los usuarios y los vincula con sus emails
    private Map<String, User> registeredUsers;
    //Conjunto de logged users, en este conjunto almacenaremos a los usuarios que ya están loggeados
    private Set<User> loggedUsers;

    //Constructor sin parámetros pero que inicializa el diccionario y el conjunto
    public UserAccountManager() {
        registeredUsers = new HashMap<>();
        loggedUsers = new HashSet<>();
    }

    //Public Boolean que crea a un usuario, 
    //Primero comprobaremos la existencia del email
    //si los parámetros introducidos no contienen @ devolverá un mensaje de error y devolverá FALSE.
    //si la contraseña no contiene al menos 8 caracteres devolverá otro mensaje de error y devolverá FALSE.
    //si ya existe el usuario devolverá otro mensaje de error indicando que el usuario ya existe y devolverá FALSE.
    //si las condiciones son correctas este creará un usuario, lo almacenará y devolverá TRUE.
    public boolean createUser(String email, String password, String name) throws EmailException, PasswordException, NameException {
        boolean validUser = true;
        if (registeredUsers.containsKey(email)) {
            System.out.println("ERROR: USER EMAIL ALREADY EXISTS");
            validUser = false;
            throw new EmailException("Error: User email already exists");
        } else if (!email.contains("@")) {
            System.out.println("ERROR: USER EMAIL IS NOT A VALID MAIL (DOESN'T CONTAIN @)");
            validUser = false;
            throw new EmailException("Error: Email doesn't contain @");
        } else if (password.length() < 8) {
            System.out.println("ERROR: USER PASSWORD IS SHORTER THAN 8 CHARACTERS");
            validUser = false;
            throw new PasswordException("Error: Password is shorter than 8 characters");
        } else if (registeredUsers.containsValue(name)) {
            System.out.println("ERROR: USER WAS ALREADY A REGISTERED USER");
            validUser = false;
            throw new NameException("Error: User already registered");
        } else {
            registeredUsers.put(email, new User(name, email, password.hashCode()));
            System.out.println("USER: " + name + " WITH EMAIL: " + email + " WITH PASS: " + password + " REGISTERED SUCCESFULLY");
            validUser = true;
        }
        return validUser;
    }

    //Public Boolean que intentará loggear un usuario
    //si los parámetros introducidos no contienen un email almacenado se imprimirá un mensaje de error y devolverá FALSE.
    //si el usuario ya había loggeado se imprimirá un mensaje de error y devolverá FALSE.
    //si la contraseña no está almacenada en el HASH SET de hashedPassword se imprimirá un mensaje de error y devolverá FALSE.
    //si las condiciones son correctas este quedará loggeado, se va a agregara al conjunto de usuarios loggeados y devolverá TRUE.
    boolean tryLoginUser(String email, String password) {
        boolean loggedIn = false;
        User usr = registeredUsers.get(email);

        if (!registeredUsers.containsKey(email)) {
            System.out.println("ERROR: USER EMAIL REGISTERED OR WRONG");
            loggedIn = false;
        } else if (password.hashCode() != usr.getHashedPassword()) {
            System.out.println("ERROR: USER PASSWORD NOT MATCH THE ONE PROVIDED");
            loggedIn = false;
        } else if (loggedUsers.contains(usr)) {
            System.out.println("ERROR: USER ALREADY LOGGED IN");
            loggedIn = false;
        } else {
            loggedUsers.add(usr);
            loggedIn = true;
        }
        return loggedIn;
    }

//Public Boolean que intentará desloggear un usuario
//se usan las mismas condiciones para controlar la existencia de usuario. (excepto la contraseña)
//si el usuario no estaba loggueado se imprimirá un mensaje de error y devolverá FALSE.
//si las condiciones son correctas este se desloggeara, se le saca del conjunto de usuarios loggeados y devolverá TRUE.
    boolean tryLogoutUser(String email) {
        boolean loggedOut = false;
        User usr = registeredUsers.get(email);

        if (!registeredUsers.containsKey(email)) {
            System.out.println("ERROR: USER EMAIL UNREGISTERED OR WRONG");
            loggedOut = false;
        } else if (!loggedUsers.contains(usr)) {
            System.out.println("ERROR: USER WAS NOT LOGGED IN");
            loggedOut = false;
        } else {
            loggedUsers.remove(usr);
            loggedOut = true;
        }
        return loggedOut;
    }

    //Public Void (listUserAccounts) que nos dará toda la lista de usuarios registrados (registeredUsers)
    //Recorreremos la lista (diccionario) mediante un iterador
    //Se imprimirá la lista aprovechando el toString de la clase user.
    //en caso de no existir ningun usuario devolveremos un mensaje aclarando que no hay usuarios
    public void listUserAccounts() {
        Iterator iterUserAccount = registeredUsers.keySet().iterator();
        if (!registeredUsers.isEmpty()) {
            System.out.println("REGISTERED USERS LIST: ");
            while (iterUserAccount.hasNext()) {
                System.out.println(registeredUsers.get(iterUserAccount.next()).toString());
            }
        } else {
            System.out.println("ERROR: NO USERS REGISTERED");
        }
    }

    //Public Void (listLoggedUsers) que nos dará toda la lista de usuarios loggeados (loggedUsers)
    //Recorreremos la lista (conjunto) mediante un iterador
    //Se imprimirá la lista aprovechando el toString de la clase user.
    //en caso de no existir ningun usuario loggeado devolveremos un mensaje aclarando que no hay usuarios loggeados
    public void listLoggedUsers() {
        Iterator iterLoggedUsers = loggedUsers.iterator();
        if (!loggedUsers.isEmpty()) {
            System.out.println("LOGGED USERS LIST: ");
            while (iterLoggedUsers.hasNext()) {
                System.out.println(iterLoggedUsers.next().toString());
            }
        } else {
            System.out.println("ERROR: NO USERS LOGGED IN");
        }
    }

    //Public void (run) que nos desplegará una lista de opciones que ejecutaran los metodos anteriores
    public void run() throws EmailException, PasswordException, NameException {
        Scanner op = new Scanner(System.in);
        int option;
        String mail, name, pass;
        do {
            System.out.println("CHOOSE AN OPTION:");
            System.out.println("1 - Create a user account");
            System.out.println("2 - User login");
            System.out.println("3 - User logout");
            System.out.println("4 - List of user accounts");
            System.out.println("5 - List of logged users");
            System.out.println("6 – Exit");
            option = op.nextInt();
            op.nextLine();
            switch (option) {
                case 1:
                    System.out.println("ENTER A VALID EMAIL:");
                    mail = op.nextLine();
                    System.out.println("ENTER A VALID USERNAME");
                    name = op.nextLine();
                    System.out.println("ENTER A VALID PASSWORD");
                    pass = op.nextLine();
                    if (createUser(mail, pass, name)) {
                        System.out.println("ACCOUNT CREATED");
                    }
                    break;
                case 2:
                    System.out.println("ENTER A VALID EMAIL:");
                    mail = op.nextLine();
                    System.out.println("ENTER A VALID PASSWORD");
                    pass = op.nextLine();
                    if (tryLoginUser(mail, pass)) {
                        System.out.println("SUCCESFULLY LOGGED IN");
                    }
                    break;
                case 3:
                    System.out.println("ENTER A VALID EMAIL:");
                    mail = op.nextLine();
                    if (tryLogoutUser(mail)) {
                        System.out.println("SUCCESFULLY LOGGED OUT");
                    }
                    break;
                case 4:
                    listUserAccounts();
                    break;
                case 5:
                    listLoggedUsers();
                    break;
                case 6:
                    System.out.println("EXITING USER ACCOUNT MANAGER");
                    break;
                default:
                    System.out.println("ERROR : NOT A VALID OPTION");
            }
        } while (option != 6);
    }
    //Final de la clase
}
