package com.dxc.insurance;

public class TooYoungException extends Exception 
{
		private static final long serialVersionUID = 1L;
		public TooYoungException(String message) {
			super(message);
		}
}
