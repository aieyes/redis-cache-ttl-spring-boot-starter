package com.github.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author WangChen
 * @since 2021-12-25 14:05
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Org implements Serializable {

    private String name;
}
