package com.Medicare.Controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseToken {

		String message;
		String Token;
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getToken() {
			return Token;
		}
		public void setToken(String token) {
			Token = token;
		}
}
