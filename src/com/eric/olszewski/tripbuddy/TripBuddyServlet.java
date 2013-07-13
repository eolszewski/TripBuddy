package com.eric.olszewski.tripbuddy;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TripBuddyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
