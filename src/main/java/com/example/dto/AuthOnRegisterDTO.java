package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * registration dto
 *
 * @author xie.wei
 * @date created at 2021-11-16 10:56
 */
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class AuthOnRegisterDTO extends BaseDTO {
    @JsonProperty("peer_addr")
    private String peerAddr;

    @JsonProperty("peer_port")
    private int peerPort;

    @NotBlank(message = "password can not be blank")
    private String password;

    @JsonProperty("clean_session")
    private boolean cleanSession;
}
