package com.revature.ems.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Email {
	
		@Autowired
		private To to;
		@Autowired
		private From from;
		@Autowired(required = false)
		private Subject subject;
		@Autowired(required = false)
		private Body body;
		
		public Email() {
			// TODO Auto-generated constructor stub
		}

		public To getTo() {
			return to;
		}

		public void setTo(To to) {
			this.to = to;
		}

		public From getFrom() {
			return from;
		}

		public void setFrom(From from) {
			this.from = from;
		}

		public Subject getSubject() {
			return subject;
		}

		public void setSubject(Subject subject) {
			this.subject = subject;
		}

		public Body getBody() {
			return body;
		}

		public void setBody(Body body) {
			this.body = body;
		}

		public Email(To to, From from, Subject subject, Body body) {
			this.to = to;
			this.from = from;
			this.subject = subject;
			this.body = body;
		}

		@Override
		public String toString() {
			return "Email [to=" + to + ", from=" + from + ", subject=" + subject + ", body=" + body + "]";
		}
		
		
}
