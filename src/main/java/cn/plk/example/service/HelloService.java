/**
 * 
 */
package cn.plk.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.plk.example.domain.MyInfo;

/**
 * @author {康培亮/AB052634}
 *
 */
@Service
public class HelloService {

	@Autowired
	private MyInfo myInfo;
	
	public String getName() {
		return myInfo.getName();
	}

}
