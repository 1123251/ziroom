package com.yt.ziroom.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Tenant {
    @JsonProperty("tid")
    private int tid;
    @JsonProperty("tNickname")
    private String tNickname;
    @JsonProperty("tPhone")
    private String tPhone;
    @JsonProperty("tEmail")
    private String tEmail;
    @JsonProperty("tPassword")
    private String tPassword;

}
