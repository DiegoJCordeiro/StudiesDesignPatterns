package br.com.diegocordeiro.patterns.behavior.chain.models;

public class PhoneNumber {

    private final Integer code;

    private final Integer ddd;

    private final String number;

    private PhoneNumber(Integer code, Integer ddd, String number){
        this.code = code;
        this.ddd = ddd;
        this.number = number;
    }

    public Integer getCode() {
        return code;
    }

    public Integer getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }

    public static class Builder {

        private Integer code;

        private Integer ddd;

        private String number;
        public Builder(){

        }

        public Builder withCode(Integer code){
            this.code = code;
            return this;
        }

        public Builder withDdd(Integer ddd){
            this.ddd = ddd;
            return this;
        }

        public Builder withNumber(String number){
            this.number = number;
            return this;
        }

        public PhoneNumber build(){

            return new PhoneNumber(this.code, this.ddd, this.number);
        }
    }
}
