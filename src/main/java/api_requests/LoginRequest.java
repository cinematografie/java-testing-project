package api_requests;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonDeserialize(builder = LoginRequest.LoginRequestBuilder.class)

public class LoginRequest {
    public String username;
    public String password;

    //constructor
    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static class LoginRequestBuilder {
        private String username;
        private String password;

        public LoginRequestBuilder username(String username) {
            this.username = username;
            return this;
        }

        public LoginRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public LoginRequest build() {
            return new LoginRequest(username, password);
        }
    }

    public static LoginRequestBuilder builder() {
        return new LoginRequestBuilder();
    }
}
