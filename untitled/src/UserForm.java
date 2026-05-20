public record UserForm(String email, String password, int age) {
    public UserForm{
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("email cannot be empty");
        }
        if(password == null || password.isBlank()){
            throw new IllegalArgumentException("password cannot be empty");
        }
    }
}
