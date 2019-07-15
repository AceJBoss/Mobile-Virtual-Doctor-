package com.kisconsult.ismummy.virtualdoctor.App;

public class EndPoints {
    public static final String BASE_URL = "https://ajaniyemi.000webhostapp.com/vDoctor/vDoctor/v1";
    public static final String IMG_BASE_URL = BASE_URL.replace("v1", "");
    public static final String USER_LOGIN = BASE_URL + "/user/login";
    public static final String USER_REGISTER = BASE_URL + "/user/register";
    public static final String GET_USERS = BASE_URL + "/users/_ID_/profile";
    public static final String GET_COMPLAIN = BASE_URL + "/users/_ID_/complain";
    public static final String ADD_COMPLAIN = BASE_URL + "/user/complain";
    public static final String UPDATE_PROFILE = BASE_URL + "/user/_ID_/updateProfile";
    public static final String GET_USER_COMPLAIN = BASE_URL + "/user/_ID_/complain";
    public static final String TREAT_COMPLAIN = BASE_URL + "/user/_ID_/updateComplain";
}
