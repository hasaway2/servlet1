package com.icia.servlet1;

import lombok.*;

@Data
@AllArgsConstructor
public class Board {
	private Integer bno;
	private String title;
	private String writer;
	private String writeday;
	private Integer readcnt;
}
