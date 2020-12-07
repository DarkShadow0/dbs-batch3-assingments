package com.demo.spring;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SenderController {
	@Autowired
	JmsTemplate jmsTemplate;
	@PostMapping("/result")
	public ModelAndView processReq(@RequestParam("message") String msg) {
		
			ModelAndView mv = new ModelAndView();
			mv.addObject("msg",msg);
			mv.setViewName("result");
			System.out.println(msg);
			//ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
			//JmsTemplate jmsTemplate = ctx.getBean(JmsTemplate.class);
			
			jmsTemplate.send(new MessageCreator() {

				public Message createMessage(Session session) throws JMSException {
					
					TextMessage msg1 = session.createTextMessage();
					msg1.setText(msg);
					
					return msg1;
				}
			});
			//ctx.close();
			
			return mv;
	}
}
