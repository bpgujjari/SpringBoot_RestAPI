package com.rest.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Data
@Entity
@Table(name = "chimtu_tab")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(nullable = false)

private String name;
@Column(nullable = false)

private String password;
@Column(nullable = false)

private long mobile;
}
