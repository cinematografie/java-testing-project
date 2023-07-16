package api_testing_main;

public class RestAssuredConst {
    public static class TestWebsite {
        public static final String BASE_URL = "https://petstore.swagger.io/";
    }

    public static class TestEndpoints {
        public static final String UpdateOrAddPet = "#/pet";
        public static final String DoLogin = "#/user/loginUser";
        public static final String DoLogout = "#/user/logout";
        public static final String DoCreateUser = "v2/user";
    }
}