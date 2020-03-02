package cn.xpbootcamp.code_smell.$02_duplicated_code.distributed_same_fragments;

import lombok.Data;

@Data
public class Address {
    private String streetAddress;
    private int houseNumber;
    private String city;
    private String province;
    private String zipCode;
}
