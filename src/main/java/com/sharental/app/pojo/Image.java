package com.sharental.app.pojo;


import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    String imageUrl;

    String originalImageUrl;

    String ldpiImageUrl;

    String mdpiImageUrl;

    String hdpiImageUrl;

}
