package pattern.creational.builder;

import lombok.*;

@Data
@ToString
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

    private Long id;

    private String name;

    public static User.Builder builder(){
        return new User.Builder();
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name;
    }

    public static class Builder {

        User user = new User();

        public Builder id(Long id) {
            user.id = id;
            return this;
        }

        public Builder name(String name) {
            user.name = name;
            return this;
        }

        public User build() {
            return user;
        }

    }

}
