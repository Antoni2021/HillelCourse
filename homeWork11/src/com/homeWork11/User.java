package com.homeWork11;

import lombok.*;

@AllArgsConstructor
@ToString
public class User {
    @Setter
    @Getter
    String name;
    @Setter
    @Getter
    int number;
}
