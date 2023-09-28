package com.solers.delivery.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//import com.solers.delivery.validator.NotEmpty;
import javax.validation.constraints.NotEmpty;

import com.solers.security.EncryptionUtils;

@Entity
@Table(name = "ftp_connection")
public class FtpConnection implements Serializable {

    /**
     * Serial UID
     */
    private static final long serialVersionUID = 1l;

    private Long id;

    private String username;

    private String password;

    private String directory;

    private String host;

    private String port;

    private boolean passive;
    
    private boolean implicit;

    public FtpConnection() {

    }

    public FtpConnection(FtpConnection conn) {
        setUsername(conn.getUsername());
        setPassword(conn.getPassword());
        setDirectory(conn.getDirectory());
        setHost(conn.getHost());
        setPort(conn.getPort());
        setPassive(conn.isPassive());
        setImplicit(conn.isImplicit());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "directory", nullable = false)
    @NotEmpty(message="{sbm.directory}")
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @Column(name = "host", nullable = false)
    @NotEmpty(message="{sbm.host}")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Column(name = "password", nullable = false)
    @NotEmpty(message="{sbm.password}")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "port", nullable = false)
    @NotEmpty(message="{sbm.port}")
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Column(name = "username", nullable = false)
    @NotEmpty(message="{sbm.username}")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "passive", nullable = false)
    public boolean isPassive() {
        return passive;
    }

    public void setPassive(boolean passive) {
        this.passive = passive;
    }
    
    @Column(name = "implicit")
    public boolean isImplicit() {
        return implicit;
    }

    public void setImplicit(boolean implicit) {
        this.implicit = implicit;
    }

    @Transient
    public String getPlainPassword() {
        return EncryptionUtils.decryptFromHex("gbs_key".toCharArray(), getPassword());
    }

    public void setPlainPassword(String p) {
        setPassword(EncryptionUtils.encryptAsHex("gbs_key".toCharArray(), p.getBytes()));
    }
}
