package com.zhoushiya.mybatismutidatasource.generator.testdb2.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhoushiya
 * @since 2020-05-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Reader implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;


}
