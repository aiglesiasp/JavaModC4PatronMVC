package com.aiglesiasp.mvc.JavaModC4PatronMVC;

import java.awt.EventQueue;

import com.aiglesiasp.mvc.JavaModC4PatronMVC.controllers.WelcomeController;
import com.aiglesiasp.mvc.JavaModC4PatronMVC.views.WelcomeView;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    public static void main( String[] args )
    {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeView wView = new WelcomeView();
					WelcomeController wController = new WelcomeController(wView);
					wController.initView();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
