package com.demo.jwtauthserver.model.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import com.demo.jwtauthserver.model.Role;
import com.demo.jwtauthserver.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "usersTable")
public class User implements Serializable {

    @DynamoDBHashKey(attributeName = "login")
    private String login;

    @DynamoDBAttribute
    private String password;

    @DynamoDBAttribute
    @DynamoDBTypeConvertedEnum
    private Role role;

    @DynamoDBAttribute
    @DynamoDBTypeConvertedEnum
    private Status status;
}