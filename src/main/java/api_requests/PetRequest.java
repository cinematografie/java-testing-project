package api_requests;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonDeserialize(builder = PetRequest.PetRequestBuilder.class)

public class PetRequest {

    public Integer id;
    public String name;
    public String status;

    //constructor
    public PetRequest(Integer id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public static class PetRequestBuilder {
            private Integer id;
            private String name;
            private String status;

            public PetRequestBuilder id(Integer id) {
                this.id = id;
                return this;
            }

            public PetRequestBuilder name(String name) {
                this.name = name;
                return this;
            }

            public PetRequestBuilder status(String status) {
                this.status = status;
                return this;
            }
            public PetRequest build() {
                return new PetRequest(id, name, status);
            }
        }

        public static PetRequestBuilder builder() {
            return new PetRequestBuilder();
        }
    }





















//    public static class PetRequestBuilder {
//        private PetRequestBuilder() {
//        }
//
//        public PetRequestBuilder id(Integer id) {
//            this.id = id;
//            return this;
//        }
//
//        public PetRequestBuilder category(PetResponse.Category category) {
//            this.category = category;
//            return this;
//        }
//
//        public PetRequestBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public PetRequestBuilder photoUrls(List<String> photoUrls) {
//            this.photoUrls = photoUrls;
//            return this;
//        }
//
//        public PetRequestBuilder tags(List<Tags> tags) {
//            this.tags = tags;
//            return this;
//        }
//
//        public PetRequestBuilder status(String status) {
//            this.status = status;
//            return this;
//        }
//
//        public PetRequest build() {
//            return new PetRequest(this.id, this.category, this.name, this.photoUrls, this.tags, this.status);
//        }
//
//        private void PetRequest(PetRequestBuilder builder) {
//            this.id = builder.id;
//            this.category = builder.category;
//            this.name = builder.name;
//            this.photoUrls = builder.photoUrls;
//            this.tags = builder.tags;
//            this.status = builder.status;
//        }
//}

