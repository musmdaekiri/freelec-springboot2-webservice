package com.jojoldu.book.springboot.web.dto;

import static org.assertj.core.api.Assertions.*;

public class HelloResponseDtoTest {

    public void 롬복_기능_테스트() {

        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
