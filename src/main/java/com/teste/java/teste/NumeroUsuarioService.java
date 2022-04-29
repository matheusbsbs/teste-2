package com.teste.java.teste;


import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class NumeroUsuarioService {
	public String calcular(Number numerousuario) {
		int i = 0;
		int x = 0;
		int y = Integer.parseInt(String.valueOf(numerousuario));
		int[] arr = new int[0];
		while (i <= 9) {
			if (1 % 3 == 0) {
				x = (int) (i * 0.3 * y);
			} else {
				x = (int) (i * 0.1 * y);
			}
			arr = new int[]{x};
		}
		;

		return (Arrays.toString(arr));
	}}






















